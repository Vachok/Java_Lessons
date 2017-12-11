import java.util.Map;

public class Main {
    private int i = 5;
    static int q = 5;

    public static void main( String[] args ) {
        StaticClass.mthod();
        Main main = new Main();
        main.method();
        Inner inner = main.new Inner();
        inner.method2();
    }

    Inner inner3 = new Inner();

    static class StaticClass {
        static void mthod() {
            System.out.println(q);
        }
    }

    void method() {
        Inner inner = new Inner();
        inner.method2();
        System.out.println(inner.k);
        inner3.method2();
    }

    class Inner {
        int k = 6;

        void method2() {
            System.out.println(i);
        }
    }
}

class Second {
    void method() {
        Main.Inner inner = new Main().new Inner();
        inner.method2();
    }
}
/* Inner
Существуют inner-классы, без экземпляра внешнего класса, не создаётся внутренний

 */