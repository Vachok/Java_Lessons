package pattern.strat;

/**
 * <b>Основной класс</b>
 * <p>
 * Можно представить, как магазин. Где есть <code>price</code>,
 * который может изменятся. Например, скидка.
 * {@link #main(String[])}
 *
 * @author IKudryashov
 * @since 18.05.2018 (16:02)
 */
public class StratMain {
    /**
     * Не нужно писать много <code>if, else</code> и т.п. {@link #mai()}.
     * Правильный подход. 1 раз, прописать {@link Context}, везде в программе указываем
     * его, вместо непосредственно <code>price</code>.
     *
     * @param args null
     */
    public static void main(String[] args) {
        mai();
        Context context = new Context(new HalfPrice());
        double startPrice = 100;
        double price = context.getPrice(startPrice);
        System.out.println("правильный price = " + price);
    }

    /**
     * Постоянно переделывать <code>price</code> - утомительно.
     * Особенно, если он в куче мест. Тут пользуемся
     * стратегией. {@link Strat}
     * Стратегию нужно энкапсулировать в объект.
     * {@link Context}
     *
     * @deprecated
     */
    @Deprecated
    private static void mai() {

        double price = 100;
        System.out.println("price = " + price);
        price = 100 * 0.7;
        System.out.println("today = " + price);
        boolean fullStrategy = true;
        if (fullStrategy) price = 1004;
        System.out.println("fullStrategy = " + price);
        if (!fullStrategy) {
            price = HalfPrice.class.hashCode();
            System.out.println("price = " + price);
        } else {
            System.out.println("Так делать не надо!");
        }

    }
}