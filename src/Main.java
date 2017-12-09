import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main( String[] args ) {
        Queue queue = new LinkedList(); // двунапр. список. очередь в том порядке, как добавили
        Queue queue2 = new PriorityQueue(); // похож на LinkedList, но сортирует
        queue.offer("1");
        queue.offer("3");
        queue.offer("2");
        while (queue.size() > 0) {
            System.out.print(queue.poll());
        }
    }
}