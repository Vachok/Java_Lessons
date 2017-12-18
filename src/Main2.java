//127.80-Exrcutors
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// приложения выполняются в пуле потоков. для того, чтобы не создавать новых.

public class Main2 {
   public static void main(String[] args) throws ExecutionException, InterruptedException {
      ExecutorService executorService = Executors.newFixedThreadPool(2);
      executorService.submit(new MyRunnable());
      executorService.submit(new MyCallable());
      System.out.println(executorService.submit(new MyCallable()).get());
      executorService.shutdown();
   }
   static class MyRunnable implements Runnable {
      @Override
      public void run() {
         System.out.println(1);
      }
   }

   static class MyCallable implements Callable<String> {
      @Override
      public String call() {
         return "2";
      }
   }
}
// at 18.12.2017 (12:25)
=======
//125.76-cond
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
         Main2.lock.lock();
         Main2.account += 10;
         Main2.condition.signal();
         Main2.lock.unlock();
      }
   }

   static class AccountMinus extends Thread {
      @Override
      public void run() {
         if(Main2.account < 10) {
            try {
               Main2.lock.lock();
               System.out.println("account = "+Main2.account);
               Main2.condition.await();
               System.out.println("account = "+Main2.account);
               Main2.lock.unlock();
            }
            catch(InterruptedException e) {
               e.printStackTrace();
            }
         }
         Main2.account -= 10;
         System.out.println("account end = "+Main2.account);
      }
   }
}
// at 18.12.2017 (11:22)
=======
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*Trylock
можем пытаться получить состояние потока
и если он залочен - ждать, или же делать что-то другое
*/

public class Main2 {
   static Lock lock = new ReentrantLock();
   public static void main(String[] args) {
      new Thread1().start();
      new Thread2().start();
   }
   static class Thread1 extends Thread {
      @Override
      public void run() {
         Main2.lock.lock();
         System.out.println(getName()+" start working");
         try {
            Thread.sleep(50);
         }
         catch(InterruptedException e) {
            e.printStackTrace();
         }
         System.out.println(getName()+" stop working");
         Main2.lock.unlock();
         System.out.println(getName()+" lock is released");
      }
   }

   static class Thread2 extends Thread {
      @Override
      public void run() {
         System.out.println(getName()+" begin working");
         while(true) {
            if(Main2.lock.tryLock()) {
               System.out.println(getName()+" working");
               break;
            }
            else {
               System.out.println(getName()+" waiting...");
            }
         }
      }
   }
}
// at 18.12.2017 (10:40)

