package jdbc.updateresult;



import java.sql.*;



public class UpResSet {
   
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
         
         Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         // То же самое, но в preparedStatement
//         PreparedStatement preparedStatement = conn.prepareStatement("", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         ResultSet resultSet = statement.executeQuery("select * from Books");
         while(resultSet.next()){
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
         }
         System.out.println("--------------------------------------------");
         
         resultSet.last();
         resultSet.updateString("name", "SSSR"); // jdbc/updateresult/books.csv
         resultSet.updateRow();
         
         resultSet.moveToInsertRow();
         resultSet.updateString("name", "inserted row");
         resultSet.insertRow();
         
         resultSet.absolute(2);
         resultSet.deleteRow();
         
         resultSet.beforeFirst();
         while(resultSet.next()){
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
         }
      }
   }
}


/*
ResultSet'ом можно добавлять, удалять и изменять наддые "на лету"
Значения будут сразу отображаться в БД

https://goo.gl/TVmWBe   UpResSet.java простой вывод
https://goo.gl/pwDmmY   Обновление "на лету"
https://goo.gl/i79eA8
*/
