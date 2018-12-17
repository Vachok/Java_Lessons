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
 * <p>
 * {@link MyCloseable}
 *
 * @since 01.08.2018 (15:44)
 */
public class ACHowTo implements Lessons {
    /**
     * Номер Issue на GitHub . номер
     * <a href="https://www.youtube.com/playlist?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX" target=_blank>Java Lesson</a>
     */
    private static final Double ID_LESSON = 634.321;
    private static final String SOURCE_CLASS = ACHowTo.class.getSimpleName();
    /**
     * <h3>{@link Map}, для отправки в БД/файл</h3>.
     */
    static Map<String, String> linksToSave = new ConcurrentHashMap<>();

    /**
     * 0. Начало урока.
     * Выбросим эксепшн из конструктора {@link MyCloseable#MyCloseable()}
     * Все ресурсы, которые объявлены, и включены в {@code try-catch with resources},
     * будут закрыты, перед эксепшном. В отличие от <b>try-catch-finally</b>
     * На самом деле в этом варианте, выбрасывается множество {@link Exception}, но из них надо сделать {@link Throwable}
     * @see #goAppThr()
     */
    public static void goApp() {
        Thread.currentThread().setName("ACHowTo.goApp");
        try (MyCloseable myCloseable = new MyCloseable()) {
            myCloseable.doIt();
        } catch (Exception e) {
            System.out.println("ACHowTo.goApp EXCEPTION");
            linksToSave.put(SOURCE_CLASS, "ACHowTo.goApp EXCEPTION");
        }
    }

    /**
     * <h2>Вариант с {@link Throwable}</h2>
     <p>
     Ловим <i>Suppressed</i> эксепшены.
     */
    public static void goAppThr() {
        Thread.currentThread().setName("ACHowTo.goApp");
        try (MyCloseable myCloseable = new MyCloseable()) {
            myCloseable.doIt();
        } catch (Exception e) {
            System.out.println("ACHowTo.goAppThr EXCEPT");
            linksToSave.put(SOURCE_CLASS, "ACHowTo.goAppThr EXCEPT");
            Throwable[] throwable = e.getSuppressed();
            for (Throwable throwable1 : throwable) {
                System.out.println(throwable1);
                linksToSave.put(SOURCE_CLASS, throwable1.toString());
            }
        }
    }
    /**
     * <b>Сохнанение прогресса</b>
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
            saverProgress.isSaved(linksToSave, String.valueOf(ID_LESSON));
        } else {
            Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
        }
    }
    /**
     * <h2>Загрузочный метод. Запуск класса.</h2>
     */
    @Override
    public void launchMe() {
        goAppThr();
        boolean isSave = false;
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSave);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/634", isSave);
        linksPut(getClass().getSimpleName(),
            "https://youtu.be/3Mj2W1wRfGw?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX&t=97", isSave);

    }
}
