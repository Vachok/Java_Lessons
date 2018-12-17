package lessons.general.sets;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

/**
 * Сколько раз будет запущен {@link #hashCode()} при добавлении 3х элементов в {@link #hashSet()} (3)
 * <p>
 * Сколько раз будет запущен {@link #hashCode()} при добавлении 3х элементов в {@link #treeSet()} (ни разу) <br>
 * Потому что {@link Student} нужно как-то сравнить. Для этого класс нужно как-то сравнить (impl {@link Comparable}). <br>
 *
 * @see SetLesson
 * @since 17.12.2018 (11:34)
 */
public class Student {

    private static final Logger LOGGER = Logger.getLogger(Student.class.getSimpleName());
    int id;

    public Student(int id) {
        this.id = id;
    }

    public void main() {
        hashSet();
    }

    private Set<Student> hashSet() {
        Set<Student> hashSet = new HashSet<>();
        hashSet.add(new Student(1));
        hashSet.add(new Student(3));
        hashSet.add(new Student(2));
        for (Student s : hashSet) {
            LOGGER.info(s.id + " student id.");
        }
        return hashSet;
    }

    private Set<Student> treeSet() {
        Set<Student> hashSet = new TreeSet<>();
        hashSet.add(new Student(1));
        hashSet.add(new Student(3));
        hashSet.add(new Student(2));
        for (Student s : hashSet) {
            LOGGER.info(s.id + " student id.");
        }
        return hashSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
