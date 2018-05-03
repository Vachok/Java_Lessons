package pattern.bridg;

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
     * Концепция в следующем.
     * <p>
     * Есть, например <b>Tesla</b>. Они выпускают несколько моделей авто ({@link TeslaCar}, {@link TeslaTruck}).
     * Для того, чтобы можно было "прокатиться" на обеих версиях, и каждый раз не задавать параметры,
     * можно воспользоваться мостом, ({@link TruckIBridge}, {@link CarIBridge}), который эти параметры
     * уже должен знать.
     * <img src="G:\My_Proj\Velkom\Internetor\Java_Lessons\src\pattern\bridg\3levelVS2levelIerarchy.png" alt="null">
     *
     * <a href="https://youtu.be/xe_N2bn3KCE?t=750">Видео</a>
     *
     * @param args null
     */
    public static void main(String[] args) {
        CarI carI = new TeslaTruck(new CarIBridge());
        carI.drive();
        CarI carIT = new TeslaCar(new CarIBridge());
        carIT.drive();
        System.out.println(new CarIBridge().toString());
    }
}
