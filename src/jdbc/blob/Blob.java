package jdbc.blob;



import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.OutputStream;
import java.sql.*;



public class Blob {
   
   public static void main(String[] args) throws Exception {
      
      String userName = "root";
      String password = "1111";
      String connectionUrl = "jdbc:mysql://localhost:3306/lesson";
      Class.forName("com.mysql.jdbc.Driver");
      try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);Statement stat = conn.createStatement()){
         stat.execute("drop table if exists Books");
         stat.executeUpdate("create table if not exists Books (id MEDIUMINT not null auto_increment, name VARCHAR(30) not null, img BLOB, primary key(id))");
   
         BufferedImage image = ImageIO.read(new File("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\20180129_210757.jpg"));
         java.sql.Blob blob = conn.createBlob();
         try(OutputStream outputStream = blob.setBinaryStream(1)){
            ImageIO.write(image, "jpg", outputStream);
         }
         PreparedStatement statement = conn.prepareStatement("insert into Books (name, img) values(?,?)");
         statement.setString(1, "Battery");
         statement.setBlob(2, blob);
         statement.execute(); // https://goo.gl/pnzDYR загрузка картинки в базу данных
   
         ResultSet resultSet = stat.executeQuery("select * from Books");
         while(resultSet.next()){
            java.sql.Blob blob2 = resultSet.getBlob("img");
            BufferedImage image1 = ImageIO.read(blob2.getBinaryStream());
            File outputFile = new File("saved.png");
            ImageIO.write(image1, "png", outputFile); // https://goo.gl/77Ufd8 охранение картинки в png
         }
      }
   }
}

/*
BLOB
Не отработал на файле более 1 МБ
В остальном, примерно как и с текстом.

{ Создание таблицы в БД
         stat.executeUpdate("create table if not exists Books (id MEDIUMINT not null auto_increment, name VARCHAR(30) not null, img BLOB, primary key(id))");
}

{ Создание OutputStream из файла на диске и преобразование в BLOB
         BufferedImage image = ImageIO.read(new File("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\20180129_210757.jpg"));
         java.sql.Blob blob = conn.createBlob();
         try(OutputStream outputStream = blob.setBinaryStream(1)){
            ImageIO.write(image, "jpg", outputStream);
}

{ Делаем PreparedStatement, и отправка его в БД
         PreparedStatement statement = conn.prepareStatement("insert into Books (name, img) values(?,?)");
         statement.setString(1, "Battery");
         statement.setBlob(2, blob);
         statement.execute(); // https://goo.gl/pnzDYR загрузка картинки в базу данных
}

{ Чтение BLOD из БД и запись на диск, в формате png с именем saved
         ResultSet resultSet = stat.executeQuery("select * from Books");
         while (resultSet.next()){
            java.sql.Blob blob2 = resultSet.getBlob("img");
            BufferedImage image1 = ImageIO.read(blob2.getBinaryStream());
            File outputFile = new File("saved.png");
            ImageIO.write(image1, "png", outputFile); // https://goo.gl/77Ufd8 охранение картинки в png
         }
* */