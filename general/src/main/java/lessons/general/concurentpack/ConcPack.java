package lessons.general.concurentpack;

import lessons.general.Lessons;

import java.util.logging.Logger;

/**
 * @since 18.12.2018 (14:20)
 */
public class ConcPack implements Lessons {
    private static final Logger LOGGER = Logger.getLogger(ConcPack.class.getSimpleName());

    @Override
    public void launchMe() {
        linksPut("683-345", "https://youtu.be/t0WgMfYRxik", true);
    }
}
