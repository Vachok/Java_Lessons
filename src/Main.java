import java.util.concurrent.atomic.AtomicInteger;


public class Main {

    static AtomicInteger atomicInteger = new AtomicInteger(0);


    public static void main( String[] args ) throws Exception {
        for (int j = 0; j < 10000; j++) {
            new MyThread().start();
        }
        Thread.sleep(1000);
        System.out.println(atomicInteger.get());
    }


    static class MyThread extends Thread {

        @Override
        public void run() {
            Main.atomicInteger.incrementAndGet();
        }
    }
}