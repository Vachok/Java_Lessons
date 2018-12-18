package lessons.general.dataoncollections;

import lessons.general.Lessons;

import java.util.*;
import java.util.logging.Logger;

/**
 * Сложность алгоритмов поиска по коллекции
 * <p>
 * <b>O(1)</b> - constant. Получение элемента из коллекции 1й операцией. <br>
 * Пример - есть линейка гаражей. Там машины. Наша машина стоит в гараже номер 3.
 * Подходим - открываем.
 * <p>
 * <b>O(log(n))</b> - logarifmic. Мы не знаем в каком гараже. Есть {@code n} гаражей. <br>
 * Но есть подсказки. Мы можем подойти к среднему гаражу, открыть, а там указатель {@code направо}.
 * Делим от {@code n} до конца направо. Снова идём открывать середину... и т.д.
 * <p>
 * <b>O(n)</b> - linear. Мы открываем гаражи по-очереди.<br>
 * Просто тупо смотрим в каждый "гараж".
 * <p>
 * O(n*log(n)) - quasilinear. Гаражи разбросаны. <br>
 * Сначала нужно отсортировать, расставить в каком-либо порядке.
 * Потом используется логарифмический алгоритм.
 *
 * @since 18.12.2018 (12:50)
 */
public class DataOnCol implements Lessons {

    private static final Logger LOGGER = Logger.getLogger(DataOnCol.class.getSimpleName());

    @Override
    public void launchMe() {
        LOGGER.info("DataOnCol.launchMe");
        linksPut("Сложность алгоритмов поиска по коллекции", "https://youtu.be/JDh3DsJGGMU", false);
    }

    /**
     * Массив.
     * <p>
     * Можно использовать константный поиск <b>O(1)</b> <br>
     * Массив является индексируемым, и мы просто можем запросить необходимый элемент по его индексу.
     *
     * @return простой массив строк
     */
    private String[] strings() {
        String[] strings = new String[10];
        return strings;
    }

    /**
     * Работает на основе массива.
     *
     * @return {@link ArrayList}
     * @see  #strings()
     */
    private ArrayList<String> arrayList() {
        List<String> stringList = new ArrayList<>();
        return (ArrayList<String>) stringList;
    }

    /**
     * Линейный алгоритм. <b>O(n)</b>
     *
     * @return {@link LinkedList}
     */
    private LinkedList<String> linkedList() {
        List<String> stringList = new LinkedList<>();
        return (LinkedList<String>) stringList;
    }

    /**
     * Работает на основе массива.
     *
     * @return {@link ArrayDeque}
     * @see #strings()
     */
    private ArrayDeque<String> arrayDeque() {
        List<String> stringList = new ArrayList<>();
        return (ArrayDeque<String>) stringList;
    }

    /**
     * Если у HashMap нет коллизий, то будет <b>O(1)</b> <br>
     *
     * @return {@link HashMap}
     */
    private HashMap<String, String> hashMap() {
        Map<String, String> stringStringMap = new HashMap<>();
        return (HashMap<String, String>) stringStringMap;
    }

    /**
     * @return {@link LinkedHashSet}
     * @see  #hashSet()
     */
    private LinkedHashMap<String, String> linkedHashMap() {
        Map<String, String> stringStringMap = new HashMap<>();
        return (LinkedHashMap) stringStringMap;
    }

    /**
     * {@link TreeMap} ({@link TreeSet}).
     * <p>
     Логарифмический поиск. <b>O(log(n))</b>.
     *
     * @return {@link TreeMap}
     */
    private TreeMap<String, String> treeMap() {
        Map<String, String> stringStringMap = new TreeMap<>();
        return (TreeMap<String, String>) stringStringMap;
    }

    /**
     * Работает на основе {@link HashMap}. <b>O(1)</b>
     *
     * @return {@link HashSet}
     */
    private HashSet<String> hashSet() {
        Set<String> stringSet = new HashSet<>();
        return (HashSet<String>) stringSet;
    }

    /**
     * @return {@link LinkedHashSet}
     * @see  #hashSet()
     */
    private LinkedHashSet<String> linkedHashSet() {
        Set<String> stringSet = new LinkedHashSet<>();
        return (LinkedHashSet<String>) stringSet;
    }
}
