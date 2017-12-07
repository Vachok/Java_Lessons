import java.io.IOException;

public class Main {

    public static void main( String[] args ) {
        new Main().someMethod();
    }

    void someMethod() {
        try {
            System.out.println("try");
            //Object o = null;
            // o.hashCode();
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                throw new ArrayIndexOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e)
        } catch (RuntimeException e) {
        }
        }
    }