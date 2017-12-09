import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main( String[] args ) {
        Queue queue = new LinkedList(); //двунапр. список
        Queue queue2 = new PriorityQueue();
        queue.offer("1");
        queue.offer("3");
        queue.offer("2");
        while (queue.size() > 0) {
            System.out.print(queue.poll());
        }
    }
}