

public class ThreadExample {

    public static void main( String[] args ) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();
        synchronized (threadB) {
            threadB.wait();
        }
        System.out.println(threadB.total);
    }


    static class ThreadB extends Thread {

        int total;


        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 500000; i++) {
                    total += i;
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                notify();
            }
        }
    }
}
