import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;



public class Main2 {
   public static void main(String[] args) {
      CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Run());
      new Run.Sportsman(cyclicBarrier);
      new Run.Sportsman(cyclicBarrier);
      new Run.Sportsman(cyclicBarrier);
   }
   static class Run extends Thread {
      CyclicBarrier barrier;
      @Override
      public void run() {
         System.out.println("Run is begun");
      }

      static class Sportsman extends Thread {
         CyclicBarrier barrier;
         public Sportsman(CyclicBarrier barrier) {
            this.barrier = barrier;
            start();
         }
         @Override
         public void run() {
            try {
               barrier.await();
            }
            catch(InterruptedException e) {
               e.printStackTrace();
            }
            catch(BrokenBarrierException e) {
               e.printStackTrace();
            }
         }
      }
   }

}
// at 19.12.2017 (15:06)