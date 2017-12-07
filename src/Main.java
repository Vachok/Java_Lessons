

public class Main {
    public static void main( String[] args ) {
        new Main().someMethod();
    }

    void someMethod() {
        try {
            Object o = null;
            o.hashCode();
            // throw new Exception();
        } catch (Exception e) {

        }
    }
}