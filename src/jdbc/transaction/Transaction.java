package jdbc.transaction;
// https://youtu.be/NUfMe40y0BY

import java.sql.*;



public class Transaction {
   
   public static void main(String[] args) throws SQLException {
      
      String userName = "root";
      String password = "1111";
      String connectionUrl = "jdbc:mysql://localhost:3306/lesson";
      Connection conn = null;
      try{
         conn = DriverManager.getConnection(connectionUrl, userName, password);
         Statement stat = conn.createStatement();
         conn.setAutoCommit(false);
         stat.executeUpdate("create table if not exists Books (id MEDIUMINT not null auto_increment, name VARCHAR(30) not null, primary key(id))");
         
         stat.execute("insert into Books (name) VALUES ('Inf')");
         Savepoint savepoint = conn.setSavepoint();
         stat.execute("insert into Books (name) VALUES ('DV Code')");
         stat.execute("insert into Books (name) VALUES ('Solomon')");
         
         conn.rollback(savepoint);
         conn.commit();
         conn.releaseSavepoint(savepoint);
      }
      catch(SQLException e){
         conn.rollback();
      }
   }
}

/* Транзакция
это единая и неделимая последовательность запросов
Транзакция будет успешна, только по-выполнении своей последней команды
Пример кода, как обычно пишут.
 */
      /* rollback Transaction
      https://goo.gl/jP1wbW
      rollback - не отменяет операции с самими таблицами.
      создание, дроп и пр.
      Savepoint - точка отмены.
      Будет rollback только всего после него
      * */
