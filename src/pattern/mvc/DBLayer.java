package pattern.mvc;

/**
 * Роется в БД, ищет студентов.
 *
 * @author IKudryashov
 * @see Controllerm
 * @since 21.05.2018 (16:55)
 */
class DBLayer implements ModelLayer {

    /**
     * Код, для выгребания из базы данных.
     *
     * @return new {@link Student}
     */
    @Override
    public Student getStudent() {
        return new Student();
    }
}
