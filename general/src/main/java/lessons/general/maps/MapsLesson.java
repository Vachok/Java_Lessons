package lessons.general.maps;

import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaveToFile;
import lessons.general.helper.SaverProgress;

import java.util.*;
import java.util.logging.Logger;

/**
 * {@link java.util.Map} - таблица, которая хранит ключ-значение
 * <p>
 * Осносные имплементации: <br>
 * {@link #hashMap()} , {@link #linkedHMap()}, {@link #treeMap()}, {@link #hashTable()}, {@link #syncedMap()}.
 *
 * @since 17.12.2018 (14:10)
 */
public class MapsLesson implements Lessons {

    private static final Logger LOGGER = Logger.getLogger(MapsLesson.class.getSimpleName());

    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        SaverProgress saverProgress = new SaveToFile();
        if (saveToDB) {
            saverProgress = new SaveToDatabase();
        }
        Map<String, String> stringStringMa = new HashMap<>();
        stringStringMa.put(lessonName, links);
        boolean saved = saverProgress.isSaved(stringStringMa, "672-343");
        LOGGER.info(saved + " " + saverProgress.toString());
    }

    @Override
    public void launchMe() {
        LOGGER.info("MapsLesson.launchMe");
        linksPut("Maps Lesson", "https://youtu.be/YiHqSwG0jbI?t=1892", true);
        treeMap();
    }

    /**
     * {@link HashMap}
     * <p>
     * Основное преимущество - быстродействие. Элементы хранятся в виде:
     * хэш ключа, сам ключ, значение и ссылка на следующий элемент.<br>
     * Всё хранится в виде {@code transient} {@link java.util.stream.Node}{@code [] table;}. <br>
     * Работает за счет {@link #equals(Object)} и {@link #hashCode()} .
     * <p>
     * Ячейки памяти: <br>
     * <code>
     * / 1 / 2 ({@link java.util.stream.Node}1 \ {@link java.util.stream.Node}2) / 3 / 4 /
     * </code> <br>
     * Объект в данном случае будет с одним хэш-кодом, но <b>не будет равен по-equals</b>.
     * <p>
     * Изначальная длина ({@link HashMap#DEFAULT_INITIAL_CAPACITY}) = 16. <br>
     * Максимальная вместимость = 2^30.
     <p>
     {@link HashMap#loadFactor}. Хэш-мапа кладёт элементы с одинаковым хэш в одну ячейку памяти. <br>
     {@code loadFactor} - говорит о том, когда надо перехэшировать таблицу. Т.е. есть например 16 элементов с одним хэш.
     Мы забиваем их в одну ячейку. LoadFactor по-умолчанию = 0.75 .
     Не даст заполнить более 12и элементов (75% от 16и изначальных).<br>
     Этот параметр нужен для контроля коллизий. Его можно регулировать.
     <p>
     В одной и той же ячейке памяти <b>могут</b> лежать объекты с разным хэш! В данном случае произойдёт коллизия.
     Борьба - уменьшить load factor.
     <p>
     Java 8 из {@link LinkedList}, превращает элементы в двоичное дерево. Это хорошо ускоряет работу,
     когда происходит много коллизий. Логика там заложена не простая.
     <p>
     ХэшМапа скорее всего не может становиться меньше. <b>?</b>
     */
    private Map<String, String> hashMap() {
        Map<String, String> stringStringMap = new HashMap<>();
        return stringStringMap;
    }

    /**
     * {@link LinkedHashMap}
     * <p>
     * Отличие от {@link #hashMap()} в том, что она запоминает порядок добавления ключей.
     */
    private Map<String, String> linkedHMap() {
        Map<String, String> stringStringMap = new LinkedHashMap<>();
        return stringStringMap;
    }

    /**
     * {@link TreeMap}
     * <img src="https://lh3.googleusercontent.com/LzYj6Jz19jjCihNH2h_l2Dkq9ZTgRNcFkpZBGq8GQ5uhgg32DPvmZ84-pHPC5YfD3NIknh5mA_v0XC3oqO8UUxljEaDheGRzlkkz5jOQHTjnPeEjNM2bRbmJk4s9RbjUn9UfPB5sFsDTMZplxsqMSVBHXr1aJKfA-Akseby2XjjJF2TQE5eKziNXRuJEIYQNqgioaJy3kvf88-_6mxTjbWxNvBMzrzvgAuePi5w3NG_im1ihbidvb1tlNGE1iO8P7gM2SFymXtZZ7U2TFBJx99C0baII8-zltjadWfzuA1bnRKZC__cY2awzFbLr7e2XfM6NRyX6H3s2sOPZq7GrgglS0xV4euPNzHyXdyM0EktsKs_fCOh2VeZvC0ZxxorarPoXjqCGyL7HwH3UZ4cqYvAZ1B7-l_nVXM7W0xXzEh01v-n0KMfNchTPPcEoQdB0UJyhfQZJt8m3jC3w0FNn6C82TtPV2A_6KoM1NwxfIn8PIc3wB0VP33ITZGtEEYu4cTeIv0l83M3VQl4GAGPY5e0OBZQgIx8Aw6mE4KuKkwBtzwIvcKwjFP21DT7yC3rTTeQZBalITXPytrFjlIxJLwcWomzdg3pfUFRWzIq-6979bSFshhfAnxKtfG2I6iii2PuRnu9q80LWt8HC_ld7EmgPhPoPtlj1ychjdTzqwRJ35oIkd8Dx3Hu80NOTGVZsAQXAG45SILNTpphi6UU=w383-h253-no" alt="treemapimg">
     * <p>
     * Все объекты сортируются. Чтобы сложить в {@link TreeMap}, нужно заимплементить {@link Comparable}. <br>
     * Элементы хранятся как {@link javax.swing.RowFilter.Entry}.
     * Мы получаем <b>сбалансированное красное дерево</b>
     <p>
     Она может быть {@link NavigableMap}
     @see {@link #navigThisMap(Map)}
     */
    private Map<String, String> treeMap() {
        Map<String, String> stringStringMap = new TreeMap<>();
        stringStringMap.put("a","1");
        stringStringMap.put("d","4");
        stringStringMap.put("c","3");
        stringStringMap.put("b","2");
        navigThisMap((TreeMap<String, String>) stringStringMap);
        return stringStringMap;
    }

    /**
     * Навигация по {@link TreeMap}
     <p>
     Создаются 2 sub-map. От "a" до "b" (не включительно)<br>
     От "c" до "d" (не включительно). <br>
     Как пример - расписание поездов. Нужно получить с какого-то по какое-то время.
     Это предоставляет интерфейс {@link SortedMap}.
     <p>
     Получаем first и last ключи.
     * @param stringStringMap {@link TreeMap}
     */
    private void navigThisMap(TreeMap<String, String> stringStringMap) {
        LOGGER.info(stringStringMap.subMap("a", "b").toString()+" subMap(\"a\", \"b\")");
        LOGGER.info(stringStringMap.subMap("c", "d").toString()+" subMap(\"c\", \"d\")");

        LOGGER.info(stringStringMap.firstKey()+" firstKey");
        LOGGER.info(stringStringMap.lastKey()+" lastKey");
    }

    /**
     * Тоже что и {@link #hashMap()}, но все методы {@code synchronized}.
     * <p>
     * Более современный способ: {@link #syncedMap()}. <br>
     *
     * @return {@link Hashtable}
     */
    private Map<String, String> hashTable() {
        Map<String, String> stringStringMap = new Hashtable<>();
        return stringStringMap;
    }

    /**
     * Синхронизированная коллекция (безопастна для многопоточности.)
     * <p>
     * Любую {@link Map}, можно превратить в синхронизированную.
     * Для этого можно использовать {@link Collections#synchronizedMap(Map)} <br>
     * Преимущества перед {@link #hashTable()}, эту мапу можно лочить на {@code mutex}-объекте.
     * Т.е. мы можем передать объект, на котором хотим синхронизирваться. <br>
     * {@link #hashTable()} будет синхронизироваться на объекте {@code this}.
     *
     * @return {@code synchronized map}
     */
    private Map<String, String> syncedMap() {
        Map<String, String> stringStringMap = Collections.synchronizedMap(new HashMap<>());
        return stringStringMap;
    }
}
