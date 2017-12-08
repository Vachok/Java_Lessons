import java.util.*;

public class Main {
    public static void main( String[] args ) {
        Collection collection = new TreeSet();
        collection.add("2");
        collection.add("3");
        collection.add("1");
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}