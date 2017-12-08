import java.util.*;

public class Main {
    public static void main( String[] args ) {
        int[] array = new int[15]; // быстро, но нужно знать размер
        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.remove("2");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}