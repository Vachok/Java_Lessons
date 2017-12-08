import java.util.*;

public class Main {
    public static void main( String[] args ) {
        Map collection = new HashMap();
        collection.put("1" , "Dan Brown");
        collection.put("2" , "Kernegi");
        collection.put("3" , "Jack London");
        System.out.println(collection.get("2"));
    }
}