package jdbc.dates;



import java.sql.*;
import java.util.Calendar;



public class Dates {
   
   public static void main(String[] args) throws Exception {
      
      String userName = "root";
      String password = "1111";
      String connectionUrl = "jdbc:mysql://localhost:3306/lesson";
      Class.forName("com.mysql.jdbc.Driver");
      try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);Statement stat = conn.createStatement()){
         //        stat.execute("drop table if exists Books");
         stat.executeUpdate("create table if not exists Books (id MEDIUMINT not null auto_increment, name VARCHAR(30) not null, dt DATE, primary key(id))");
         
         
         stat.executeUpdate("insert into Books(name , dt) values ('noPrepS', {d '2018-01-30'})");
         
         ResultSet resultSet = stat.executeQuery("select * from Books");
         while(resultSet.next()){
            System.out.println(resultSet.getDate("dt")); // https://goo.gl/cLvCLJ
         }
      }
   }
}

/*
Call Escape Sequence
то, что нужно для вызова процедур, хранимых в БД
\
При работе с датой и временем, желательно указывать ESCAPE-CHAR. В данном случае это d
d = Date
t = Time
ts = TimeStamp
         stat.executeUpdate("insert into Books(name , dt) values ('noPrepS', {d '2018-01-30'})");
 Этот код делает тоже самое, но через PreparedStatement
         PreparedStatement preparedStatement = conn.prepareStatement("insert into Books(name , dt) values ('nameMy', ?)");
         Long dateInMills = Calendar.getInstance().getTimeInMillis();
         preparedStatement.setDate(1, new Date(dateInMills));
         preparedStatement.execute();
         System.out.println(preparedStatement);*/

// https://goo.gl/wvqKkd ; jdbc/dates/MySQLWorkbench_2018-01-30_12-38-47.png