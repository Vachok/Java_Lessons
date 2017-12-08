import java.util.*;

public class Main {
    public static void main( String[] args ) {
        Map collection = new HashSet();
        collection.put(new Object() , "Dan Brown");
        collection.put("2" , "Kernegi");
        collection.put("3" , "Jack London");
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}