

public class Main {

    static int i;


    public static void main( String[] args ) throws Exception {
        for (int j = 0; j < 10000; j++) {
            new MyThread().start();
        }
        Thread.sleep(2000);
        System.out.println(i);
    }


    static class MyThread extends Thread {

        @Override
        public void run() {
            Main.i++;
        }
    }
}
