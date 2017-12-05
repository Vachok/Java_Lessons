import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main( String[] args ) {
        Integer i = 5; // = new Integer(5);
        i++; // = int tempVar = i.tempValue(); tempVar++; i = new Integer(tempVar); ++ добавлен в java5
        System.out.println(i);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3); // обычный int так не пойдёт
        for (int k : list) {
            System.out.println(k);
        }

    }
}
