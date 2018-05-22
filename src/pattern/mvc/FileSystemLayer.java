package pattern.mvc;

/**
 * Роется на диске, ищет студентов.
 *
 * @author IKudryashov
 * @see Controllerm
 * @since 21.05.2018 (16:55)
 */
class FileSystemLayer implements ModelLayer {

    /**
     * Код, для выгребания с локального диска.
     *
     * @return new {@link Student}
     */
    @Override
    public Student getStudent() {
        String student = new String(Student.class.getCanonicalName().getBytes());
        return new Student();
    }
}
