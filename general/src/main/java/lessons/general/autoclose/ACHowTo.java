package lessons.general.autoclose;

import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>Как AutoClosable работает</h1>
 <p>
 * @since 01.08.2018 (15:44)
 */
public class ACHowTo implements Lessons {
    private static final Double ID_LESSON = 634.321;
    private static final String SOURCE_CLASS = ACHowTo.class.getSimpleName();
    /**
     * <h3>{@link Map}, для отправки в БД/файл</h3>.
     *
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();

    /**
     * 0. Начало урока.
     *
     */
    public static void goApp(){
        Thread.currentThread().setName("ACHowTo.goApp");
    }
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
        SaverProgress saverProgress = new SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, ID_LESSON);
        } else {
            Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
        }
    }

    /**
     * Загрузочный метод. Запуск класса.
     */
    @Override
    public void launchMe() {
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, true);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/634", true);
        linksPut(getClass().getSimpleName(),
            "https://youtu.be/3Mj2W1wRfGw?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX&t=97", true);

    }
}
