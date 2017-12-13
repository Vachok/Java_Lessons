

public class Main {

    public static void main( String[] args ) {
        MyThread myThread = new MyThread();
        myThread.run();
        // myThread.start();
    }
}



class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            System.out.println("Thread name is " + Thread.currentThread().getName() + " i = " + i);
        }
        throw new RuntimeException();
    }
}
