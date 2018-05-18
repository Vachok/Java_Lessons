package net.sosket.server;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



public class Main {
   
   public static void main(String[] args) throws Exception {
      
      try(ServerSocket serverSocket = new ServerSocket(8181)){
         while(true){
            Socket socket = serverSocket.accept();
            new Thread(new MyServer(socket)).start();
         }
      }
   } // создали серверный сокет, который бесконечно принимает запросы
}


class MyServer implements Runnable {
   
   Socket socket;
   public MyServer(Socket socket) {
      
      this.socket = socket;
   }
   @Override
   public void run() {
      
      try(Scanner scanner = new Scanner(socket.getInputStream());PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true)){
         if(scanner.hasNextLine()) {
            printWriter.println("Я ответил: " + scanner.nextLine());
         }
      }
      catch(IOException e){
         e.printStackTrace();
      }
   }
}

/*
Пишем серверную программу.
Она открывает порт 8181
Слушает что скажут.
Это примитивнейший способ обработки.
"Что взял то и отдал"
* */

// https://goo.gl/GJRqay Так не делают