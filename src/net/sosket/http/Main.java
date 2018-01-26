package net.sosket.http;



import javafx.scene.transform.Scale;

import javax.print.DocFlavor;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class Main {
   
   public static void main(String[] args) throws Exception {
      
      URLConnection connection = new URL("http://www.google.com").openConnection();
      Scanner scanner = new Scanner(connection.getInputStream());
      
      Map<String,List<String>> headerFields = connection.getHeaderFields();
      for(Map.Entry<String,List<String>> entry : headerFields.entrySet()){
         System.out.println(entry.getKey() + "/" + entry.getValue()); // https://goo.gl/bPvpGR
      }
   }
}

/*
URLConnection - надстройка над сокетами, для получения http
Она за меня уже формирует правильные запросы на сервер,
чтобы он отдавал мне HTML
* */


// https://goo.gl/hkaNkZ  Получение списка HEADERS из HTTP
// https://goo.gl/HUr98K получать http
