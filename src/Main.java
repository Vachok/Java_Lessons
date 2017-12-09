import java.util.*;

public class Main {
    public static void main( String[] args ) {
        Map map = new HashMap(); // хранит объекты, на основании Хэша
        Map map2 = new Hashtable();
        Map map3 = new LinkedHashMap();
        Map map4 = new TreeMap();
        map.put("1" , "one"); // в таблицу table, где хранятся ноды
        map.put("3" , "three");
        map.put("2" , "two");
        System.out.println(map.get("3"));
        Set set = map.entrySet();
        for (Object o : set) {
            System.out.println(o);
        }
    }
}