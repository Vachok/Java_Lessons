

public class Main {

    public static void main( String[] args ) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());
    }
}



class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.print("this is new thread");
        domeMethod();
    }


    private void domeMethod() {
        throw new RuntimeException();
    }
}
