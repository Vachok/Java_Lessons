package lessons.general.reftypes;

import lessons.general.Lessons;

import java.util.logging.Logger;

/**
 * Типы Reference
 * <p>
 *
 * @since 18.12.2018 (17:07)
 */
public class RefTypesLesson implements Lessons {

    private static final Logger LOGGER = Logger.getLogger(RefTypesLesson.class.getSimpleName());

    @Override
    public void launchMe() {
        LOGGER.info("RefTypesLesson.launchMe");
        linksPut("686-348", "https://youtu.be/yBcV-zcCifE", true);
    }
}
