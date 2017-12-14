

public class Main {
    public static void main(String[] args ) throws Exception {
        Resource resource = new Resource();
        resource.i = 5;
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.setResource(resource);
        myThread2.setResource(resource);
        myThread.start();
        myThread2.start();
        myThread.join();
        myThread2.join();
        System.out.println(resource.i);
    }
}

class MyThread extends Thread {
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }
    @Override
    public void run() {
    }
}

class Resource {
    int i;

    public void changeI() {
        int i = this.i;
        i++;
        this.i = i;
    }
}
