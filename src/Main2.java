import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class Main2 {
   static Lock lock = new ReentrantLock();
   public static void main(String[] args) {
      new Thread1().start();
   }
   static class Thread1 extends Thread {
      @Override
      public void run() {
         Main2.lock.lock();
         System.out.println(getName()+" start working...");
         try {
            Thread.sleep(50);
         }
         catch(InterruptedException e) {
            e.printStackTrace();
         }
         System.out.println(getName()+" ...stop working");
         Main2.lock.unlock();
         System.out.println(getName()+" lock is released");
      }
   }
}
// at 18.12.2017 (10:40)