package lessons.general.concurentpack;

import lessons.general.Lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

/**
 * Concurrency
 * <p>
 * Удобнее чем {@code synchronized}. При синхронизации лочится каждый метод, и выполняется поток за потоком.
 * Приложение становится по-факту однопоточным.
 * <p>
 * Пакет {@link java.util.concurrent} блокирует только записи, в основном используя volatile переменные.
 *
 * @since 18.12.2018 (14:20)
 */
public class ConcPack implements Lessons {

    private static final Logger LOGGER = Logger.getLogger(ConcPack.class.getSimpleName());

    @Override
    public void launchMe() {
        linksPut("683-345", "https://youtu.be/t0WgMfYRxik", true);
    }

    /**
     * Это обычный лист, безопасный в отношении потоков.
     * <p>
     * Все mutable-операции создают новый Array и синхронится с оригинальным.
     * Если много операции чтения - лучше использовать его. При записи работает медленее чем обычный {@link ArrayList}.
     * {@link java.util.concurrent.locks.ReentrantLock} используется при записи.
     * <p>
     * Если много писать - лучше использовать {@link java.util.Vector}.
     *
     * @return {@link CopyOnWriteArrayList}
     */
    private List<String> stringList() {
        List<String> list = new CopyOnWriteArrayList<>();
        return list;
    }

    /**
     * {@link Set} - базируемый на {@link #stringList()}.
     *
     * @return {@link CopyOnWriteArraySet}
     */
    private Set<String> stringSet() {
        Set<String> list = new CopyOnWriteArraySet<>();
        return list;
    }
}
