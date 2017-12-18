import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class Main2 {
   Lock lock = new ReentrantLock();
   Condition condition = lock.newCondition();
   static int account = 0;
   public static void main(String[] args) {
   }
   static class AccountPlus extends Thread {
      @Override
      public void run() {
         Main2.account += 10;
      }
   }

   static class AccountMinus extends Thread {
      @Override
      public void run() {
         System.out.println(Main2.account);
         Main2.account -= 10;
      }
   }
}
// at 18.12.2017 (11:22)