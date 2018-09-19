package lessons.general.collect;

import lessons.general.Lessons;
import lessons.general.boxedprimitives.BoxedPMain;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**<b>Collections</b>
 * {@link #goApp()}
 * @since 19.09.2018 (12:09)
 */
public class ColLect implements Lessons {
    private static final String SOURCE_CLASS = BoxedPMain.class.getSimpleName();
    private static final double ID_LESSON = 668.339;
    private static final String LESSON_NAME = "Коллекции";
    private static boolean isSaved = true;
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();
    private Logger logger = Logger.getLogger(SOURCE_CLASS);

    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        linksToSave.clear();
        linksToSave.put(LESSON_NAME, links);
        SaverProgress saverProgress = new SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, ID_LESSON);
        } else{
            logger.log(Level.WARNING, "NOT SAVED!");
        }
    }

    @Override
    public void launchMe() {
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSaved);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/662", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/Bm86HUCrOrs", isSaved);
        goApp();
    }

    /**
     * Коллекция - это класс, хранящий данные.<br>
     *     Можно указывать тип данных.
     *
     *Коллекции имеют extends интерфейсы. Это: <br>
     *     {@link java.util.List}, {@link java.util.Set}, {@link java.util.Queue} <br>
     *         {@link Map} - отдельная коллекция, не экстендит ничего.
     *<p>
     *     Основные действия с коллекцией. Добавить, удалить, посмотреть, проверить наличие элемента.
     *</p>
     * {@link #listS()}
     */
    private void goApp() {
        logger.info("goAPP");
        Collection<String> collection = new ArrayList<>();
        ((ArrayList<String>) collection).add("one");
        ((ArrayList<String>) collection).add("two");
        logger.info(collection.size()+" size");
        collection.remove("one");
        logger.info(collection.size()+" size");
        logger.info(collection.contains("one")+" one");
        /*Для иерации есть спец. метод. См. ниже*/
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            logger.info(iterator.next());
        }
        for(String s:collection){
            logger.info(s);
        }
        listS();
    }

    /**
     * <b>Отличия Листа от Коллекции</b>
     * <p>
     *     {@link List} работает на основе индекса.
     *     {@link #setS()}
     * </p>
     */
    private void listS(){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        logger.info(list.get(1));
        setS();
    }

    /**
     * <b>Сэты</b>
     * <p>Отличие сэта. Он содержит только уникальные элементы</p>
     * {@link #queUe()}
     */
    private void setS(){
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("one");
        logger.info(set.size()+" only unique");
        queUe();
    }

    /**
     * <b>Очередь.</b>
     * <p>Кто первый пришел - тот первый ушел.</p>
     * {@link #mapS()}
     */
    private void queUe(){
        Queue<String>queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        logger.info(queue.element());
        logger.info(queue.remove());
        logger.info(queue.element());
        logger.info(queue.peek());
        logger.info(queue.poll());
        logger.info(queue.offer("four") + " bool");
        mapS();
    }

    /**
     * <b>Map - это словарь. Ключ-значение.</b>
     * <p>Map можно записать объекты по-ключу null</p>
     */
    private void mapS(){
        Map <String, String> map = new ConcurrentHashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.remove("1");
        logger.info(map.get("1"));
        map.put(null, "three");
        logger.info(map.get(null));
    }
}
