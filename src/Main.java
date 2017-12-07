import java.io.IOException;

public class Main {

    public static void main( String[] args ) {
        new Main().someMethod();
    }

    void someMethod() {
        try {
            System.out.println("try");
            throw new Error();
            //Object o = null;
            // o.hashCode();
        } finally {
            System.out.println("finally");
        }
        }
    }