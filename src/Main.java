<<<<<<< HEAD
import java.util.concurrent.ThreadFactory;


public class Main {
    public static void main(String[] args) {
        
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                
                Thread thread = new Thread(r);
                thread.setPriority(Thread.MAX_PRIORITY);
                return thread;
            }
        };
        threadFactory.newThread(new MyRun()).start();
    }
    static class MyRun implements Runnable {
        @Override
        public void run() {
            
            System.out.println(1);
        }
=======
public class Main {
    static long numOfOperation = 10_000_000_000_000L;
    public static void main(String[] args) {
        
        long j = 0;
        for(long i = 0;i < numOfOperation;i++){
            j += i
        } System.out.println(j);
>>>>>>> 3334a9f... Java_Lessons-143 Java 89: Многопоточность 24: ForkJoinFramework
    }
}



<<<<<<< HEAD
//23.12.2017(0:06)by{Vachok}
=======
//23.12.2017(10:39)by{Vachok}
>>>>>>> 3334a9f... Java_Lessons-143 Java 89: Многопоточность 24: ForkJoinFramework
