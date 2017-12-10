

public class Main<T> {

    T war;

    public static void main( String[] args ) {

        Main<String> main = new Main<>();
        main.war = "sdf";
        System.out.print(main.war);
    }

    T method( T type ) {
        System.out.print(type);
        return type;
    }
}