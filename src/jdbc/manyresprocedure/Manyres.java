package jdbc.manyresprocedure;



import java.sql.*;



public class Manyres {
   
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
         /* Вывод множественных результатов
         сначала, как обычно, мы создаём callableStatement
         потом делаем "проверочный" bool - hasResult
         потом делаем цикл.
         Пока hasResult правда, берём результат как ИНТ, и выводим.
         перегружаем hasResult! callableStatement.getMoreResults()
         * https://goo.gl/5Em4bz */
         CallableStatement callableStatement = conn.prepareCall("{call getCount()}");
         boolean hasResult = callableStatement.execute();
         while(hasResult){
            ResultSet resultSet = callableStatement.getResultSet();
            while(resultSet.next()){
               System.out.println(resultSet.getInt(1));
            }
            hasResult = callableStatement.getMoreResults();
         }
      }
   }
}
