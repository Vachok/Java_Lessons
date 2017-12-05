import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main( String[] args ) {
        String s = "string"; //хранятся в пуле
        String s2 = "string";
        Object o1 = new Object();
        Object o2 = new Object();
        if(o1 == o2) { //сравнивает, находится ли объект в одной и той же области памяти
            System.out.println("==");
        }
    }
}
