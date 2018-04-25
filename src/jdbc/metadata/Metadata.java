package jdbc.metadata;



import java.sql.*;



public class Metadata {
   
   public static void main(String[] args) throws Exception {
      
      String userName = "root";
      String password = "1111";
      String connectionUrl = "jdbc:mysql://localhost:3306/lesson";
      try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);Statement stat = conn.createStatement()){
         stat.executeUpdate("create table if not exists Books (id MEDIUMINT not null auto_increment, name VARCHAR(30) not null, primary key(id))");
         
         DatabaseMetaData databaseMetaData = conn.getMetaData();
//        0_0 databaseMetaData.nullPlusNonNullIsNull();
         ResultSet resultSet = databaseMetaData.getTables(null, null, null, new String[]{"Table"});
         while(resultSet.next()){
            System.out.println(resultSet.getString(3)); // https://goo.gl/gJafVk
         }
         
         System.out.println("-------------------------------------");
         
         ResultSet resultSet2 = stat.executeQuery("select * from Books");
         ResultSetMetaData resultSetMetaData = resultSet2.getMetaData();
         for(int i = 1;i < resultSetMetaData.getColumnCount();i++){
            System.out.println(resultSetMetaData.getColumnLabel(i));
            System.out.println(resultSetMetaData.getColumnType(i));
         }
         
      }
   }
}

/*
https://goo.gl/bwgNNw Выводим массу инфо о таблицах
* */