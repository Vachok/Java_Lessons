import javax.annotation.Resource;


public class Main {

    public static void main( String[] args ) {
        Resource resource = new Resource();
        resource.setI(5);
        MyThread mythread = new MyThread();
    }
}



class MyThread extends Thread {

    Resource resource;


    @Override
    public void run() {
        resource.changeI();
    }
}



class Resource {

    private int i;


    public int getI() {
        return i;
    }


    public synchronized void setI( int i ) {
        this.i = i;
    }


    public synchronized void changeI() {
        int i = this.i;
    }
}