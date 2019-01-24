package lessons.general.syncbad;

import lessons.general.Lessons;

import java.util.logging.Logger;

/**
 * Почему синхронизация это плохо
 * <p>
 * Различные виды синхронизации может замедлить приложение в 100 и более раз.
 *
 * @see Counter
 * @since 23.01.2019 (11:22)
 */
public class WhySyncIsBad implements Lessons {

    private static final Logger LOGGER = Logger.getGlobal();

    @Override
    public void launchMe() {
        LOGGER.warning("WhySyncIsBad.launchMe");
        linksPut("701-357", "https://youtu.be/FOCfds4NrQk", false);
        exampleCount();
    }

    /**
     * Посчитаем до миллиарда с засечкой времени
     * <p>
     * 69 миллисек. <br>
     * Посчитаем переменную {@code volatile} - {@link #exampleVolatile()}
     */
    private void exampleCount() {
        LOGGER.warning("WhySyncIsBad.exampleCount");
        Counter counter = new Counter();
        long stArt = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            counter.countI();
        }
        LOGGER.info(System.currentTimeMillis() - stArt + " msec");
        exampleVolatile();
    }

    /**
     * Посчитаем до миллиарда с засечкой времени используя {@code volatile}
     * <p>
     * 8679 msec. <b>Разница более чем в 10 раз!</b> <br>
     * Попробуем {@link java.util.concurrent.atomic.AtomicInteger} - {@link #exampleAtomicI()}
     */
    private void exampleVolatile() {
        LOGGER.warning("WhySyncIsBad.exampleVolatile");
        Counter counter = new Counter();
        long stArt = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            counter.countVilatile();
        }
        LOGGER.info(System.currentTimeMillis() - stArt + " msec");
        exampleAtomicI();
    }

    /**
     * Посчитаем до миллиарда с засечкой времени используя {@link java.util.concurrent.atomic.AtomicInteger}
     * <p>
     * 7737 msec. <br>
     * Пробуем {@code synchronized} - {@link #exampleSync()}
     */
    private void exampleAtomicI() {
        LOGGER.warning("WhySyncIsBad.exampleAtomicI");
        Counter counter = new Counter();
        long stArt = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            counter.countAtomicI();
        }
        LOGGER.info(System.currentTimeMillis() - stArt + " msec");
        exampleSync();
    }

    /**
     * Посчитаем до миллиарда с засечкой времени используя {@code synchronized}
     * <p>
     * 2283 msec <br>
     */
    private void exampleSync() {
        LOGGER.warning("WhySyncIsBad.exampleSync");
        Counter counter = new Counter();
        long stArt = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000_000; i++) {
            counter.countSync();
        }
        LOGGER.info(System.currentTimeMillis() - stArt + " msec");
    }
}
