package pattern.mvc;

/**
 * Интерфейс, для взаимодействия с моделью.
 *
 * @author IKudryashov
 * @see Controllerm
 * @see MvcMain
 * @since 21.05.2018 (16:50)
 */
interface ModelLayer {
    /**
     * @return {@link Student}
     */
    Student getStudent();
}
