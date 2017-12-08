import java.util.*;

//Map - коллекция с ключами
public class Main {
    public static void main( String[] args ) {
        Map collection = new HashMap();
        collection.put("1" , "Dan Brown");
        collection.put("2" , "Kernegi");
        collection.put("3" , "Jack London");
        System.out.println(collection.get("2"));
        Set set = collection.keySet();
        for (Object o : set) {
            System.out.println(o);
        }
    }
}