package solid.liskov;

/**
 * <b>Основной класс</b>
 * <p>
 * Суть. Все классы, которые мы наследуем, не должны трогать параметры родителя.
 *
 * @since 01.06.2018 (16:42)
 */
public class LiskovMain {
    static Squarer getRectangle() {
        return new Squarer();
    }

    /**
     * В данном варианте изменяются параметры родителя.
     * Тут {@link Square}, наследуется от {@link Rectangle}.
     * И поменялось поведение родителя ({@link Rectangle}).
     * Вместо умножения 10 на 5, {@link Rectangle#height}*{@link Rectangle#wight},
     * умножает 5*5 {@link Square#wight}*{@link Square#height}. Так делать не верно.
     *
     * @param args null;
     * @see Square
     */
    public static void main(String[] args) {
        Squarer rectangle = getRectangle();
        rectangle.setWight(5);
        System.out.println(rectangle.getSquarer());
    }
}

