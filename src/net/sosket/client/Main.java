package net.sosket.client;



import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;



public class Main {
   
   public static void main(String[] args) throws Exception {
      
      try(Socket socket = new Socket()){ // берем сокет
         socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 8181), 2000); // тут задаём его параметры
         Scanner scanner = new Scanner(socket.getInputStream()); // ловим ответ, который приходит в виде InputStream
         while(scanner.hasNext()){
            System.out.println(scanner.nextLine()); // https://goo.gl/SWucx7
         }
      }
   }
}
