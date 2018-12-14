package lessons.general.lists;

import java.util.*;
import java.util.logging.Logger;

/**
 * {@link Vector} против синхронизации
 * <p>
 * Сравниваем скорость заполнения листа, вектора и синк-листа. <br>
 * Если много элементов, можно использовать Вектор. Он не такой и плохой.
 */
public class VectorVSSync {

    private static final Logger LOGGER = Logger.getLogger(VectorVSSync.class.getSimpleName());

    private static final int TO_LIST = 912;

    private static final int TO_VECTOR = 759;

    private static final int TO_SYNC_LIST = 875;

    private static final int ITERATE_SYNC_LIST = 935;

    private static final int ITERATE_VECTOR = 741;

    private static final int ITERATE_ALIST = 905;

    public static void main(String[] args) {
        LOGGER.info("\nto list: " + TO_LIST + "\nto vector: " + TO_VECTOR + "\nto sync list " + TO_SYNC_LIST);
        LOGGER.info("\nITERATE_SYNC_LIST: " +
            ITERATE_SYNC_LIST + "\nITERATE_VECTOR: " +
            ITERATE_VECTOR + "\nITERATE_ALIST " +
            ITERATE_ALIST);
        long stArt = System.currentTimeMillis();
        List<Integer> ara = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            ara.add(i);
        }
        for (int i = 0; i < 10_000_000; i++) {
            new Integer(ara.get(i));
        }
        LOGGER.warning((System.currentTimeMillis() - stArt) + "");
    }

    /**
     * Тест времени заполнения.
     */
    public static void addingM() {
        LOGGER.info("\nto list: " + TO_LIST + "\nto vector: " + TO_VECTOR + "\nto sync list " + TO_SYNC_LIST);
        long stArt = System.currentTimeMillis();
        List<Integer> ara = Collections.synchronizedList(new ArrayList<>());
        for (int i = 0; i < 10_000_000; i++) {
            ara.add(i);
        }
        LOGGER.warning((System.currentTimeMillis() - stArt) + "");
    }
}
