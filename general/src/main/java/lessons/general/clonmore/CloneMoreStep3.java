package lessons.general.clonmore;


import java.util.logging.Logger;

/**
 * <b>Clonneable подробнее</b>
 * <p>
 *     Убираем {@link #clone()}. {@link #main(String[])}
 *
 * @see CloneMore
 * @since 08.08.2018 (16:40)
 */
@SuppressWarnings("ALL")
public class CloneMoreStep3 implements Cloneable {


    /*LESSON */
    private static Logger logger = Logger.getLogger(CloneMoreStep3.class.getName());
    /**
     * Для наглядного восприятия клонирования.
     */
    private static int i;

    /**
     * <b>Step 2</b>
     *{@link CloneMore#goApp()}
     <p>
     Убрав переопределение {@link #clone()}, всё работает.<br>
     Необязательно переопределять метод {@link #clone()}! Его нужно переопределять
     при сложном или глубоком клонировании. <a href="https://youtu.be/Bm86HUCrOrs?t=157" target=_blank>tube</a>.<br>

     <code>
     * </code>
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneMoreStep3 cloneMore = new CloneMoreStep3();
        cloneMore.i = 5;
        CloneMoreStep3 cloneMore1 = (CloneMoreStep3) cloneMore.clone();
        logger.info(cloneMore1.i+" i");
    }

    /*END LESSON*/


}
