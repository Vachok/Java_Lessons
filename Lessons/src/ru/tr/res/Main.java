package ru.tr.res;



import com.sun.jdi.connect.spi.Connection;

import java.io.*;
import java.sql.ResultSet;
import java.sql.Statement;



public class Main {
   
   public static void main(String[] args) {
      
      try(MyClass myClass = new MyClass();Reader reader = new FileReader(new File(""))){
      }
      catch(FileNotFoundException e){
         e.printStackTrace();
      }
      catch(IOException e){
         e.printStackTrace();
      }
  /*    Основные AutoCloseable
      //streams
      Reader reader;
      Writer writer;
      InputStream inputStream;
      OutputStream outputStream;
      
      //jdbc
      Connection connection;
      Statement statement;
      ResultSet resultSet;*/
      
   }
   
   
   static class MyClass implements AutoCloseable {
      
      @Override
      public void close() {
      
      }
   }
}


// https://goo.gl/h3TRVg AutoClose MyClass  сократить код (try/catch)
// https://goo.gl/ZBNbGL в Java7 добавили. Можно вносить в 1 блок несколько ресурсов
// https://goo.gl/iyZwpT 1 строчка по чтению, превратилась в 12
// at 24.01.2018 (8:52)