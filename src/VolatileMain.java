public class VolatileMain {

    volatile int i;


    public static void main( String[] args ) {
        new MyThreadRead().start();
        new MyThreadWrite().start();
    }


    static class MyThreadWrite extends Thread {

        @Override
        public void run() {

        }
    }



    static class MyThreadRead extends Thread {

        @Override
        public void run() {
\}
    }
}




//15.12.2017(16:51)by{Vachok}