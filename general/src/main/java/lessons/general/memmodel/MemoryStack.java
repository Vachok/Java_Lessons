package lessons.general.memmodel;

import java.util.logging.Logger;

/**
 * Условный стэк памяти java
 * Каждый <b>поток создаёт собственный стэк</b> в памяти.
 *
 * @since 09.01.2019 (13:55)
 */
public class MemoryStack {

    private static final Logger LOGGER = Logger.getLogger(MemoryStack.class.getSimpleName());

    /**
     * Заполнение стэка памяти начинается отсюда. <br>
     * Вызов {@link #doJob(int, Object)}, добавит в стэк.
     *
     * @param args null
     */
    public static void main(String[] args) {
        LOGGER.info("MEMSTACK BEGIN");
        doJob(5, new Object());
    }

    /**
     * @param i сохраняется в стэке памяти.
     * @param o может быть большим, и сохраняется в {@link MemoryHeap#youngGen()} . В метод передаёт ссылку.
     */
    private static void doJob(int i, Object o) {
        LOGGER.info("MemoryStack.doJob");
        LOGGER.info(i + " " + o.toString() + " стэк памяти. Большие объекты в идут в heap.");
    }
}
