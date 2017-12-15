public class VolatileMain {

    static int i;


    public static void main( String[] args ) {
        new MyThreadRead().start();
        new MyThreadWrite().start();
    }


    static class MyThreadWrite extends Thread {

        @Override
        public void run() {
            while (VolatileMain.i < 5) {
                System.out.println("incr i to " + (++VolatileMain.i));
            }
        }
    }



    static class MyThreadRead extends Thread {

        @Override
        public void run() {
            int localvar = VolatileMain.i;
            while (localvar < 5) {
                if (localvar != VolatileMain.i) {
                    System.out.println("new value of i is " + VolatileMain.i);
                    localvar = VolatileMain.i;
                }
            }
        }
    }
}




//15.12.2017(16:51)by{Vachok}