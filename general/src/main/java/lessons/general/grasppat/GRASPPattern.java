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
        lowCoupling();
    }

    /**
     * Low Coupling
     * <p>
     * Классы должны знать <b>минимум</b> о струтуре других классов.
     * Общаться исключительно через {@code Public Interfaces}.
     */
    private void lowCoupling() {
        LOGGER.warning("GRASPPattern.lowCoupling");
        plymorfNeed();
    }

    /**
     * Polymorphism
     * <p>
     * Use полиморфизм
     */
    private void plymorfNeed() {
        LOGGER.warning("GRASPPattern.plymorfNeed");
        protectedVariations();
    }

    /**
     * Protected Variations
     * <p>
     * Use интерфейсы!
     */
    private void protectedVariations() {
        LOGGER.warning("GRASPPattern.protectedVariations");
        pureFabrication();
    }

    /**
     * Pure Fabrications
     * <p>
     * Use сервисы.
     */
    private void pureFabrication() {
        LOGGER.warning("GRASPPattern.pureFabrication");
    }
}
