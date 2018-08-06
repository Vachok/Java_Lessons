package lessons.j8.opti;

import lessons.j8.Lessons;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * <h1>Optional</h1>
 * {@link #goApp(boolean)}
 *
 * @since 06.08.2018 (15:07)
 */
public class Option implements Lessons {
    /**
     * <h2>GitHubID</h2>.<h2>JavaLesson ID</h2>
     */
    private static final Double ID_LESSON = 655.330;

    private static final String SOURCE_CLASS = Option.class.getSimpleName();
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();

    /**
     * <h2>Возвращает null</h2>
     *
     * @return null
     * @deprecated
     */
    @Deprecated
    static Object getO() {
        return null;
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
        lessons.j8.helper.SaverProgress saverProgress = new lessons.j8.helper.SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, ID_LESSON);
        } else Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
    }

    /**<h2>Борьба с null</h2>
     * Так можно побороть NullPointerException.
     * @return {@link Optional}
     */
    static Optional<String> getO1() {
        if (false) {
            return Optional.of("Hello");
        }
        return Optional.empty();
    }

    /**
     * Загрузочный метод. Запуск класса.
     */
    @Override
    public void launchMe() {
        boolean isSaved = true;
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSaved);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/655", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/k7PlG32BzI8?t", isSaved);
        goApp(isSaved);
    }

    /**
     * <h2>Return NULL...</h2>
     * Как предлагают бороться с нулём.
     * <p>
     *     Нужно проверить {@code isPresent} на нулёвость.
     *     Вместо {@code return null}, лучше делать {@code return Optional.empty}.
     *     Таким способом мы избавляемся от NullPointerException.
     * {@link #getO()} , {@link #getO1()},
     * {@link #nullEx(boolean)}
     *
     * @param isSaved to DB
     */
    private void goApp(boolean isSaved) {
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, this.toString() + " " + isSaved);
        linksPut(SOURCE_CLASS, this.toString(), isSaved);
/*       nullEx(isSaved);*/
        Optional<String> optionalS = Optional.empty();
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> stringOptional = getO1();
        if(stringOptional.isPresent()){
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, stringOptional.get() + " " + isSaved);
            linksPut(SOURCE_CLASS, stringOptional.get(), isSaved);
        }
        streamOpt(isSaved);
    }

    /**<h2>Стримы</h2>
     * {@link Stream} возвращает {@link Optional}
     * Нужно проверить и тогда сделать get.
     * @param isSaved to DB
     */
    private void streamOpt(boolean isSaved) {
        /*boolean present = Stream.of(1, 3).min().isPresent();*/
    }

    /**
     * <h2>Null</h2>
     * Распространенная ошибка. NullPointer.
     *
     * @param isSaved to DB
     * @deprecated
     */
    @Deprecated
    private void nullEx(boolean isSaved) {
        Object o = getO();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, o.hashCode() + " o.hash" + isSaved);
        linksPut(SOURCE_CLASS, o.hashCode() + " o.hash", isSaved);
    }
}
