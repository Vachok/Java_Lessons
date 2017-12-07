

public class Main {
    public static void main( String[] args ) {
        new Main().myMethod(-5);
    }

    private void myMethod( int a ) {
        assert (a > 0);
        System.out.println(a);
    }
}

//    Механизм Assertions - добавить -ea в VM Options
//        Exception in thread "main" java.lang.AssertionError
//        at Main.myMethod(Main.java:9)
//        at Main.main(Main.java:5)
