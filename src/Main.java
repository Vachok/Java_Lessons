import java.util.*;

public class Main {
    public static void main( String[] args ) {
        Map map3 = new HashMap();
        Map map2 = new Hashtable();
        Map map = new LinkedHashMap();
        Map map4 = new TreeMap(); //отсортированный список
        map.put("1" , "one");
        map.put("3" , "three");
        map.put("2" , "two");
        System.out.println(map.get("3"));
        Set set = map.entrySet();
        for (Object o : set) {
            System.out.print(o + " ");
        }
    }
}