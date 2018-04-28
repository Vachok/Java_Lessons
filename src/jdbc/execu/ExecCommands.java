package jdbc.execu;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class ExecCommands {
   
   public static void main(String[] args) throws Exception {
      
      String userName = "root";
      String password = "1111";
      String connectionUrl = "jdbc:mysql://localhost:3306/lesson";
      Class.forName("com.mysql.jdbc.Driver");
      try(Connection connection = DriverManager.getConnection(connectionUrl, userName, password);Statement statement = connection.createStatement()){
         statement.executeUpdate("drop table Books");
         statement.executeUpdate("create table if not exists Books (id MEDIUMINT not null auto_increment, name VARCHAR(30) not null, primary key(id))");
         statement.executeUpdate("insert into Books (name) values('Inferno')");
         statement.executeUpdate("insert into Books set name = 'Solomon key'");
         ResultSet resultSet = statement.executeQuery("select * from Books");
         while(resultSet.next()){ //https://goo.gl/eS11ah
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString(2));
            System.out.println("-----------------------------");
         }
         System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
         ResultSet resultSet1 = statement.executeQuery("select name from Books where id = 1");
         while(resultSet1.next()){ // https://goo.gl/BnKJEP
            System.out.println(resultSet1.getString(1));
         }
      }
   }
}

/*
JDBC
Есть 3 основных класса
- Connection соединяет с БД
- Statement выполняет запросы
- ResultSet отдаёт результаты

Они единые, независимо от типа БД
* */