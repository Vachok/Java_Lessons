

public class Main {

   public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
      Thread.sleep(1000);
        System.out.println("thread main");
    }
}



class MyThread extends Thread {

    @Override
    public void run() {
       System.out.println("thread 0");
    }
}