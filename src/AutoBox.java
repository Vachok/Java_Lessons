import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main( String[] args ) {
        Integer i = 5;
        Integer j = new Integer(5);
        if (i == j) {
            System.out.println("equals");
        }
    }
}