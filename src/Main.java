


public class Main {

    public static void main( String[] args ) throws Exception {
        Resource.i = 5;
        Resource resource = new Resource();
        MyThread mythread = new MyThread();
        mythread.setName("one");
        MyThread mythread2 = new MyThread();
        mythread.start();
        mythread2.start();
        mythread.join();
        mythread2.join();
        System.out.println(Resource.i);
    }
}



class MyThread extends Thread {

    Resource resource;


    @Override
    public void run() {
        Resource.changeStaticI();
    }
}



class Resource {

    static int i;


    public synchronized static void changeStaticI() {
        int i = Resource.i;
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }
        i++;
        Resource.i = i;
    }
}
