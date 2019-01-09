package lessons.general.memmodel;

import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 * Модель Garbage Collector.
 *
 * @since 09.01.2019 (14:23)
 */
public class MemoryGC {

    private static final Logger LOGGER = Logger.getLogger(MemoryGC.class.getSimpleName());

    /**
     * @throws NoSuchMethodException {@link MemoryHeap#youngGen()}
     */
    public void rootS() throws NoSuchMethodException {
        LOGGER.info("MemoryGC.rootS");
        Class<MemoryMetaSpace> memoryMetaSpaceClass = MemoryMetaSpace.class;
        Method youngGen = MemoryHeap.class.getMethod("youngGen");
        LOGGER.info(memoryMetaSpaceClass.getSimpleName() + " " + youngGen.getName());
    }

    /**
     * Serial Garbage collector
     * <p>
     * Смотрит в {@link MemoryHeap#youngGenEdenArea()} когда место в нём заканчивается,
     * если на объект не остаётся ссылок в {@link #rootS()}, если объект большой
     * или когда объект пережил несколько сборок мусора, он копируется в {@link MemoryHeap#oldGen()}.
     * Остальные объекты будут уничножены. <br>
     * Остаётся пустой {@link MemoryHeap#youngGen()}
     */
    public void serialCollector() {
        LOGGER.info("MemoryGC.serialCollector");
    }

    /**
     * Параллельно чистит {@link MemoryHeap#youngGen()}
     */
    public void parallelCollector() {
        LOGGER.info("MemoryGC.parallelCollector");
    }

    /**
     * Разбивает {@link MemoryHeap#oldGen()}, на несколько фаз сбора.
     * 1. Собирает информацию об объектах, для удаления (минимальный стоп).
     * 2. Помечает на удаление параллельно с работой приложения.
     * 3. Следит на объектами, которые были изменены в момент просмотра.
     * 4. Быстро помечает изменения (минимальный стоп)
     * 5. Удаляет.
     * <p>
     * <b>Но он не делает дефрагментацию!</b>
     */
    public void cmsCollector() {
        LOGGER.info("MemoryGC.cmsCollector");
    }

    /**
     * Самый новый коллектор, используется с java 7.
     */
    public void g1Collector() {
        LOGGER.info("MemoryGC.g1Collector");
    }
}
