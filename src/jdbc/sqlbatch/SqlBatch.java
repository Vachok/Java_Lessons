package jdbc.sqlbatch;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class SqlBatch {
   
   public static void main(String[] args) throws Exception {
      
      String userName = "root";
      String password = "1111";
      String connectionUrl = "jdbc:mysql://localhost:3306/lesson";
      Class.forName("com.mysql.jdbc.Driver");
      try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);Statement stat = conn.createStatement()){
         //stat.executeUpdate("drop table if exists Books"); //Error Code: 3012 EXPLAIN FOR CONNECTION command is supported only for SELECT/UPDATE/INSERT/DELETE/REPLACE
         conn.setAutoCommit(false);
         stat.addBatch("create table if not exists Books (id MEDIUMINT not null auto_increment, name VARCHAR(30) not null, primary key(id))");
         stat.addBatch("insert into Books (name) values('Inferno')");
         stat.addBatch("insert into Books (name) values('DaVinci Code')");
         stat.addBatch("insert into Books (name) values('Solomon key')");
         if(stat.executeBatch().length==4) {
            conn.commit();
         }
         else{
            conn.rollback();
         }
      }
   }
}
