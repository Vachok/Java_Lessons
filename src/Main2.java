import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class Main2 {
   static Lock lock = new ReentrantLock();
   static Condition condition = lock.newCondition();
   static int account = 0;
   public static void main(String[] args) {
      new AccountMinus().start();
      new AccountPlus().start();
   }
   static class AccountPlus extends Thread {
      @Override
      public void run() {
         Main2.account += 10;
         Main2.condition.signal();
      }
   }

   static class AccountMinus extends Thread {
      @Override
      public void run() {
         if(Main2.account < 10) {
            try {
               System.out.println("account = "+Main2.account);
               Main2.condition.await();
               System.out.println("account = "+Main2.account);
            }
            catch(InterruptedException e) {
               e.printStackTrace();
            }
         }
         Main2.account -= 10;
      }
   }
}
// at 18.12.2017 (11:22)