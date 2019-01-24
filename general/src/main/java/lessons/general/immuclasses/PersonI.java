package lessons.general.immuclasses;

/**
 * Пример класса, члена {@link MyIm}
 * <p>
 *
 * @since 24.01.2019 (11:52)
 */
public class PersonI implements Cloneable {
    int age;

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
