package lessons.general.lists;

import lessons.general.ConstantsFor;
import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**<h1>Листы</h1>
 * @since 19.09.2018 (13:29)
 */
public class ListsLesson implements Lessons {
    private static final String SOURCE_CLASS = ListsLesson.class.getSimpleName();
    private static final double ID_LESSON = 669.340;
    private static final String LESSON_NAME = "Lists";
    private static final String bookMark = ConstantsFor.getBookmark();
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
            saverProgress.isSaved(linksToSave, String.valueOf(ID_LESSON));
        } else{
            logger.log(Level.WARNING, "NOT SAVED!");
        }
    }

    @Override
    public void launchMe() {
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSaved);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/669", isSaved);
        linksPut(getClass().getSimpleName(), bookMark, isSaved);
        goApp();
    }

    /**
     * {@link List} - это интерфейс. Лист хранит элементы по-индексу.
     * {@link ArrayList} - самая распространёная имплементация. {@link #araList()}
     * В методе указаны основные имплементации листа.
     *
     */
    private void goApp() {
        List<String> arrayList =  araList();
        List<String> linkedList = linkeD();
        List<String> vector = vector();
        List<String> stringStack = new Stack<>();
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
    }

    /**Похож на {@link #araList()}, но работает с нодами. <br>
     * Каждая нода содержит в себе ссылки на следующий и предыдущий элементы.
     * @return {@link LinkedList}
     */
    private List<String> linkeD() {
        List<String> linkedList = new ArrayList<>();
        return linkedList;
    }

    /**Самый простой быстрый из листов.
     * Плюс в том, что он расширяется динамически.
     * Если нужно менять элементы листа, необходимо использовать for(i++) <br>
     *     Мод при итерации for(:) <b>не работает.</b>
     <p>
     <i>Сортировка</i>
     При хранении строк - они сортируются в алфавитном порядке.
     * @return {@link ArrayList}
     */
    private List<String> araList() {
        List<String> ara = new ArrayList<>();
        ara.add("A");
        ara.add("B");
        ara.add("C");
        ara.add("R");
        ara.add("E");
        /* Модификация при итерации. Работает.
        for(int i=0;i<ara.size();i++){
            System.out.println("ara = " + ara.get(i));
            ara.remove(i);
        }*/

        /*Модификация при итерации. ConcurrentModificationException.
        for (String s:ara){
            System.out.println("s = " + s);
            ara.remove(0);
        }*/

        /*Сортировка {@link String}*/
        for(String s:ara){
            System.out.println("s = " + s);
        }
        Collections.sort(ara);
        System.out.println("ara = " + ara);
        for(String s:ara){
            System.out.println("s = " + s);
        }
        return ara;
    }

    /**
     * LinkedList с синхронизированными методами.
     * Вместо него можно использовать {@code Collections.synchronizedList}
     * @return {@link Vector}
     */
    private List<String> vector() {
        List<String> vector = new Vector<>();
        return vector;
    }

    /**
     * Безопасен для потоков.
     *
     * @return {@link Stack}
     */
    private List<String> getStack(){
        return new Stack<>();
    }
    static class Student{
        int idS;
        String nameS;

        public Student(int idS) {
            this.idS = idS;
        }
    }
}
