package lessons.general.stringpull;

import lessons.general.Lessons;

import java.util.logging.Logger;

/**
 * Как обычную строку поместить в pull
 * <p>
 *
 * @since 09.01.2019 (15:38)
 */
public class StrPull implements Lessons {

    private static final Logger LOGGER = Logger.getGlobal();

    @Override
    public void launchMe() {
        linksPut("694-350", "https://youtu.be/1QP8y6-1fD0?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX", false);
        stringInternal();
    }

    /**
     * Пул стрингов
     * <p>
     * {@link String}s по-умолчанию помещаются в пулл. Объекты создаются, как ссылки на объекты пула. <br>
     * <b>eq</b> сравнение значений, <b>==</b> сравнение по-объекту.
     * {@link #stringInternal1()}
     */
    private void stringInternal() {
        LOGGER.info("StrPull.stringInternal");
        String oneStr = "one";
        String twoStr = "one";
        LOGGER.info(oneStr.equals(twoStr) + " eq");
        LOGGER.info((oneStr == twoStr) + " ==");
        stringInternal1();
    }

    /**
     * В {@link #stringInternal()}, мы создали ссылки на один объект в пуле, тут будет 2 объекта.
     * <p>
     * <b>==</b> - false. Для размещение new {@link String} в пуле, нужно вызвать метод {@link String#intern()} .
     */
    private void stringInternal1() {
        LOGGER.info("StrPull.stringInternal");
        String oneStr = "one";
        String twoStr = new String("one");
        LOGGER.info(oneStr.equals(twoStr) + " eq");
        LOGGER.info((oneStr == twoStr) + " ==");
        String strThree = new String(twoStr.getBytes()).intern();
        LOGGER.info((oneStr == strThree) + " intern()");

    }
}
