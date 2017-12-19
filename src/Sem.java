import java.util.concurrent.CountDownLatch;



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