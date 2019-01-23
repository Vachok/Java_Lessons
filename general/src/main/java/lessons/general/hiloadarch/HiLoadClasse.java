package lessons.general.hiloadarch;

import lessons.general.Lessons;

import java.util.logging.Logger;

/**
 * Высоконагруженная архитектура
 * <p>
 *
 * @since 23.01.2019 (10:19)
 */
public class HiLoadClasse implements Lessons {

    private static final Logger LOGGER = Logger.getGlobal();

    @Override
    public void launchMe() {
        LOGGER.warning("HiLoadClasse.launchMe");
        linksPut("698-354", "https://youtu.be/iUpE2np5XEM", false);
    }
}
