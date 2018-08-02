package lessons.general.immun;

import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>Immutable классы</h1>
 * <p>
 *     Классы, которые невозможно изменить.
 * {@link #goApp()}
 * @see Student
 * @since 02.08.2018 (13:36)
 */
public class ImmuteClass implements Lessons {
    /**
     * Номер Issue на GitHub . номер
     * <a href="https://www.youtube.com/playlist?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX" target=_blank>Java Lesson</a>
     */
    private static final Double ID_LESSON = 638.323;
    private static final String SOURCE_CLASS = ImmuteClass.class.getSimpleName();
    /**
     * <h3>{@link Map}, для отправки в БД/файл</h3>.
     */
    static Map<String, String> linksToSave = new ConcurrentHashMap<>();

    /**
     * <h2>Immutable классы</h2>
     * <p>
     * 0. Начало урока.
     * {@link Student} - всё, за исключением {@link Student#getDate()}, является Immutable.
     * Проблема с датой:
     * {@link Date} - это ссылочный объект. Он будет меняться в любом случае. Чтобы они отличались - их надо клонировать
     */
    static void goApp() {
        System.out.println("ImmuteClass.goApp");
        linksToSave.put(SOURCE_CLASS, "ImmuteClass.goApp");
        Student student = new Student(18, "Vachok", new Date());
        int i = student.getAge();
        String s = student.getName();
        Date d = student.getDate1();
        i = 1;
        s="Max";
        d.setTime(0);
        System.out.println(student.getAge());
        linksToSave.put(SOURCE_CLASS, student.getAge()+" age");
        System.out.println(student.getName()+" name");
        linksToSave.put(SOURCE_CLASS, student.getName()+" name");
        System.out.println(student.getDate1()+" Date");
        linksToSave.put(SOURCE_CLASS, student.getDate1()+" Date");
    }

    /**
     * <b>Сохнанение прогресса</b>
     *
     * @param lessonName in DB
     * @param links      in DB
     * @param saveToDB   true = save
     */
    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        linksToSave.clear();
        linksToSave.put(SOURCE_CLASS, links);
        SaverProgress saverProgress = new SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, ID_LESSON);
        } else {
            Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
        }
    }

    /**
     * <h2>Загрузочный метод. Запуск класса.</h2>
     */
    @Override
    public void launchMe() {
        boolean isSave = true;
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSave);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/638", isSave);
        linksPut(getClass().getSimpleName(),
            "https://youtu.be/2PPPW6I-C34", isSave);
        goApp();
    }
}

