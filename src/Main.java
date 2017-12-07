import java.io.IOException;

public class Main {

    public static void main( String[] args ) {
        System.out.println(new Main().someMethod());
    }

    String someMethod() {
        try {
            System.out.println("try");
            Object o = null;
            o.hashCode();
            return "try1";
        } catch (NullPointerException e) {
            System.out.println("catch");
            return "catch2";
            //e.printStackTrace();
        } finally {
            System.out.println("finally");
            //return "finally2";

        }
        }
    }