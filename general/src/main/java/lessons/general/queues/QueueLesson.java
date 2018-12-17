package lessons.general.queues;

import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaveToFile;
import lessons.general.helper.SaverProgress;

import java.util.*;
import java.util.logging.Logger;

import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaveToFile;
import lessons.general.helper.SaverProgress;

import java.util.*;
import java.util.logging.Logger;

/**
 * Очередь.
 * <p>
 * Очередь - отдаёт элементы в порядке очереди "за хлебом". Кто первый пришел, тот первый и получает. <br>
 * Основные имплементации - {@link LinkedList} (как {@link java.util.List} его не используют, в силу того, что он медленно работает.
 * Но он отлично подходит в качестве {@link Queue}, потому что позволяет быстро находить первый и последний элемент.) <br>
 * {@link LinkedList} универсален. Он может работать как {@link Queue}, так и {@link Deque}.
 * <p>
 * {@link #linkedQ()} , {@link #linkedDeq()}, {@link #arrayQue()}, {@link #prioQ()}
 * <p>
 * Существует ещё {@link java.util.concurrent.BlockingQueue}, но она входит в {@link java.util.concurrent}, и стоит отдельного упоминания.
 *
 * @since 17.12.2018 (12:06)
 */
public class QueueLesson implements Lessons {

    private static final Logger LOGGER = Logger.getLogger(QueueLesson.class.getSimpleName());

    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        SaverProgress saverProgress = new SaveToFile();
        if (saveToDB) {
            saverProgress = new SaveToDatabase();
        }
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put(lessonName, links);
        boolean saved = saverProgress.isSaved(stringStringMap, "671-342");
        LOGGER.info(saved + " progress saved");
    }

    @Override
    public void launchMe() {
        LOGGER.info("QueueLesson.launchMe");
        linksPut("Queues Lesson", "https://youtu.be/lwRLYXqYBqY?t=505", false);
        prioQ();
    }

    /**
     * Очередь на основе {@link LinkedList}
     * <p>
     * Работает на основе {@link java.util.stream.Node}.
     *
     * @return {@link LinkedList}
     */
    private Queue<String> linkedQ() {
        Queue<String> stringQueue = new LinkedList<>();
        return stringQueue;
    }

    /**
     * Двунарвавленная очередь на основе {@link LinkedList}.
     *
     * @return {@link LinkedList}
     */
    private Deque<String> linkedDeq() {
        Deque<String> stringQueue = new LinkedList<>();
        return stringQueue;
    }

    /**
     * Двунаправленная очередь на основе {@link ArrayDeque}
     * <p>
     * Работает на основе {@link Object}. Быстрее чем {@link LinkedList} и быстрее чем {@link Stack} <br>
     * Лучше всего использовать его.
     * <p>
     * Единственное преимущество {@link LinkedList} - при <b>удалении</b> элементов.
     *
     * @return {@link ArrayDeque}
     */
    private Deque<String> arrayDeque() {
        Deque<String> stringQueue = new ArrayDeque<>();
        stringQueue.add("A");
        stringQueue.add("B");
        stringQueue.add("C");
        for (String s : stringQueue) {
            LOGGER.info(s);
        }
        return stringQueue;
    }

    /**
     * Очередь {@link PriorityQueue}.
     * <p>
     * Основное отличие от остальных - она сортирует элементы. <br>
     *
     * @return {@link PriorityQueue}
     */
    private Queue<String> prioQ() {
        Queue<String> stringQueue = new PriorityQueue<>();
        stringQueue.add("a");
        stringQueue.add("d");
        stringQueue.add("c");
        stringQueue.add("b");
        for (String s : stringQueue) {
            LOGGER.info(s + " for");
            LOGGER.info(stringQueue.size() + " size for");
        }
        while (stringQueue.size() != 0) {
            LOGGER.info(stringQueue.remove() + " while");
            LOGGER.info(stringQueue.size() + " size while");
        }
        return stringQueue;
    }
}
