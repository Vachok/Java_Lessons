package lessons.general.grasppat;

import java.util.logging.Logger;

/**
 * High Coheshion
 * <p>
 * У класса должна быть чёткая направленность. <br>
 * Допустим класс Ресторан, не может включать в себя методы "повар", "уборщик", "официант".
 * Всё надо разбивать на отдельные классы и методы.
 *
 * @since 23.01.2019 (12:31)
 */
public class HighCoheshionPat implements Runnable {

    private static final Logger LOGGER = Logger.getGlobal();

    @Override
    public void run() {
        LOGGER.warning("HighCoheshionPat.run");
    }
}
