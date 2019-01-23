package lessons.general.immucollection;

import lessons.general.Lessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Immutable коллекции
 * <p>
 *
 * @since 23.01.2019 (9:50)
 */
public class ImuCollect implements Lessons {

    private static final Logger LOGGER = Logger.getLogger(ImuCollect.class.getSimpleName());

    @Override
    public void launchMe() {
        linksPut("697-353", "https://youtu.be/G_Fm994sUMM", false);
        createImmu();
    }

    /**
     * Создание Immutable коллекции
     * <p>
     * Read-only коллекции элементов.
     */
    private void createImmu() {
        LOGGER.setLevel(Level.ALL);
        LOGGER.warning("ImuCollect.createImmu");
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list = Collections.unmodifiableList(list);
        try {
            list.add("three");
        } catch (UnsupportedOperationException e) {
            LOGGER.throwing("ImuCollect", "createImmu", e);
        }
        list.forEach(x -> LOGGER.info(x));
    }
}
