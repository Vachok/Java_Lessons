import java.util.PriorityQueue;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        new Thread(){
            @Override
            public void run() {
                System.out.println(queue.remove());
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                queue.add("String")
            }
        }
    }
}
// at 21.12.2017 (14:01)