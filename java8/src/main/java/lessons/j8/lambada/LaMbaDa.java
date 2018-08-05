package lessons.j8.lambada;

import lessons.j8.Lessons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>Лямбда</h1>
 *{@link #goApp()}
 * @since 03.08.2018 (16:56)
 */
public class LaMbaDa implements Lessons {
    /**
     * <h2>GitHubID</h2>.<h2>JavaLesson ID</h2>
     */
    private static final Double ID_LESSON = 651.326;

    private static final String SOURCE_CLASS = LaMbaDa.class.getSimpleName();
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
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/651", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/jHStUYP1NEg?t=560", isSaved);
        goApp();
    }

    /**
     * <h2>Пример лямбды</h2>
     *
     * {@code  (x,y)-> System.out.println("hello");} - (параметры) стрелка тело. ({@link #laMethod(int, int)} - тоже самое, но метод).
     *
     * Параметр, не указывает на тип. Потому что функция не существует "сама по-себе"
     * Лямбда применяется в контексте.
     <p>
     Основное применение - при работе со стримами, при использовании анонимных или функциональных классов.
     {@link #itWas()}
     */
    private void goApp(){
        /*(x,y)-> System.out.println("hello");*/
        itWas();
    }
    /**{@link #goApp()}
     * @param x тест
     * @param y тест
     */
    private void laMethod(int x, int y){
        System.out.println("hello");
        laParams();
    }

    /**
     * <h2>Пример и концепция использования лямбды</h2>
     <p>
     Передаваемые параметры в лямбды - {@link #laParams()}
     {@link #itWas()} - так было до 8й.
     */
    private void conceptFunc(){
        Runnable runnable = ()-> System.out.println("NOW");
        linksToSave.put(SOURCE_CLASS, "NOW");
        ActionListener actionListener = event -> System.out.println("LaMbaDa.ActionListener");
        linksToSave.put(SOURCE_CLASS, "LaMbaDa.conceptFunc");
        laMethod(1, 2);
    }

    /**
     * <h2>Как было</h2>
     <p>
     {@link #conceptFunc()} - как стало.
     */
    private void itWas(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("WAS");
                linksToSave.put(SOURCE_CLASS, "WAS");
            }
        };
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("LaMbaDa.actionPerformed");
                linksToSave.put(SOURCE_CLASS, "LaMbaDa.actionPerformed");
            }
        };
        conceptFunc();
    }

    /**
     *<h2>Передаваемые параметры</h2>
     * {@code s} = неявная {@code final} переменная.
     * Нельза менят её значение ни до лямбды, ни в самой лямбде.
     *
     */
    private void laParams(){
        String s = "hello";
        ActionListener actionListener = (ActionEvent event) -> System.out.println(s);
    }
}
