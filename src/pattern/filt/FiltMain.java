package pattern.filt;


import java.util.ArrayList;
import java.util.List;

/**
 * <b>Фильтр</b> <a href="https://github.com/Vachok/Java_Lessons/issues/532" target=_blank>Filter #532</a>
 * <p>
 *
 * @since //28.04.2018 (20:00)
 */
public class FiltMain {
    /**
     * Досустим есть {@link List} наших {@link CarFord}.
     * Добавим в него несколько экземпляров, но с разными параметрами {@link CarFord#CarFord(int, String, int)}
     *
     * @param args null
     */
    public static void main(String[] args) {
        CarFord carF = new CarFord(150, "green", 4);
        CarFord carF1 = new CarFord(200, "red", 2);
        CarFord carF2 = new CarFord(250, "black", 4);
        List<CarFord> cars = new ArrayList<>();
        cars.add(carF);
        cars.add(carF1);
        cars.add(carF2);
    }
}

