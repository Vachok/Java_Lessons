package jdbc.seven;



import java.sql.*;



public class InjPrepStat {
   
   public static void main(String[] args) throws Exception {
      
      String userName = "root";
      String password = "1111";
      String connectionUrl = "jdbc:mysql://localhost:3306/lesson";
      Class.forName("com.mysql.jdbc.Driver");
      try(Connection connection = DriverManager.getConnection(connectionUrl, userName, password);Statement statement = connection.createStatement()){
         //    statement.execute("drop table Users");
         statement.executeUpdate("create table if not exists Users (id MEDIUMINT not null auto_increment, name CHAR(30) not null, password CHAR(30) not null, primary key(id))");
         statement.executeUpdate("insert into Users (name, password) values('Vachok', '123')");
         statement.executeUpdate("insert into Users set name = 'otherGuy', password = '321' ");
         
         String userId = "1";
/*
         String userId = "1' or 1 = '1";
         ResultSet resultSet = statement.executeQuery("select * from Users where id = '" + userId + "' ");
         while(resultSet.next()){
            System.out.println("username: " + resultSet.getString("name"));
            System.out.println("pass: " + resultSet.getString("password")); // https://goo.gl/C9zhCH
         }*/
         PreparedStatement preparedStatement = connection.prepareStatement("select * from Users where id = ?");
         preparedStatement.setString(1, userId);
         ResultSet resultSet = preparedStatement.executeQuery();
         while(resultSet.next()){
            System.out.println("username: " + resultSet.getString("name"));
            System.out.println("pass: " + resultSet.getString("password")); // https://goo.gl/8tBKZE
         }
      }
   }
}

// https://goo.gl/g85Wau Пробуем инъекцию для PreparedStatement
// https://goo.gl/a6TkeV PreparedStatement
// https://goo.gl/J4EGFe SQL INJECT
// https://goo.gl/RcRfGc До INJECTION
