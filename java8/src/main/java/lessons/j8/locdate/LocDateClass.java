package lessons.j8.locdate;

import lessons.j8.Lessons;
import lessons.j8.lambada.LaMbaDa;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**<h1>Local Date</h1>
 * @since 07.08.2018 (17:13)
 */
public class LocDateClass implements Lessons {
    /**
     * <h2>GitHubID</h2>.<h2>JavaLesson ID</h2>
     */
    private static final Double ID_LESSON = 659.334;

    private static final String SOURCE_CLASS = LaMbaDa.class.getSimpleName();
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();

    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        linksToSave.clear();
        linksToSave.put(lessonName, links);
        lessons.j8.helper.SaverProgress saverProgress = new lessons.j8.helper.SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, ID_LESSON);
        } else Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
    }

    @Override
    public void launchMe() {
        boolean isSaved = true;
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSaved);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/659", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/3yJD7PClPjE", isSaved);
        goApp(isSaved);
    }

    private void goApp(boolean isSaved) {
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, "go-go-go LocalDate" + " " + isSaved);
        linksPut(SOURCE_CLASS, "go-go-go LocalDate", isSaved);
    }
}
