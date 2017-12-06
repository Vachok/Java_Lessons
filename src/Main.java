import java.util.List;

public class Main extends Object {
    public static void main( String[] args ) {
        System.out.println(5 > 4 || returnBool()); //
    }

    private static boolean returnBool() {
        System.out.println("returnBoolean");
        return true;
    }
}