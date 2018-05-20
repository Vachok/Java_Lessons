package pattern.filt;


import java.util.ArrayList;
import java.util.List;

/**
 * <b>Фильтр</b>
 * <p>
 *
 * @see SpeedFilter
 * @since //28.04.2018 (20:00)
 */
public class FiltMain {
    /**
     * Досустим есть {@link List} <code>cars</code> наших {@link CarFord}.
     * Добавим в него несколько экземпляров, но с разными параметрами {@link CarFord#CarFord(int, String, int)}
     * <p>
     * Фильтруем сразу 2мя филтрами.
     * <code>        cars = new SpeedFilter().filter(cars);
     * cars = new DoorsFilter().filter(cars);</code>
     *
     * @param args null
     * @see SpeedFilter
     * @see DoorsFilter
     */
    public static void main(String[] args) {
        CarFord carF = new CarFord(150, "green", 4);
        CarFord carF1 = new CarFord(200, "red", 2);
        CarFord carF2 = new CarFord(250, "black", 4);
        List<CarFord> cars = new ArrayList<>();
        cars.add(carF);
        cars.add(carF1);
        cars.add(carF2);
        andFilter(cars);
        orFilter(cars);
        cars = new SpeedFilter().filter(cars);
        cars = new DoorsFilter().filter(cars);
        for (CarFord car : cars) {
            System.out.println("main" + " = " + car.getMaxSpeed());
        }
    }

    /**
     * Фильтруем сразу по 2м условиям
     * <p>
     *
     * @param cars лист для фильтрации
     * @see AndFilter
     */
    private static void andFilter(List<CarFord> cars) {
        AndFilter andFilter = new AndFilter(new SpeedFilter(), new DoorsFilter());
        cars = andFilter.filter(cars);
        for (CarFord car : cars
                ) {
            System.out.println("andFilter car = " + car.getMaxSpeed());
        }
    }

    /**
     * OrFilter
     * <p>
     * Фильтр, без критериев.
     *
     * @param cars список для фильтрации
     */
    private static void orFilter(List<CarFord> cars) {
        OrFilter orFilter = new OrFilter(new SpeedFilter(), new DoorsFilter());
        cars = orFilter.filter(cars);
        for (CarFord car : cars
                ) {
            System.out.println("orFilter cars = " + car.getMaxSpeed());
        }

    }
}

