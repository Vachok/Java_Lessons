/* Java_Lessons-44 Java 34: Garbage Collector
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    static Main main;

    public static void main( String[] args ) {
        method();
    }

    private static void method() {
        Main main = new Main();
        Main main2 = new Main();
        main = null;
        main2 = null;
        System.gc();
    }

    @Override
    public void finalize() {
        Main.main = this;
    }
}*/
