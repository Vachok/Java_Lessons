import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main( String[] args ) {
        String s = "string"; //хранятся в пуле
        String s2 = new String("string");
        if(s == s2) { //не рекомендуется так. т.к. область памяти String *может* быть разной
            System.out.println("==");
        }
    }
}