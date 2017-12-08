import java.util.*;

public class Main {
    public static void main( String[] args ) {
        List collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.set(2 , "5");
        collection.add(1 , "6");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }
    }
}