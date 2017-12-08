import java.util.*;

public class Main {
    public static void main( String[] args ) {
        Queue collection = new PriorityQueue();
        collection.offer("1");
        collection.offer("2");
        collection.offer("3");
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.poll());
        }
        System.out.println("num of elements: " + collection.size());
    }
}