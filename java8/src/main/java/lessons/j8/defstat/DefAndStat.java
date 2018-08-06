package lessons.j8.defstat;

import lessons.j8.Lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>Default и Static методы</h1>
 *{@link #goApp(boolean)}
 * @since 06.08.2018 (12:31)
 */
public class DefAndStat implements Lessons {
    /**
     * <h2>GitHubID</h2>.<h2>JavaLesson ID</h2>
     */
    private static final Double ID_LESSON = 654.329;

    private static final String SOURCE_CLASS = DefAndStat.class.getSimpleName();
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();

    /**
     * <b>Сохнанение прогресса</b>
     * <p>
     *
     * @param lessonName in DB
     * @param links      in DB
     * @param saveToDB   true = save
     */
    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        linksToSave.clear();
        linksToSave.put(lessonName, links);
        lessons.j8.helper.SaverProgress saverProgress = new lessons.j8.helper.SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, ID_LESSON);
        } else Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
    }

    /**
     * Загрузочный метод. Запуск класса.
     */
    @Override
    public void launchMe() {
        boolean isSaved = true;
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSaved);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/654", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/ABbVCzoaQow", isSaved);
        goApp(isSaved);
    }

    /**<h2>Ключевое слово default</h2>
     * В интерфейсы добавлено:
     * default и static методы. {@link A}
     * @param isSaved to DB
     */
    private void goApp(boolean isSaved) {
        List<String> list = new ArrayList<>();
        list.stream();
        int add = A.add(5, 5);
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, add + " " + isSaved);
        linksPut(SOURCE_CLASS, add+"", isSaved);
        sayHel(isSaved);
    }

    private void sayHel(boolean isSaved) {
        A a = new B();
        a.sayHello();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, "a.sayHello() +"  + isSaved);
        linksPut(SOURCE_CLASS, "a.sayHello()",isSaved);
    }

}

