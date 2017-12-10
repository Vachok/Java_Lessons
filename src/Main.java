import java.io.Serializable;

class Car extends Main implements Comparable, Serializable {
    @Override
    public int compareTo( Object o ) {

        return 0;
    }
}

public class Main<T extends Main & Comparable & Serializable> {

    T war;

    public static void main( String[] args ) {

        Main<Car> main = new Main<>();
        main.war = new Car();
        main.method(new Car());
    }

    T method( T type ) {
        type.meMethods();
        return type;
    }

    void meMethods() {

        System.out.println("bla");
    }
}