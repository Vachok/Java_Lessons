package lessons.general.memmodel;

import java.util.logging.Logger;

/**
 * Хранит инфо о статическом содержимом
 *
 * @since 09.01.2019 (14:05)
 */
public class MemoryMetaSpace {
    private static final Logger LOGGER = Logger.getLogger(MemoryMetaSpace.class.getSimpleName());

    public void metaSpace() {
        LOGGER.info("MemoryHeap.metaSpace");
        LOGGER.info("Хранит инфо о статическом содержимом");
    }

}
