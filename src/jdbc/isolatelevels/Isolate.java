package jdbc.isolatelevels;



import java.sql.*;



public class Isolate {
   
   static String userName = "root";
   static String password = "1111";
   static String connectionUrl = "jdbc:mysql://localhost:3306/lesson?autoReconnect=true&relaxAutoCommit=true";
   
   public static void main(String[] args) throws Exception {
      
      try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);Statement stmt = conn.createStatement()){
         conn.setAutoCommit(false);
         conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
         ResultSet resultSet = stmt.executeQuery("select count(*) from Books");
         while(resultSet.next()){
            System.out.println(resultSet.getInt(1));
         }
         new OtherTransaction().start();
         Thread.sleep(2000);
         ResultSet resultSet2 = stmt.executeQuery("select count(*) from Books");
         while(resultSet2.next()){
            System.err.println(resultSet2.getInt(1));
         }
      }
   }
   
   static class OtherTransaction extends Thread {
      
      @Override
      public void run() {
         
         try(Connection conn = DriverManager.getConnection(Isolate.connectionUrl, Isolate.userName, Isolate.password);Statement stmt = conn.createStatement()){
            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            stmt.executeUpdate("insert into Books (name) values ('new value')");
            conn.commit();
         }
         catch(SQLException e){
            e.printStackTrace();
         }
      }
   }
}

/* Phantom read
Когда до завершения транзакции, другая вставляет данные
https://goo.gl/hbdfM6
https://goo.gl/z2nAuU - TRANSACTION_SERIALIZABLE
* */


/* Non-Repeatable Read
Когда до завершения одной транзакции, другая записывает какие-то данные
https://goo.gl/n7PKVk - обычный режим
https://goo.gl/zqq3u9 - при уровне изоляции TRANSACTION_REPEATABLE_READ

//badly https://goo.gl/i9jYBP   Operation not allowed after ResultSet closed
* */

/* Dirty READ
https://goo.gl/zjBdQQ
Когда один процесс читает из базы ДО завершения commitа от другого процесса
В данном случае jdbc.isolatelevels.Isolate.OtherTransaction читает до того,
пока будет завершён jdbc.isolatelevels.Isolate.main
* */