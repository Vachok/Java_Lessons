import java.util.Map;

public class Main {
    private int i = 5;

    public static void main( String[] args ) {
        Main main = new Main();
        Inner inner = main.new Inner();
        inner.method2();
    }

    void method() {
        Inner inner = new Inner();
        inner.method2();
        System.out.println(inner.k);
    }

    class Inner {
        int k = 6;

        void method2() {
            System.out.println(i);
        }
    }
}