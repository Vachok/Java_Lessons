package lessons.general.stackqdeq;

import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

/**<b>Stack</b> - коллекция, работающая по-принципам "пистолета". Загруженная первой пуля, выйдет последней {@link #stackWorks()}
 <p>
 <b>Queue</b> - очередь в магазин. {@link #queueWorks()}
 * @since 24.07.2018 (15:52)

 */
public class QdeQ implements Lessons {
    private SaverProgress saverProgress = new SaveToDatabase();
    private Map<String, String> links = new ConcurrentHashMap<>();
    /**
     * {@link #stackWorks()} , {@link #queueWorks()}, {@link #deQueueWorks()}
     */
    @Override
    public void launchMe() {
        System.out.println("QdeQ.launchMe");
        links.put("QdeQ","launchMe");
        stackWorks();
        queueWorks();
        deQueueWorks();
        Logger.getLogger(getClass().getSimpleName()).log(INFO, "Saved? "+saverProgress.isSaved(links, 630.317));
    }

    /**
     *<b>Deque</b> .
     * Разница {@link ArrayDeque} vs {@link LinkedList} - такая же как и у листов.
     * Отличие от обычной очереди -  Deque двунаправленна.
     * @see lessons.general.alistllistone.ALLists
     */
    private void deQueueWorks() {
        System.out.println("QdeQ.deQueueWorks");
        links.put("QdeQ","deQueueWorks");
        Deque<String> dequeArr = new ArrayDeque<>();
        Deque<String> dequeLis = new LinkedList<>();
        /*Варианты добавления*/
        dequeArr.add("one");
        dequeArr.offer("two");
        dequeArr.addLast("three");
        dequeArr.offerLast("four");
        dequeArr.addFirst("zero");
        dequeArr.offerFirst("minus 1");
        dequeArr.push("minus 2");

        String s = dequeArr.toString();
        System.out.println(s);
        /*Варианты удаления*/
        remDeq(dequeArr);
        links.put("deQueueWorks", dequeArr.toString());

    }
    /**<b>Варианты удаление Deque</b>
     * @param dequeArr {@link #deQueueWorks()}
     */
    private void remDeq(Deque<String> dequeArr) {
        links.put("QdeQ","remDeq");
        String s1=dequeArr.removeLast();
        String s7=dequeArr.removeFirst();
        /*get и peek - только забирают элементы, не удаляя*/
        String s2=dequeArr.getLast();
        String s10 = dequeArr.getFirst();
        String s3=dequeArr.peekLast();
        String s4=dequeArr.peekFirst();
        /*                                                  */
        String s5=dequeArr.pollLast();
        String s11 = dequeArr.pollFirst();
        String s6=dequeArr.remove();
        String s8=dequeArr.pop();
        String s9 = dequeArr.element();
        /**/
        Logger.getLogger(getClass().getSimpleName()).log(INFO, dequeArr.toString());
        links.put("remDeq(Deque<String> dequeArr)" ,dequeArr.toString());
        boolean progressSaved = saverProgress.isSaved(links, 630.317);
        System.out.println("progressSaved = " + progressSaved);

    }

    /**
     * <b>Queue. Очередь.</b>
     * Работает по-принципу - первый вошел, первый вышел.
     * {@code remove} - удалит первый добавленный элемент. {@code pool} - тоже самое.
     <p>
     {@code peek} - достанет, без удаления.
     */
    private void queueWorks() {
        System.out.println("QdeQ.queueWorks");
        links.put("QdeQ","queueWorks");
        Queue<String> queue = new PriorityQueue<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        queue.offer("five");
        queue.peek();
        queue.poll();

        for (String s:queue){
            System.out.println(s);
            links.put("queueWorks",s);
        }

    }
    /**
     * <b>Стэк</b>
     <p>
     Добавлять элементы - {@code add}
     {@code peek} - достаёт последний элемент.
     {@code pop} - достаёт и сразу удаляет.

     */
    private void stackWorks() {
        System.out.println("QdeQ.stackWorks");
        links.put("QdeQ","stackWorks");
        Stack<String> stack = new Stack();
        stack.add("one");
        stack.add("two");
        stack.add("three");
        stack.push("four");
        System.out.println(stack.peek()); //four
        System.out.println(stack.peek()); //four
        System.out.println(stack.pop()); //four
        System.out.println(stack.pop()); //three
        links.put("stackWorks",stack.peek());

        links.put("stackWorks",stack.pop());
    }

}
