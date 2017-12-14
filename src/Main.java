

public class Main {

   public static void main(String[] args) {
      MyThread myThread = new MyThread();
      myThread.start();
      System.out.println("thread main");
   }
}



class MyThread extends Thread {

   @Override
   public void run() {
      System.out.println("thread 0");
   }
}