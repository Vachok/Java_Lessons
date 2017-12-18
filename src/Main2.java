import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class Main2 {
   Lock lock = new ReentrantLock();
   Condition condition = lock.newCondition();
   public static void main(String[] args) {

   }
}
// at 18.12.2017 (11:22)