package pattern.flyweight;

/**
 * Есть авто <i>Мерседес</i>.
 * <p>
 * Машины могут быть разных цветов. Но чтобы не создавать несколько раз
 * машину одного цвета, можно воспользоваться {@link FlyWeightGarage}.
 *
 * @author IKudryashov
 * @see FwMain
 * @since 03.05.2018 (13:23)
 */
class Mercedes {
    String color;
}

