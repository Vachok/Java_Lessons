public class Main {

    public static void main( String[] args ) {
        new Main().meMethod();
    }

    void meMethod() {
        try {
            System.out.println("try");
            throw new Error();
        } catch (Error e) {
            System.out.println("catch");
        }
    }
}

/* Иерархия Exceptions
1. Throwable
    2. Error
    2. Exception
 */