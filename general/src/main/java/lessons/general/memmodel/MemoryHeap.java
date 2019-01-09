package lessons.general.memmodel;

import java.util.logging.Logger;

/**
 * Модель HEAP-memory
 *
 * @since 09.01.2019 (13:55)
 */
public class MemoryHeap {
    private static final Logger LOGGER = Logger.getLogger(MemoryHeap.class.getSimpleName());

    /**
     * Young Generation.
     * <p>
     * Хранит инфо об объектах, которые используются быстро. <br>
     * Например, если в методе {@link MemoryStack#doJob(int, Object)},
     * вызвать new {@link java.util.Date}, дата запишется сюда,
     * и будет очищена при выходе из метода. <br>
     */
    public void youngGen() {
        LOGGER.info("MemoryHeap.youngGen");
        youngGenEdenArea();
    }

    /**
     * Область {@link #youngGen()}
     * <p>
     * Сюда попадает новый объект. Если объект большой, он может попасть сразу в {@link #oldGen()}. <br>
     * Чистится {@link MemoryGC#serialCollector()} .
     */
    private void youngGenEdenArea() {
        LOGGER.info("MemoryHeap.edenArea");
    }

    /**
     *
     */
    public void oldGen() {
        LOGGER.info("MemoryHeap.oldGen");
    }

    /**
     * Не используется с Java 8.
     */
    public void permanentGen() {
        throw new UnsupportedOperationException("See METASPACE");
    }

}
