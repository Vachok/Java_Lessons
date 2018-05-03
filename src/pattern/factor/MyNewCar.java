package pattern.factor;

import pattern.absfact.Factory;

/**
 * Использование {@link Factory} классом {@link MyNewCar}
 * <p>
 * Запрос в {@link Factory}, где мы просим {@link Car} toyota и audi,
 * Классы {@link Toyota} {@link Audi}, переопределяют метод {@link Car#drive()}.
 * На выходе в этом классе, имеем "максимальную скорость" по-марке.
 * <a href='https://youtu.be/A4uNotdECBg'>YouTube</a>
 */
public class MyNewCar {
    public static void main(String[] args) {
    }
}
