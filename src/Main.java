import java.util.*;

public class Main {
    public static void main( String[] args ) {
        Queue collection = new PriorityQueue();
        collection.offer("1");
        collection.offer("2");
        collection.offer("3");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("num of elements: " + collection.size());
    }
}