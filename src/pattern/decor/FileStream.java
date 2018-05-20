package pattern.decor;

/**
 * Есть интерфейс, с методом {@link #read()}
 *
 * @author IKudryashov
 * @see FileDecorator
 * @see FileBufferedReader
 * @since 03.05.2018 (10:28)
 */
interface FileStream {
    void read();
}

/**
 * Класс, который переопределяет {@link FileStream}
 *
 * @author IKudryashov
 * @see DecMain
 * @since 03.05.2018 (10:30)
 */
class FileStreamReader implements FileStream {

    @Override
    public void read() {
        System.out.println("read file");
    }
}
