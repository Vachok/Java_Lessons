import java.util.*;

public class Main {
    public static void main( String[] args ) {
        List collection = new ArrayList();
        Set collection = new HashSet();
        Queue collection = new PriorityQueue();
        Map map = new HashMap();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.remove("2");
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}