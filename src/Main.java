

public class Main {
    public static void main( String[] args ) {
        new Main().myMethod(-5);
    }

    private void myMethod( int a ) {
        assert (a > 0);
        System.out.println(a);
    }
}