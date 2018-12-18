package lessons.general.clonmore;


import java.util.logging.Logger;

/**
 * <b>Clonneable подробнее</b>
 * <p>
 *     Убираем {@link Cloneable}. Тк {@link #clone()} приходить от {@link Object}, мы моем так сделать.
 *
 * @see CloneMore
 * @since 08.08.2018 (16:40)
 */
@SuppressWarnings("ALL")
public class CloneMoreStep2  {


    /*LESSON */
    private static Logger logger = Logger.getLogger(CloneMoreStep2.class.getName());
    /**
     * Для наглядного восприятия клонирования.
     */
    private static int i;

    /**
     * <b>Step 2</b>
     *{@link CloneMore#goApp()}
     <p>
     Убрав интерфейс {@link Cloneable}, получаем эксепшн:
     <code>
     Task :CloneMoreStep2.addToList() FAILED
     Exception in thread "addToList" java.lang.CloneNotSupportedException: lessons.general.clonmore.CloneMoreStep2
     at java.base/java.lang.Object.clone(Native Method)
     at lessons.general.clonmore.CloneMoreStep2.clone(CloneMoreStep2.java:45)
     at lessons.general.clonmore.CloneMoreStep2.addToList(CloneMoreStep2.java:39)

     FAILURE: Build failed with an exception.
     * </code>
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneMoreStep2 cloneMore = new CloneMoreStep2();
        cloneMore.i = 5;
        CloneMoreStep2 cloneMore1 = (CloneMoreStep2) cloneMore.clone();
        logger.info(cloneMore1.i+" i");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*END LESSON*/


}
