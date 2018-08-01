package lessons.general.expipelin;

import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <b>Эксепшены и Pipeline оператор</b>
 * <p>
 {@link Exception} можно "сливать" в один блок, но только если они меют разных родителей.

 * @since 28.07.2018 (19:29)
 */
@SuppressWarnings("ALL")
public class ExPip implements Lessons {
    private static final Double ID_LESSON = 633.320;
    private static final String SOURCE_CLASS = ExPip.class.getSimpleName();
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();

    public static void goApp(){
        try{
            File file = new File("temp.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            Connection connection = DriverManager.getConnection("");
        }catch (FileNotFoundException | SQLException e){
            e.printStackTrace();
        }
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
        System.out.println("ExPip.linksPut");
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
        System.out.println("ExPip.launchMe");
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, true);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/633", true);
        linksPut(getClass().getSimpleName(), "https://youtu.be/odgwVoWPU0Y?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX", true);

    }
}