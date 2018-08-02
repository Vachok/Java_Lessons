package lessons.general.immun;

import java.util.Date;

/**
 * <h1>Immutable класс. Пример.</h1>
 <p>
 Основные условия.
 <p>
 -поля должды сетаться только один раз. В момент создания или через конструктор
 <p>
 -поля должны быть приватными
 <p>
 -setterов быть не должно. только getter!
 <p>
 -ссылочные объекты, такие как {@link Date}, нужно клонировать.
 <p>
 -сам класс должен быть final.

 Пример НЕ финального класса. {@link NotFinStudent}
 @see ImmuteClass#goApp()
 @since 02.08.2018 (16:43)
 */
final class Student{
    private int age;
    private String name;
    private Date date;

    public Student(int age, String name, Date date) {
        this.age = age;
        this.name = name;
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    /**
     * @return
     * @deprecated
     */
    @Deprecated
    public Date getDate() {
        return date;
    }

    public Date getDate1() {
        return (Date)date.clone();
    }
}
