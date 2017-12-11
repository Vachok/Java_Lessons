class Popcorn {
    void doSome() {
        System.out.println("popcorn");
    }
    void secondMethhod() {
        System.out.println("second");
    }
}



public class Main {
    public static void main( String[] args ) {
        method(new Popcorn() {
            void doSome() {
                System.out.println("bla");
            }
        });
    }
    static void method( Popcorn popcorn ) {
        popcorn.doSome();
    }
}
