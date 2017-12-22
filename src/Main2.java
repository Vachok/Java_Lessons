import java.util.concurrent.BlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;


@SuppressWarnings ("ALL")
public class Main2 {
   public static void main(String[] args) {
      
      BlockingDeque<String> queue = new PriorityBlockingQueue<>();
      
      new Thread() {
         @Override
         public void run() {
            
            try {
               System.out.println(queue.take());
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
      }.start();
      new Thread() {
         @Override
         public void run() {
            
            queue.add("this is string");
         }
      }.start();
   }
}