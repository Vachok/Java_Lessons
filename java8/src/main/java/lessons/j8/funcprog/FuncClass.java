package lessons.j8.funcprog;

import lessons.j8.Lessons;

import java.nio.channels.Channel;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>Функциональное программирование</h1>
 * <p>
 * {@link #goApp()}
 *
 * @since 03.08.2018 (15:36)
 */
public class FuncClass implements Lessons {

    /**
     * <h2>GitHubID</h2>.<h2>JavaLesson ID</h2>
     */
    private static final Double ID_LESSON = 640.325;

    private static final String SOURCE_CLASS = FuncClass.class.getSimpleName();
    /**<h2>Пример "функционалки"</h2>
     <p>
     *Тут точно нет side effect. Начальное состояние объекта не меняется.
     * Лямбды это элемент функционального программирования. Но сам по-себе язык не является функциональным.
     * Потому что методы с <i>side effect</i> всё ещё возможны.
     */
    Function<Integer, Integer> add1 = x->x*x;
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
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/640", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/zGXc-SXQwYs", isSaved);

    }

    /**
     * <h2>Запускающий метод</h2>
     * <p>
     * {@link #sqUare(int)}
     */
    public void goApp() {
        System.out.println("FuncClass.goApp");
        linksToSave.put(SOURCE_CLASS, "FuncClass.goApp");
    }

    /**
     * <h2>Сколько параметров на входе и выходе?</h2>
     * <p>
     * Входным параметром является <b>начальное состояние</b> объекта. Метод имеет 2 параметра на входе
     * и два на выходе.
     * {@link #processMessage(Channel)}
     *
     * @param x пример
     * @return пример
     */
    public int sqUare(int x) {
        return x * x;
    }

    /**
     * <h2>Публичный метод</h2>
     * Проблема - мы не знаем ,что происходит внутри.
     * Нужно разбираться что там проиходит. Меняется ли состояние объекта. И т.п.
     *{@link #getCurrentProgram(TVGuide, int)}
     * @param channel какой-то канал.
     * @return какой-то boolean
     */
    public boolean processMessage(Channel channel) {

        /*много разного кода*/

        return true || false;
    }

    /**<h2>Сколько тут входных параметров?</h2>
     <p>
     Метод ужасен. Нормальное тестирование невозможно. Из-за new {@link Date} внутри метода.
     Это скрытый параметр. Метод имеет <i>side effect</i>. Побочный эффект.
     Это решает функциональное программирование.
     В Java - это лямбды. {@link #add1}
     {@link #getCurrentProgram(TVGuide, int, Date)} - правильный вариант.
     * @param guide test
     * @param channel test
     * @return test
     * @deprecated
     */
    public Program getCurrentProgram(TVGuide guide, int channel){
        Schedule schedule = guide.getSchedule(channel);
        Program current = schedule.programAt(new Date());
        return current;
    }

    /**<b>Правильный метод</b>
     * {@link #getCurrentProgram(TVGuide, int)} - так не делать.
     * @param guide тест
     * @param channel тест
     * @param date тест
     * @return тест
     */
    public Program getCurrentProgram(TVGuide guide, int channel,  Date date){
        Schedule schedule = guide.getSchedule(channel);
        Program current = schedule.programAt(date);
        return current;
    }
}
