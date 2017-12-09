import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main( String[] args ) {
        Queue queue = new LinkedList();
        Queue queue2 = new PriorityQueue();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        while (queue.size() > 0) {
            System.out.print(queue.poll());
        }
    }
}