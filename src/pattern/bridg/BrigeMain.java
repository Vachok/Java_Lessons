package pattern.bridg;

import pattern.factor.Car;

/**
 * <b>Основной класс. Brige</b>
 * <p>
 * Мост между конкретной имплементацией и интерфейсом.
 * Например, у нас есть круг. Его надо сделать жёлтым. Без моста нужно:
 * <code>Нарисовать круг, "нарисовать" цвет, "запихнуть цвет в круг."</code>
 * С помощью моста, можно сделать сразу жёлтый круг.
 * <p>
 *
 * @since 28.04.2018
 */
public class BrigeMain {

    /**
     * @param args null
     */
    public static void main(String[] args) {
        CarI carI = new TeslaCar(new CarIBridge());
        carI.drive();
    }
}
