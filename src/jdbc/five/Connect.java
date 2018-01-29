package jdbc.five;



import java.sql.Connection;
import java.sql.DriverManager;



public class Connect {
   
   public static void main(String[] args) throws Exception {
      
      String userName = "root";
      String password = "1111";
      String connectionUrl = "jdbc:mysql://localhost:3306/lesson";
      Class.forName("com.mysql.jdbc.Driver");
      try(Connection connection = DriverManager.getConnection(connectionUrl, userName, password)){
         System.out.println("Connected!"/*https://goo.gl/MAvcJo*/);
      }
   }
}

