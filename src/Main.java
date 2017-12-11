public class Main {
    private int i = 5;
    static int q = 5;

    public static void main( String[] args ) {
        StaticClass staticClass = new StaticClass();
        staticClass.mthod();
        Main main = new Main();
        main.method();
        Inner inner = main.new Inner();
        inner.method2();
    }

    Inner inner3 = new Inner();
    void method() {
        class NewInner {
            void newMethod() {
                System.out.println("bla");

            }
        }
        NewInner newInner = new NewInner();
        newInner.newMethod();
    }

    static class StaticClass {
        void mthod() {
            System.out.println(q);
        }
    }



    class Inner {
        int k = 6;

        void method2() {
            System.out.println(q);
            System.out.println(i);
        }
    }
}