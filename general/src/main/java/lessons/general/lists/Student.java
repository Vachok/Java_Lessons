package lessons.general.lists;

import lessons.general.ConstantsFor;

import java.util.logging.Logger;

/**
 * Класс Student
 * <p>
 * Для возможности сортировки ( {@link ListsLesson#studentList()} ), необходимо заимплементить {@link Comparable} <br>
 * и переопределить {@link #compareTo(Object)}
 */
class Student implements Comparable {
    private static final Logger LOGGER = Logger.getLogger(Student.class.getSimpleName());
    int idS;
    String nameS;

    public Student(int idS) {
        LOGGER.info("Student.Student");
        this.idS = idS;
    }

    /**
     * Метод сравнения. <br>
     * {@link Student}1 - текущий объект <br>
     * {@link Student}2 - сравниваемый объект
     * <p>
     * Концепция: <br>
     * Если возвращается 0 - {@link Student}1 == {@link Student}2
     * Если {@link #idS} отрицательная - {@link Student}1 < {@link Student}2
     * Если {@link #idS} положительная - {@link Student}1 < {@link Student}2
     *
     * @param o {@link Object} {@link Student}2
     * @return {@code idS - ((Student)o).idS}
     */
    @Override
    public int compareTo(Object o) {
        return idS - ((Student) o).idS;
    }
}
