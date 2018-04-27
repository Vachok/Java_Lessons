//137.84-exchanger
import java.util.concurrent.Exchanger;





   public class Sem {
      public static void main(String[] args) {
         Exchanger<String> exchanger = new Exchanger<>();

         new Mike(exchanger);
         new Anket(exchanger);
      }
      static class Mike extends Thread {
         Exchanger<String> exchanger;


         public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
         }
         @Override
         public void run() {
            try {
               exchanger.exchange("Hi! I'm Mike");
               Thread.sleep(3000);
               exchanger.exchange("I'm 33");
            }
            catch(InterruptedException e) {
               e.printStackTrace();
            }
         }
      }

      static class Anket extends Thread {
         Exchanger<String> exchanger;

         public Anket(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
         }
         public void run() {
            try {
               System.out.println(exchanger.exchange(null));
               System.out.println(exchanger.exchange(null));
            }
            catch(InterruptedException e) {
               e.printStackTrace();
            }
         }
      }
   }
// at 19.12.2017 (13:23).
=======
//136.83-CountdnLatch
import java.util.concurrent.CountDownLatch;

/*
Счетчик, с помощью которого удобно можно ждать завершения потоков, n-раз.
 */

public class Sem {
   public static void main(String[] args) throws InterruptedException {
      CountDownLatch countDownLatch = new CountDownLatch(3);
      new Work(countDownLatch);
      new Work(countDownLatch);
      new Work(countDownLatch);
      countDownLatch.await();
      System.out.println("all done");
   }
}

class Work extends Thread {
   CountDownLatch countDownLatch;
   public Work(CountDownLatch countDownLatch) {
      this.countDownLatch = countDownLatch;
      start();
   }

   @Override
   public void run() {
      try {
         Thread.sleep(3000);
      }
      catch(InterruptedException e) {
         e.printStackTrace();
      }
      System.out.println("done");
      countDownLatch.countDown();
   }
}
// at 19.12.2017 (13:03)
=======
import java.util.concurrent.Semaphore;



public class Sem {
   public static void main(String[] args) {
      Semaphore table = new Semaphore(2);
      Person person = new Person();
      Person person2 = new Person();
      Person person3 = new Person();
      Person person4 = new Person();
      Person person5 = new Person();
      Person person6 = new Person();
      Person person7 = new Person();

      person.table = table;
      person2.table = table;
      person3.table = table;
      person4.table = table;
      person5.table = table;
      person6.table = table;
      person7.table = table;

      person.start();
      person2.start();
      person3.start();
      person4.start();
      person5.start();
      person6.start();
      person7.start();
   }
}

class Person extends Thread {
   Semaphore table;
   @Override
   public void run() {
      System.out.println(this.getName() + " waiting for table");
      try{
         table.acquire();
         System.out.println(this.getName() + " eat at the table");
         Thread.sleep(999);
         System.out.println(this.getName() + " release table");
         table.release();
      }
      catch(InterruptedException e){
         e.printStackTrace();
      }
   }
}
// at 18.12.2017 (14:54)
