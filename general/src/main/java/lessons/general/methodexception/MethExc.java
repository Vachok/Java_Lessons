package lessons.general.methodexception;

import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <b>Method Exceptions</b>
 * <p>
 * исключения, выбрасываемые методами.
 *
 * @since 25.07.2018 (14:14)
 */
public class MethExc implements Lessons {
    /**
     * ID урока. GitHub . Youtube
     */
    private static final double ID_LESSON = 632.319;
    /**
     * {@link SaveToDatabase}
     */
    private SaverProgress saverProgress = new SaveToDatabase();
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();

    /**
     * 1. Запуск
     * .1 {@link #linksPut(String, String, boolean)}
     */
    @Override
    public void launchMe() {
       Logger.getLogger(this.getClass().getSimpleName()).log(Level.INFO,"MethExc.launchMe");
        linksPut(this.getClass().getPackageName(), "MethExc", true);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/632", true);
        linksPut(getClass().getSimpleName(), "https://youtu.be/64hA_lXw-gk", true);
    }

    /**
     * <b>Сохнанение прогресса</b>
     * <p>
     * {@link #exIerar()}
     *
     * @param lessonname in DB
     * @param links      in DB
     * @param saveToDB   true = save
     */

    public void linksPut(String lessonname, String links, boolean saveToDB) {
        linksToSave.put(lessonname, links);
        if (saveToDB) saverProgress.isSaved(linksToSave, String.valueOf(ID_LESSON));
        else Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
    }

    /**
     * <b>иерархия {@code Exceptions}</b>
     * <p>
     * Throwable throwable;
     * <i>Error error; unchecked</i>
     * Exception exception;
     * <i>RuntimeException runtimeException; unchecked</i>
     * IOException ioException;
     * <p>
     * {@link #empMeth}
     */
    public static void exIerar() {
        Throwable throwable;
        Error error;
        Exception exception;
        RuntimeException runtimeException;
        IOException ioException;

        throw new Error();
    }

    /**
     * <b>Пустой метод</b>
     * <p>
     * Может-ли бросать все виды {@code Exceptions}?
     * Да, может.
     * {@link #tryCat}
     */
    static void empMeth() throws IOException, Throwable, RuntimeException, Error, Exception {

    }

    /**
     * <b>Try and Catch</b>
     * <p>
     * {@link IOException} не может быть пустым!
     * {@link Base}
     */
    static void tryCat() {
        try {

        } catch (Throwable e) {

        }
        try {

        } catch (Error e) {

        }
        try {

        } catch (Exception e) {

        }
        try {

        } catch (RuntimeException e) {

        }
//        try{
//
//        }catch (IOException e){
//
//        }
    }
}