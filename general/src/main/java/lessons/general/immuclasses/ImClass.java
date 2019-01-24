package lessons.general.immuclasses;

import lessons.general.Lessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

/**
 * Imutable классы
 * <p>
 * Неизменяемые. THREAD-SAFE. <br>
 * 1. Все поля {@code private final} <br>
 * 2. Нет setters. <br>
 * 3. Imutable-поля должны быть clone()
 *
 * @since 24.01.2019 (11:47)
 */
public class ImClass implements Lessons {

    private static final Logger LOGGER = Logger.getGlobal();

    @Override
    public void launchMe() {
        linksPut("705-361", "https://youtu.be/zIG3bSKMRhc", false);
        startingLes();
    }

    private void startingLes() {
        LOGGER.warning("ImClass.startingLes");
        MyIm myIm = new MyIm(5, Collections.singletonList("1"), new PersonI(), "Hello");
        myIm.getPersonI().age = 5;
        LOGGER.info(myIm.getPersonI().age + " age");
    }
}
