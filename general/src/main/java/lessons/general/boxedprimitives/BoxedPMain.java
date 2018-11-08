package lessons.general.boxedprimitives;

import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**<b>Пул обёрток над примитивами</b>
 * {@link #goApp()}
 * @since 19.09.2018 (11:39)
 */
public class BoxedPMain implements Lessons {
    private static final String SOURCE_CLASS = BoxedPMain.class.getSimpleName();
    private static final double ID_LESSON = 667.338;
    private static final String LESSON_NAME = "Пул обёрток над примитивами";
    private static boolean isSaved = true;
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();
    private Logger logger = Logger.getLogger(SOURCE_CLASS);

    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        linksToSave.clear();
        linksToSave.put(LESSON_NAME, links);
        SaverProgress saverProgress = new SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, String.valueOf(ID_LESSON));
        } else Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
    }

    @Override
    public void launchMe() {
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSaved);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/662", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/Bm86HUCrOrs", isSaved);
        goApp();
    }

    /**
     * Двойное равенство проверяет объекты в памяти
     * <p>
     * Task :run <br>
     * true <br>
     * false <br>
     * b = 5 <br>
     *     </p>
     *     <p>Операция a++, при автобоксинге, будет выглядеть примерно так: <br>
     *        {@code int c=a; c++; a=c} </p>
     *        {@link #goNext()}
     *
     */
    private void goApp() {
        Integer a = 5;
        Integer b = a;
        System.out.println(a==b);
        a++;
        System.out.println(a==b);
        System.out.println("b = " + b);
        goNext();
    }

    /**
     * Значения в боксах необходимо сравнивать по-equals.
     *
     */
    private void goNext(){
        System.out.println("BoxedPMain.goNext");
        Integer a = 200;
        Integer b = 200;
        System.out.println(a!=b);
        System.out.println(a.equals(b));
        bytesEq();
    }

    /**
     * В данном случае a==b.
     * Потому что значение меньше 128. Оно занимает 1 байт и хранится в пуле.<br>
     * Если 128+ - значения будут уже в HEAP, и == будет false.
     */
    private void bytesEq(){
        System.out.println("BoxedPMain.bytesEq");
        Integer a = 100;
        Integer b = 100;
        System.out.println(a!=b);
        System.out.println(a.equals(b));
    }
}
