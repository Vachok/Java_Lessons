import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main( String[] args ) {
        List list = new ArrayList();
        List list1 = new Vector();
        List linked = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}