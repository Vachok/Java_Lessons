package lessons.general.clonmore;


import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.util.Arrays;
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
public class CloneMore implements Lessons, Cloneable {

    private static final Double ID_LESSON = 662.337;

    private static final String SOURCE_CLASS = CloneMore.class.getSimpleName();

    private static boolean isSaved = true;

    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();

    /**
     * Для наглядного восприятия клонирования.
     */
    int i;

    /*LESSON */

    private Logger logger = Logger.getLogger(SOURCE_CLASS);

    /**
     * <b>Step 1</b>
     *
     * Создадим метод, который будет клонировать этот класс. Переопределим {@link #clone()} и зададим поле {@link #i}
     * При вызове получим
     <p>
     <code>
      Task :run
     * сент. 06, 2018 2:39:34 ПП lessons.general.clonmore.CloneMore goApp
     * INFO: 5</code>
     */
    public void goApp() throws CloneNotSupportedException {
        linksPut(SOURCE_CLASS, "ClonMore~!", isSaved);
        CloneMore cloneMore = new CloneMore();
        cloneMore.i = 5;
        CloneMore cloneMore1 = (CloneMore) cloneMore.clone();
        logger.info(cloneMore.i +"");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*END LESSON*/


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
        try {
            goApp();
        } catch (CloneNotSupportedException e) {
            logger.throwing(SOURCE_CLASS, "${END}", e);
        }
    }


}
