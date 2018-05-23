package pattern.flyweight;

/**
 * <b>Основной класс</b>
 * <p>
 *Суть. Если много однотипных объектов, их не создавать, а проверять наличие.
 * и если объект есть - отдавать его, и только в случае отсутсвия - создавать.
 *
 * @author IKudryashov
 * @since 03.05.2018
 */
public class FwMain {
    /**
     * Применим проверку на практике
     * <p>
     * Оба "Мерседеса" будут с одним hashCode.
     *
     * @param args null
     */
    public static void main(String[] args) {
        FlyWeightGarage flyWeightGarage = new FlyWeightGarage();
        Mercedes mercedes = flyWeightGarage.getMercedes("green");
        Mercedes mercedes2 = flyWeightGarage.getMercedes("green");
        System.out.println(mercedes.hashCode());
        System.out.println(mercedes2.hashCode());
    }
}
