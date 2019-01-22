package lessons.general.overheap;

import lessons.general.Lessons;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Logger;

/**
 * Размещение объектов вне heap
 * <p>
 *
 * @since 22.01.2019 (16:27)
 */
public class OverHeap implements Lessons {

    static final Logger LOGGER = Logger.getGlobal();

    private String s = " remaining";
    private String s1 = " capacity";
    private String s2 = " limit";
    private String s3 = " position";

    @Override
    public void launchMe() {
        linksPut("695-351", "https://youtu.be/fFN_wIKGjtk", false);
        offHeapMem();
    }

    /**
     * Любой объект создаётся в heapmem, а ссылка на него помещается в стэк.
     * <p>
     * напр. new {@link Object}. Но иногда надо разместить объект вне хипа. <br>
     * Это быстрее, но нужно аккуратно, т.к. JVM не будет принимать участие в жизненном цикле объекта.
     */
    private void offHeapMem() {
        LOGGER.info("OverHeap.offHeapMem");
        new Object();
        bufferClass();
    }

    /**
     * {@link Buffer} - работает с native memory.
     * <p>
     * {@link ByteBuffer#allocate(int)} - распределяет память <br>
     * {@link ByteBuffer#get()} -  пишет в память <br>
     * {@link ByteBuffer#clear()} - чистит <br>
     * {@link ByteBuffer#flip()} - возврат в начало
     * <p>
     * В память можно записать файл. {@link #writeMemFile()}
     */
    private void bufferClass() {
        LOGGER.info("OverHeap.bufferClass");
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.get(new byte[]{1, 2, 3});
        LOGGER.warning("Allocate");
        LOGGER.info(buffer.position() + s3);
        LOGGER.info(buffer.limit() + s2);
        LOGGER.info(buffer.capacity() + s1);
        LOGGER.info(buffer.remaining() + s);
        buffer.flip();
        LOGGER.warning("FLIP");
        LOGGER.info(buffer.position() + s3);
        LOGGER.info(buffer.limit() + s2);
        LOGGER.info(buffer.capacity() + s1);
        LOGGER.info(buffer.remaining() + s);
        buffer.clear();
        LOGGER.warning("CLEAR");
        LOGGER.info(buffer.position() + s3);
        LOGGER.info(buffer.limit() + s2);
        LOGGER.info(buffer.capacity() + s1);
        LOGGER.info(buffer.remaining() + s);
        writeMemFile();
    }

    /**
     * Пишем файл.
     * <p>
     * Другой подход при работе с оперативкой: {@link #unsafeMethod()}
     */
    private void writeMemFile() {
        LOGGER.warning("OverHeap.writeMemFile");
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\ikudryashov\\IdeaProjects\\lessons\\general\\build.gradle")) {
            FileChannel fileChannel = inputStream.getChannel();
            int read = fileChannel.read(byteBuffer);
            LOGGER.info(read + " read");
        } catch (IOException e) {
            LOGGER.throwing("writememfile", e.getMessage(), e);
        }
        LOGGER.info(byteBuffer.position() + s3);
        LOGGER.info(byteBuffer.limit() + s2);
        LOGGER.info(byteBuffer.capacity() + s1);
        LOGGER.info(byteBuffer.remaining() + s);
        byteBuffer.clear();
        unsafeMethod();
    }

    /**
     * {@link UnsafeMeth}
     */
    private void unsafeMethod() {
        new UnsafeMeth().run();
    }

}
