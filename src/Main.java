import java.io.IOException;

public class Main {

    public static void main( String[] args ) {
        new Main().someMethod();
    }

    void someMethod() {
        try {
            System.out.println("try");
            throw new IOException();
            //Object o = null;
            // o.hashCode();
        } catch (RuntimeException e) {
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        }
    }