import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main( String[] args ) {
        String s = "string"; //хранятся в пуле
        String s2 = "string";
        Object o1 = new Object();
        Object o2 = o1;
        if(o1.equals(o2)) {
            System.out.println("equals");
        }
    }
}
