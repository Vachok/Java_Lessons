class Popcorn {
    void doSome() {
        System.out.println("popcorn");
    }
}

public class Main {
    public static void main( String[] args ) {
        Popcorn popcorn = new Popcorn();
        {
            void doSome () {
            System.out.println("main");
        }
        }
        popcorn.doSome();
    }
}