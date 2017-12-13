

public class Main {

    public static void main( String[] args ) {
        otherMethod();
    }


    private static void otherMethod() {
        throw new RuntimeException();
    }
}
