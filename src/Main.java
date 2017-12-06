import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    Object o;

    public static void main( String[] args ) {
        method();
    }

    private static void method() {
        Main main = new Main();
        main = null;
        System.gc();
    }

    @Override
    public void finalize() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAa");

    }
}