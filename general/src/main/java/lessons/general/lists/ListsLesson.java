package lessons.general.lists;

import lessons.general.ConstantsFor;
import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>Листы</h1>
 *
 * @since 19.09.2018 (13:29)
 */
public class ListsLesson implements Lessons {
    private static final String SOURCE_CLASS = ListsLesson.class.getSimpleName();
    private static final double ID_LESSON = 669.340;
    private static final String LESSON_NAME = "Lists";
    private static final String BOOKMARK = ConstantsFor.getBookmark();
    private static final Logger LOGGER = Logger.getLogger(SOURCE_CLASS);
    private static boolean isSaved = true;
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();

    /**
     * @see Student
     */
    private static void studentList() {
        LOGGER.info("ListsLesson.studentList");
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(3));
        studentList.add(new Student(1));
        studentList.add(new Student(2));
        LOGGER.warning("UNSorted");
        for (Student s : studentList) {
            LOGGER.info(String.valueOf(s.idS));
        }
        Collections.sort(studentList);
        LOGGER.warning("Sorted");
        for (Student student : studentList) {

            LOGGER.info(String.valueOf(student.idS));
        }
    }

    /**
     *
     */
    private static void binSearch() {  // TODO: 28.11.2018 https://youtu.be/Yj7aBWizGyg?t=1357
        LOGGER.info("ListsLesson.studentList");
        List<String> ar = new ArrayList<>();
        ar.add("A");
        ar.add("B");
        ar.add("C");
        LOGGER.warning("UNSorted");
        for (String s : ar) {
            LOGGER.info(String.valueOf(s));
        }
        Collections.sort(ar);
        LOGGER.warning("Sorted");
        for (String s : ar) {
            LOGGER.info(String.valueOf(s));
        }
    }

    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        linksToSave.clear();
        linksToSave.put(LESSON_NAME, links);
        SaverProgress saverProgress = new SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, String.valueOf(ID_LESSON));
        } else {
            LOGGER.log(Level.WARNING, "NOT SAVED!");
        }
    }

    @Override
    public void launchMe() {
        LOGGER.info("ListsLesson.launchMe");
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSaved);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/669", isSaved);
        linksPut(getClass().getSimpleName(), BOOKMARK, isSaved);
        goApp();
    }

    /**
     * {@link List} - это интерфейс. Лист хранит элементы по-индексу.
     * {@link ArrayList} - самая распространёная имплементация. {@link #araList()}
     * В методе указаны основные имплементации листа.
     */
    private void goApp() {
        LOGGER.info("ListsLesson.goApp");
        List<String> arrayList = araList();
        List<String> linkedList = linkeD();
        List<String> vector = vector();
        List<String> stringStack = new Stack<>();
        List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());
    }

    /**
     * Похож на {@link #araList()}, но работает с нодами. <br>
     * Каждая нода содержит в себе ссылки на следующий и предыдущий элементы.
     *
     * @return {@link LinkedList}
     */
    private List<String> linkeD() {
        LOGGER.info("ListsLesson.linkeD");
        List<String> linkedList = new ArrayList<>();
        return linkedList;
    }

    /**
     * Самый простой быстрый из листов.
     * Плюс в том, что он расширяется динамически.
     * Если нужно менять элементы листа, необходимо использовать for(i++) <br>
     * Мод при итерации for(:) <b>не работает.</b>
     * <p>
     * <i>Сортировка</i>
     * При хранении строк - они сортируются в алфавитном порядке.
     * 1.1 {@link #studentList()}
     *
     * @return {@link ArrayList}
     */
    private List<String> araList() {
        LOGGER.info("ListsLesson.araList");
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
        for (String s : ara) {
            System.out.println("s = " + s);
        }
        Collections.sort(ara);
        System.out.println("ara = " + ara);
        for (String s : ara) {
            System.out.println("s = " + s);
        }
        studentList();
        return ara;
    }

    /**
     * LinkedList с синхронизированными методами.
     * Вместо него можно использовать {@code Collections.synchronizedList}
     *
     * @return {@link Vector}
     */
    private List<String> vector() {
        LOGGER.info("ListsLesson.vector");
        List<String> vector = new Vector<>();
        return vector;
    }

    /**
     * Безопасен для потоков.
     *
     * @return {@link Stack}
     */
    private List<String> getStack() {
        LOGGER.info("ListsLesson.getStack");
        return new Stack<>();
    }

    /**
     * Класс Student
     * <p>
     * Для возможности сортировки ( {@link ListsLesson#studentList()} ), необходимо заимплементить {@link Comparable} <br>
     * и переопределить {@link #compareTo(Object)}
     */
    static class Student implements Comparable {
        int idS;
        String nameS;

        public Student(int idS) {
            LOGGER.info("Student.Student");
            this.idS = idS;
        }

        /**
         * Метод сравнения. <br>
         * {@link Student}1 - текущий объект <br>
         * {@link Student}2 - сравниваемый объект
         * <p>
         * Концепция: <br>
         * Если возвращается 0 - {@link Student}1 == {@link Student}2
         * Если {@link #idS} отрицательная - {@link Student}1 < {@link Student}2
         * Если {@link #idS} положительная - {@link Student}1 < {@link Student}2
         *
         * @param o {@link Object} {@link Student}2
         * @return {@code idS - ((Student)o).idS}
         */
        @Override
        public int compareTo(Object o) {
            return idS - ((Student) o).idS;
        }
    }
}
