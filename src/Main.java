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
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo( Object o ) {
                return 0;
            }
        };
        comparable.compareTo(new Object());
    }
}
