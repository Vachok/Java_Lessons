

static class MyThread extends Thread {

    Resource resource;


    @Override
    public void run() {
        resource.changeI();
    }
}



public class Main {

    public static void main( String[] args ) throws Exception {
        Resource resource = new Resource();
        resource.i = 5;
        MyThread myThread = new MyThread();
        myThread.setName("one");
        MyThread myThread1 = new MyThread();
        myThread.resource = resource;
        myThread1.resource = resource;
        myThread.start();
        myThread1.start();
        myThread.join();
        myThread1.join();
        System.out.println(resource.i);
    }
}



class Resource {

    int i = this.i;


    void changeI() {
        int i = this.i;
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }
        i++;
        this.i = i;
    }
}
