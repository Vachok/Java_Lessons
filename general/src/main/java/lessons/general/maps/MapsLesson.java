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
        linksPut("Maps Lesson", "https://youtu.be/YiHqSwG0jbI?t=4", false);
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
     * / 1 / 2 {@link java.util.stream.Node} / 3 /
     * </code>
     */
    private Map<String, String> hashMap() {
        Map<String, String> stringStringMap = new HashMap<>();
        return stringStringMap;
    }

    private Map<String, String> linkedHMap() {
        Map<String, String> stringStringMap = new LinkedHashMap<>();
        return stringStringMap;
    }

    private Map<String, String> treeMap() {
        Map<String, String> stringStringMap = new TreeMap<>();
        return stringStringMap;
    }

    private Map<String, String> hashTable() {
        Map<String, String> stringStringMap = new Hashtable<>();
        return stringStringMap;
    }

    private Map<String, String> syncedMap() {
        Map<String, String> stringStringMap = Collections.synchronizedMap(new HashMap<>());
        return stringStringMap;
    }
}
