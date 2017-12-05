import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main( String[] args ) {
        String s = "string"; //хранятся в пуле
        String s2 = "string";
        Object o1 = new Object();
        Object o2 = o1;
        if(s.equals(s2)) { //проверяет значение объекта, а не область памяти. см строку 17
            System.out.println("equals");
        }
    }
}