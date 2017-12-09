import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main( String[] args ) {
        List list = new ArrayList(); // коллек. на основании индекса
        System.out.print(list.size() + " /// ");
        List list1 = new Vector(); // ArrayList synchronized
        List linked = new LinkedList(); // implements Queue. Двунаправленный список
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}