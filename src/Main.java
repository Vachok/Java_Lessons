import java.util.*;

public class Main {
    public static void main( String[] args ) {
        Queue queue = new LinkedList();
        Queue queue2 = new PriorityQueue();
        queue.offer("1");
        queue.offer("3");
        queue.offer("2");
        while (queue.size() > 0) {
            System.out.print(queue.poll());
        }
    }
}