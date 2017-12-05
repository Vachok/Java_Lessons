import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main( String[] args ) {
        String s = "string"; //хранятся в пуле
        String s2 = new String("string");
        if(s.equals(s2)) {
            System.out.println("==");
        }
    }
}