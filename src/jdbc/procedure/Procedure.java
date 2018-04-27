package jdbc.procedure;



import java.sql.*;



public class Procedure {
   
   public static void main(String[] args) throws Exception {
      
      String userName = "root";
      String password = "1111";
      String connectionUrl = "jdbc:mysql://localhost:3306/lesson";
      Class.forName("com.mysql.jdbc.Driver");
      try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);Statement statement = conn.createStatement()){
         //statement.executeUpdate("drop table if exists Books"); //Error Code: 3012 EXPLAIN FOR CONNECTION command is supported only for SELECT/UPDATE/INSERT/DELETE/REPLACE
         statement.executeUpdate("create table if not exists Books (id MEDIUMINT not null auto_increment, name VARCHAR(30) not null, primary key(id))");
         statement.executeUpdate("insert into Books (name) values('Inferno')");
         statement.executeUpdate("insert into Books set name = 'Solomon key'");
         /*Вызов процедуры (Вывод https://goo.gl/UAvL8z)
         объявляем callableStatement
         регистрируем выходное значение. переменная, из процедуры BooksCount с индексом 1 и типом Интежер
         запускаем
         jdbc/procedure/BooksCount.sql - сама процедура
         * */
         CallableStatement callableStatement = conn.prepareCall("{call BooksCount(?)}");
         callableStatement.registerOutParameter(1, Types.INTEGER);
         callableStatement.execute();
         System.out.println(callableStatement.getInt(1));
         System.out.println("________________________________________________-");
         /* Вызов процедуры с параметрами (Вывод https://goo.gl/1kpSU4)
         В этом вызове мы сетаем параметр bookId,
         чтобы база отдала объект с ID = 1.
         jdbc/procedure/getBooks.sql
          * */
         CallableStatement callableStatement2 = conn.prepareCall("{call getBooks(?)}");
         callableStatement2.setInt(1, 1);
         if(callableStatement2.execute()) {
            ResultSet resultSet = callableStatement2.getResultSet();
            while(resultSet.next()){
               System.out.println(resultSet.getInt("id"));
               System.out.println(resultSet.getString("name"));
            }
         }
      }
   }
}
