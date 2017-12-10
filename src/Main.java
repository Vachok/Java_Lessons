

public class Main {
    public static void main( String[] args ) {
        Main main = new Main();
        main.method("123");
    }

    <T> T method( T type ) {
        System.out.print(type);
        return type;
    }
}