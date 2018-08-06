package lessons.j8.funcfaces;


import lessons.j8.Lessons;
import lessons.j8.helper.SaveToDatabase;
import lessons.j8.helper.SaverProgress;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @since 05.08.2018 (18:44)
 */
public class FuncFace implements Lessons {

    /**
     * Simple Name класса, для поиска настроек
     */
    private static final String SOURCE_CLASS = FuncFace.class.getSimpleName();
    private static final double ID_LESSON = 652.327;
    private static MessageToUser messageToUser = new MessageCons();
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();


    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        linksToSave.clear();
        linksToSave.put(lessonName, links);
        SaverProgress saverProgress = new SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, ID_LESSON);
        } else Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
    }

    @Override
    public void launchMe() {
        boolean isSaved = true;
        goApp(isSaved);
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSaved);
        messageToUser.info(this.getClass().getPackageName(), SOURCE_CLASS, isSaved+"");
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/652", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/oUvx2Up-PkA", isSaved);

    }

    /**<h2>{@link Predicate}</h2>
     <p>
     Функциональный интерфейс {@link Predicate}, позволяет сохранить какую-либо функцию для последующего использования.
     Проверим на соответствие числа 3 и 10.
     Выражение сохраняется в интерфейс. Как-бы переопределяя метод "test".
     {@link #conSum(boolean)}
     * @param isSaved saved in DB
     */
    private void goApp(boolean isSaved) {
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, "FuncFace.goApp 55" + isSaved);
        linksPut(SOURCE_CLASS, "FuncFace.goApp 55", isSaved);
        Predicate<Integer> predicate = x->x>5;
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, predicate.test(3) + " " + isSaved);
        linksPut(SOURCE_CLASS, predicate.test(3)+"", isSaved);
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, predicate.test(10) + " " + isSaved);
        linksPut(SOURCE_CLASS, predicate.test(10)+"", isSaved);
        conSum(isSaved);
    }

    /**<h2>Consumer Interface</h2>
     * Разница c {@link #goApp(boolean)}, в том, что {@code Predicate} - это Generic (типизированый).
     * На входе он получает , к примеру {@link Integer}, на выходе {@link Boolean}. Т.е. <b>выходной</b> параметр
     * определён заранее, а входной определяем мы сами.
     *У {@link Consumer} выходной параметр {@link Void}.
     * @param isSaved to DB
     */
    private void conSum(boolean isSaved) {
        Consumer<Integer> consumer = x->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, x + " " + isSaved);
            linksPut(SOURCE_CLASS, x+"", isSaved);
        };
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO,consumer +" " + isSaved);
        linksPut(SOURCE_CLASS, consumer+"", isSaved);
        funCt(isSaved);
    }

    /**<h2>Function</h2>
     * Тут первый параметр, входной, второй выходной.
     * @param isSaved to DB
     */
    private void funCt(boolean isSaved) {
        Function<Integer, String> function = x->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, x.toString() + " " + isSaved);
            linksPut(SOURCE_CLASS, x.toString(), isSaved);
            return x.toString();
        };
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, function + " " + isSaved);
        linksPut(SOURCE_CLASS, function+"", isSaved);
        suppLie(isSaved);
    }

    /**<h2>Supplier Interface</h2>
     *Принимает 0 параметров на вход. На выходе в данном примере должен быть {@link Integer}
     * @param isSaved to DB
     */
    private void suppLie(boolean isSaved) {
        Supplier<Integer> supplier=()->new Integer(5);
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, supplier + " " + isSaved);
        linksPut(SOURCE_CLASS, supplier+"", isSaved);
        uinar(isSaved);
    }

    /**<h2>UnaryOperator</h2>
     *На входе и выходе - {@link Integer}
     * @param isSaved to DB
     */
    private void uinar(boolean isSaved) {
        UnaryOperator<Integer> unaryOperator= x->x*x;
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, unaryOperator + " " + isSaved);
        linksPut(SOURCE_CLASS, unaryOperator+"", isSaved);
        binar(isSaved);
    }

    /**<h2>BinaryOperator</h2>
     * Похож на {@link #uinar(boolean)}, но принимает на вход 2 параметра. ({@link Integer})
     * @param isSaved to DB
     */
    private void binar(boolean isSaved) {
        BinaryOperator<Integer> binaryOperator = (x,y) -> x*y;
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO,binaryOperator +" " + isSaved);
        linksPut(SOURCE_CLASS, binaryOperator+"", isSaved);
        myPredicM(isSaved);
    }

    /**<h2>Напишем свой функциональный интерфейс</h2>
     * {@link MyPredic}
     * Будем принимать {@link Integer}.
     * @param isSaved to DB
     */
    private void myPredicM(boolean isSaved) {
        MyPredic<Integer> myPredic = (x)->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, x + " " + isSaved);
            linksPut(SOURCE_CLASS, x+"", isSaved);
        };
        myPredic.apply(5);
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, myPredic+" " + isSaved);
        linksPut(SOURCE_CLASS, myPredic+"", isSaved);
    }

}
