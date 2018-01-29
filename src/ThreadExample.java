//122.75-waitnotif-examp
/*import java.util.*;
=======



public class ThreadExample {

//122.75-waitnotif-examp
    static List<String> strings = Collections.synchronizedList(new ArrayList<>());


    public static void main( String[] args ) {
        new Operator().start();
        new Machine().start();
    }


    static class Operator extends Thread {

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                synchronized (ThreadExample.strings) {
                    ThreadExample.strings.add(scanner.nextLine());
                    ThreadExample.strings.notify();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    static class Machine extends Thread {

        @Override
        public void run() {
            while (ThreadExample.strings.isEmpty()) {
                synchronized (ThreadExample.strings) {
                    try {
                        ThreadExample.strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ThreadExample.strings.remove(0));
                }
=======
    public static void main( String[] args ) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();
        synchronized (threadB) {
            threadB.wait();
        }
        System.out.println(threadB.total);
    }


    static class ThreadB extends Thread {

        int total;


        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 500000; i++) {
                    total += i;
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                notify();

            }
        }
    }
}
//122.75-waitnotif-examp




//17.12.2017(16:13)by{Vachok}
=======
