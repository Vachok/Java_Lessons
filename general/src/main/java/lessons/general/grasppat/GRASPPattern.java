package lessons.general.grasppat;

import lessons.general.Lessons;

import java.util.concurrent.Executors;
import java.util.logging.Logger;

/**
 * GRASP паттерны
 * <p>
 *
 * @since 23.01.2019 (11:59)
 */
public class GRASPPattern implements Lessons {

    private static final Logger LOGGER = Logger.getGlobal();

    @Override
    public void launchMe() {
        LOGGER.warning("GRASPPattern.launchMe");
        linksPut("702-358", "https://youtu.be/K6bToZuw9Uo?t=482", true);
        controlPat();
    }

    /**
     * {@link GRASPController}
     */
    private void controlPat() {
        LOGGER.warning("GRASPPattern.controlPat");
        LOGGER.info("Use the controller");
        LOGGER.info(new GRASPController().toString());
        creatorPat();
    }

    /**
     * {@link GRACPCreator}
     */
    private void creatorPat() {
        LOGGER.warning("GRASPPattern.creatorPat");
        LOGGER.info("Creator & Info Patterns");
        highCohe();
    }

    /**
     * {@link HighCoheshionPat}
     */
    private void highCohe() {
        LOGGER.warning("GRASPPattern.highCohe");
        new HighCoheshionPat().run();
        inDir();
    }

    /**
     * Indirection
     * <p>
     * При общении объектов, должен быть промежуточный. Пример - <b>Spring MVC</b>
     */
    private void inDir() {
        LOGGER.warning("GRASPPattern.inDir");
    }


}
