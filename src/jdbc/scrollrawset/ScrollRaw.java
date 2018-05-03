package jdbc.scrollrawset;



import java.sql.*;



public class ScrollRaw {
   
   public static void main(String[] args) throws Exception {
      
      String userName = "root";
      String password = "1111";
      String connectionUrl = "jdbc:mysql://localhost:3306/lesson";
      Class.forName("com.mysql.jdbc.Driver");
      try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);Statement stat = conn.createStatement()){
         //stat.executeUpdate("drop table if exists Books"); //Error Code: 3012 EXPLAIN FOR CONNECTION command is supported only for SELECT/UPDATE/INSERT/DELETE/REPLACE
         stat.executeUpdate("create table if not exists Books (id MEDIUMINT not null auto_increment, name VARCHAR(30) not null, primary key(id))");
         stat.executeUpdate("insert into Books (name) values('Inferno')");
         stat.executeUpdate("insert into Books (name) values('DaVinci Code')");
         stat.executeUpdate("insert into Books (name) values('Solomon key')");
         
         Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//         PreparedStatement preparedStatement = conn.prepareStatement("", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); - тоже самое, но с PreparedStatement
         ResultSet resultSet = statement.executeQuery("select * from Books");
         if(resultSet.next()) System.out.println(resultSet.getString("name"));
         if(resultSet.next()) System.out.println(resultSet.getString("name"));
         if(resultSet.previous()) {
            System.out.println(resultSet.getString("name")); // https://goo.gl/q7fMgF бегаем по-базе вверх-вниз
         }
         if(resultSet.relative(2)) {
            System.out.println(resultSet.getString("name"));
         }
         if(resultSet.relative(-2)) {
            System.out.println(resultSet.getString("name")); // https://goo.gl/wDUudj бегаем по-базе через 2 строки
         }
         //badly https://goo.gl/J5L5BC
         if(resultSet.absolute(2)) {
            System.out.println(resultSet.getString("name")); // https://goo.gl/SRBQDg бегаем на 2ю строчку
         }
         if(resultSet.first()) {
            System.out.println(resultSet.getString("name")); // первая запись
         }
         if(resultSet.last()) {
            System.out.println(resultSet.getString("name")); // последнияя запись
         }
      }
      
   }
}
