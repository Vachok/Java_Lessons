package jdbc.cachedrow;



import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;



public class CachedRS {
   
   static String userName = "root";
   static String password = "1111";
   static String connectionUrl = "jdbc:mysql://localhost:3306/lesson?autoReconnect=true&relaxAutoCommit=true";
   
   public static void main(String[] args) throws Exception {
      
      ResultSet resultSet = getData();
      while(resultSet.next()){
         System.out.println(resultSet.getInt("id"));
         System.out.println(resultSet.getString("name"));
      }
      
      CachedRowSet cachedRowSet = ( CachedRowSet ) resultSet;
      cachedRowSet.setTableName("Books");
      cachedRowSet.absolute(1);
      cachedRowSet.deleteRow();
      cachedRowSet.beforeFirst();
      while(cachedRowSet.next()){
         cachedRowSet.getInt("id");
         cachedRowSet.getString("name");
      }
      cachedRowSet.acceptChanges(DriverManager.getConnection(connectionUrl, userName, password));
   }
   static ResultSet getData() throws Exception {
      
      Class.forName("java.sql.Driver");
      try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);Statement stat = conn.createStatement()){
         //stat.executeUpdate("drop table if exists Books"); //Error Code: 3012 EXPLAIN FOR CONNECTION command is supported only for SELECT/UPDATE/INSERT/DELETE/REPLACE
         stat.executeUpdate("create table if not exists Books (id MEDIUMINT not null auto_increment, name VARCHAR(30) not null, primary key(id))");
         stat.executeUpdate("insert into Books (name) values('Inferno')");
         stat.executeUpdate("insert into Books (name) values('DaVinci Code')");
         stat.executeUpdate("insert into Books (name) values('Solomon key')");
         
         RowSetFactory factory = RowSetProvider.newFactory();
         CachedRowSet cachedRowSet = factory.createCachedRowSet();
         
         Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         ResultSet resultSet = statement.executeQuery("select * from Books");
         cachedRowSet.populate(resultSet);
         return cachedRowSet;
      }
   }
}

/* https://goo.gl/VFYnt3
cachedRowSet.setUrl(connectionUrl);
cachedRowSet.setUsername(userName);
cachedRowSet.setPassword(password);
cachedRowSet.setCommand("select * from Books where id = ?");
cachedRowSet.setInt(1,1);
cachedRowSet.setPageSize(20);
cachedRowSet.execute();
do{
      while(cachedRowSet.next()){
      System.out.println(cachedRowSet.getInt("id"));
      System.out.println(cachedRowSet.getString("name"));
      }
   }while(cachedRowSet.nextPage());*/

/*
https://goo.gl/CZXfwj Exception in thread "main"
Не заработаало, потому что cachedRowSet проверяет изменения в БД,
и требует connection-данных

Таким образом можно выбрать из кэша, если кэш прилетел огромный
//       CachedRowSet cachedRowSet = (CachedRowSet) resultSet;
//       cachedRowSet.setCommand("select * from Books where id = ?");
//       cachedRowSet.setInt(1,1);

https://goo.gl/2zK33o   Работает вот так
Создаётся спец. RawSet, в кэше. С ним уже можно работать "за пределами" метода

https://goo.gl/w5mL4c   Так работать не будет!
RS - постоянно держит соединение с БД.
При выходе в другой метод - соединение закрывается, и с RS работать уже нельзя
* */