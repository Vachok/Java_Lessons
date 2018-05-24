package pattern.composentry;

/**
 * <b>Основной класс</b>
 * <p>
 *Есть несколько взаимосвязанных сервисов. Неудобно дёргать их по-одиночке. {@link DepObj1}, {@link DepObj2}.
 *Дёргаем всё за 1 раз.
 * @author IKudryashov
 * @since 22.05.2018 (12:34)
 * @see CoarseGainObj
 */
public class ComposEntMain {
    /**
     * Получим объединённый объект.
     *
     * @param args null
     */
    public static void main(String[] args) {
        ComposiEntity composiEntity = new ComposiEntity();
        for (String s : composiEntity.getData()) {
            System.out.println("s = " + s);
        }
    }
}


