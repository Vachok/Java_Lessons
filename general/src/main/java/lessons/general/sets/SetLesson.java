package lessons.general.sets;

import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaveToFile;
import lessons.general.helper.SaverProgress;

import java.util.*;
import java.util.logging.Logger;

/**
 * Sets
 * <p>
 * {@link Set} - это лист <b>уникальных объектов</b>.
 * <p>
 * Существует 3 основные имплементации. {@link HashSet}, {@link java.util.TreeSet}, {@link java.util.LinkedHashSet}. <br>
 * <p>
 * Все имплементации работают на базе {@link Map}.
 * {@link #setStart()}.
 *
 * @since 17.12.2018 (10:23)
 */
public class SetLesson implements Lessons {

    private static final Logger LOGGER = Logger.getLogger(SetLesson.class.getSimpleName());
    /**
     * Более 3х повторений. Строка
     */
    private static final String THREE = "three";

    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        LOGGER.info("SetLesson.linksPut");
        SaverProgress saverProgress = new SaveToFile();
        if (saveToDB) {
            saverProgress = new SaveToDatabase();
        }
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put(lessonName, links);
        boolean saved = saverProgress.isSaved(stringStringMap, "670-340");
        LOGGER.info(saved + " to DB");
    }

    @Override
    public void launchMe() {
        LOGGER.info("SetLesson.launchMe");
        linksPut("Set Lesson", "https://youtu.be/D4gWs7PCn5U?t=12", false);

        newStudent();
    }

    private void newStudent() {
        Student student = new Student(0);
        student.main();
    }

    /**
     * Добавим 3 одинаковых объекта. <br>
     * Size всё равно будет = 1. Все объекты легли в одну "ячейку" памяти.
     * <p>
     * {@link #hashSet()}, {@link #treeSet()}, {@link #linkedHSet()}
     */
    private void setStart() {
        LOGGER.info("SetLesson.setStart");
        Set<String> stringSet = new HashSet<>();
        stringSet.add("one");
        stringSet.add("one");
        stringSet.add("one");
        LOGGER.info(stringSet.size() + " set size, three strings \"one\"");
        LOGGER.info(hashSet().size() + " size with null.\n" + "Contains null: " + hashSet().contains(null));
        LOGGER.info(linkedHSet().size() + " Linked HashSet.\n");
        LOGGER.info(treeSet().size() + " TreeSet.\n");
    }

    /**
     * Если нам не важен порядок, а важна только уникальность значений - используем {@link HashSet} <br>
     *
     * @return {@link HashSet}
     */
    private Set<String> hashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add(null);
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add(THREE);
        hashSet.add("four");
        hashSet.add("five");
        for (String s : hashSet) {
            LOGGER.info(s);
        }
        return hashSet;
    }

    /**
     * Отдаёт элементы сортированные по-алфавиту.
     *
     * @return {@link TreeSet}
     */
    private Set<String> treeSet() {
        Set<String> hashSet = new TreeSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add(THREE);
        hashSet.add("four");
        hashSet.add("five");
        for (String s : hashSet) {
            LOGGER.info(s);
        }
        return hashSet;
    }

    /**
     * Отдаёт элементы в порядке их добавления.
     *
     * @return {@link LinkedHashSet}
     */
    private Set<String> linkedHSet() {
        Set<String> hashSet = new LinkedHashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add(THREE);
        hashSet.add("four");
        hashSet.add("five");
        for (String s : hashSet) {
            LOGGER.info(s);
        }
        return hashSet;
    }
}
