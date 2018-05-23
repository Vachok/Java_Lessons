package pattern.mvc;

/**
 * Через этот интерфейс, будем выводить инфо.
 *
 * @author IKudryashov
 * @see Controllerm
 * @since 21.05.2018 (17:06)
 */
interface ViewVachok {
    /**
     * Интерфейс вывода.
     *
     * @param student {@link Student}
     * @see HtmlViewS
     * @see ConsoleViewS
     */
    void showStudent(Student student);
}

