class Car implements Comparable {
    @Override
    public int compareTo( Object o ) {

        return 0;
    }
}

public class Main<T extends Comparable> {

    T war;

    public static void main( String[] args ) {

        Main<Car> main = new Main<>();
        main.war = new Car();
        System.out.print(main.war);
    }

    T method( T type ) {

        type.
                System.out.print(type);
        return type;
    }
}