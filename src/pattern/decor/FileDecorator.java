package pattern.decor;

/**
 * Декоратор для {@link FileStreamReader}
 * Должен содержать экземпляр класса-оригинала. {@link FileStream}
 *
 * @author IKudryashov
 * @see FileBufferedReader
 * @since 03.05.2018 (10:36)
 */
abstract class FileDecorator implements FileStream {
    /**
     * @see FileStream
     */
    FileStream fileDecorator;

    /**
     * Конструктор, чтобы перенаправить запрос.
     *
     * @param fileDecorator {@link FileStream}
     */
    public FileDecorator(FileStream fileDecorator) {
        this.fileDecorator = fileDecorator;
    }

    /**
     * @see DecMain#main(String[])
     */
    public abstract void read();
}
