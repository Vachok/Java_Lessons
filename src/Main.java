/*public class Main {

   public static void main(String[] args) {
      MyThread myThread = new MyThread();
      myThread.start();
      try{
         myThread.join();
      }
      catch(InterruptedException e){
         e.printStackTrace();
      }
      System.out.println("thread main");
   }
}



class MyThread extends Thread {

   @Override
   public void run() {
      for(int i = 0; i < 50; i++){
         try{
            Thread.sleep(100);
         }
         catch(InterruptedException e){
            e.printStackTrace();
         }
         System.out.println(i);
      }
   }
}*/