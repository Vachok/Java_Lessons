package lessons.general.clonmore;

import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <b>Clonneable подробнее</b>
 * <p>
 * {@link #goApp()}
 *
 * @since 08.08.2018 (16:40)
 */
@SuppressWarnings("ALL")
public class CloneMore implements Lessons {
    private static final Double ID_LESSON = 662.337;
    private static final String SOURCE_CLASS = CloneMore.class.getSimpleName();
    private static boolean isSaved = true;
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();

    public void goApp() {
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, "ClonMore~!" + " " + isSaved);
        linksPut(SOURCE_CLASS, "ClonMore~!", isSaved);
    }

    /**
     * <b>Сохнанение прогресса</b>
     * <p>
     *
     * @param lessonname in DB
     * @param links      in DB
     * @param saveToDB   true = save
     */
    @Override
    public void linksPut(String lessonname, String links, boolean saveToDB) {
        linksToSave.clear();
        linksToSave.put(lessonname, links);
        SaverProgress saverProgress = new SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, ID_LESSON);
        } else Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
    }

    /**
     * Загрузочный метод. Запуск класса.
     */
    @Override
    public void launchMe() {
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSaved);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/662", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/Bm86HUCrOrs", isSaved);
        goApp();
    }

}
