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
        linksPut("Maps Lesson", "https://youtu.be/YiHqSwG0jbI?t=358", false);
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
     * {@link TreeMap} <img src="https://lh3.googleusercontent.com/LzYj6Jz19jjCihNH2h_l2Dkq9ZTgRNcFkpZBGq8GQ5uhgg32DPvmZ84-pHPC5YfD3NIknh5mA_v0XC3oqO8UUxljEaDheGRzlkkz5jOQHTjnPeEjNM2bRbmJk4s9RbjUn9UfPB5sFsDTMZplxsqMSVBHXr1aJKfA-Akseby2XjjJF2TQE5eKziNXRuJEIYQNqgioaJy3kvf88-_6mxTjbWxNvBMzrzvgAuePi5w3NG_im1ihbidvb1tlNGE1iO8P7gM2SFymXtZZ7U2TFBJx99C0baII8-zltjadWfzuA1bnRKZC__cY2awzFbLr7e2XfM6NRyX6H3s2sOPZq7GrgglS0xV4euPNzHyXdyM0EktsKs_fCOh2VeZvC0ZxxorarPoXjqCGyL7HwH3UZ4cqYvAZ1B7-l_nVXM7W0xXzEh01v-n0KMfNchTPPcEoQdB0UJyhfQZJt8m3jC3w0FNn6C82TtPV2A_6KoM1NwxfIn8PIc3wB0VP33ITZGtEEYu4cTeIv0l83M3VQl4GAGPY5e0OBZQgIx8Aw6mE4KuKkwBtzwIvcKwjFP21DT7yC3rTTeQZBalITXPytrFjlIxJLwcWomzdg3pfUFRWzIq-6979bSFshhfAnxKtfG2I6iii2PuRnu9q80LWt8HC_ld7EmgPhPoPtlj1ychjdTzqwRJ35oIkd8Dx3Hu80NOTGVZsAQXAG45SILNTpphi6UU=w383-h253-no" alt="treemapimg">
     * <p>
     */
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
