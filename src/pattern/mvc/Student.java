package pattern.mvc;

/**
 * Условная модель. {@link Controllerm}
 * <p>
 * Изображает базу данных, пример.
 *
 * @author IKudryashov
 * @since 21.05.2018 (16:51)
 */
public class Student {
    String name = "Vachok";
    int age = 34;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }
}

