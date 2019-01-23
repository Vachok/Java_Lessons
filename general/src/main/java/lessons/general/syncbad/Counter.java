package lessons.general.syncbad;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Счётчик
 * <p>
 *
 * @see WhySyncIsBad
 * @since 23.01.2019 (11:26)
 */
class Counter {

    int i;
    volatile int iVolatile;
    AtomicInteger iAtom = new AtomicInteger(0);

    /**
     * Просто счёт
     */
    void countI() {
        i++;
    }

    /**
     * Счёт {@code volatile}
     */
    void countVilatile() {
        iVolatile++;
    }

    /**
     * Счёт {@link AtomicInteger}
     */
    public void countAtomicI() {
        iAtom.incrementAndGet();
    }

    /**
     * Счёт {@code synchronized}
     */
    public synchronized void countSync() {
        i++;
    }
}
