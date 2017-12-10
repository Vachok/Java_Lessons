class Car {

}
public class Main<T> {

    T war;

    public static void main( String[] args ) {

        Main<Car> main = new Main<>();
        main.war = new Car();
        System.out.print(main.war);
    }

    T method( T type ) {
        System.out.print(type);
        return type;
    }
}