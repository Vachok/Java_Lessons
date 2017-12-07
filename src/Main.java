import java.io.IOException;

public class Main {

    public static void main( String[] args ) {
        new Main().someMethod();
    }
    void someMethod() {
        try {
            System.out.println("try");
            Object o = null;
            o.hashCode();
        } catch (NullPointerException e) {
            System.out.println("catch");
            //e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}