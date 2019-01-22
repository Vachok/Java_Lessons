package lessons.general.overheap;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.logging.Logger;

/**
 * Unsafe-подход к работе с памятью напрямую.
 *
 * @see OverHeap
 * @since 22.01.2019 (17:29)
 */
public class UnsafeMeth implements Runnable {

    private static final Logger LOGGER = OverHeap.LOGGER;

    /**
     * Класс {@link sun.misc.Unsafe} получить обычными методами нельзя. <br>
     * Нужно использовать рефлексию. {@link #getUnsafeCl()}
     */
    @Override
    public void run() {
        LOGGER.warning("UnsafeMeth.run");
        try {
            getUnsafeCl();
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * Получаем "неполучаемое". {@link Unsafe}
     * <p>
     * 1. Получение поля {@link  Unsafe#theUnsafe} <br>
     * 2.
     */
    private void getUnsafeCl() throws NoSuchFieldException, IllegalAccessException {
        LOGGER.warning("UnsafeMeth.getUnsafeCl");

        Field field = Unsafe.class.getField("theUnsafe");
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);
        long startAddr = unsafe.allocateMemory(1024);
        unsafe.putInt(startAddr, 5);
        unsafe.putInt(startAddr + 4, 10);
        LOGGER.info(unsafe.getInt(startAddr) + " getInt5");
        LOGGER.info(unsafe.getInt(startAddr + 4) + " getInt10");
        LOGGER.info(startAddr + " start");
        unsafe.freeMemory(startAddr);
    }
}
