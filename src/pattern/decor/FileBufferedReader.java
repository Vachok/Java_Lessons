package pattern.decor;

/**
 * Класс, расширяет функции {@link FileDecorator}
 * Это надстройка, для того, чтобы добавились собственные функции.
 *
 * @author IKudryashov
 * @see DecMain
 * @since 03.05.2018 (10:42)
 */
class FileBufferedReader extends FileDecorator {
    public FileBufferedReader(FileStream fileStream) {
        super(fileStream);
    }

    /**
     * Добавим свой функционал к методу.
     * Будем читать из буфера.
     *
     * @see FileDecorator
     * @see DecMain
     */
    @Override
    public void read() {
        fileDecorator.read();
        System.out.println("buffered read");
    }
}
