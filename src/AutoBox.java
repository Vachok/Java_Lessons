import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main( String[] args ) {
        Integer i = 128; //если 127, тогда будет равно!
        Integer j = 128;
        if (i == j) {
            System.out.println("equals");
        }
    }
}