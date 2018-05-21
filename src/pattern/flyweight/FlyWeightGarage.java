package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Прверочный класс.
 *
 * @author IKudryashov
 * @see Mercedes
 * @since 03.05.2018 (13:25)
 */
class FlyWeightGarage {
    /**
     * Гаражик для мерседесов.
     */
    Map<String, Mercedes> map = new HashMap<>();

    /**
     * Проверка на наличие объекта.
     *
     * @param color цвет
     * @return Мерс нужного цвета
     */
    Mercedes getMercedes(String color) {
        Mercedes mercedes = map.get(color);
        if (mercedes == null) {
            mercedes = new Mercedes();
            mercedes.color = color;
            map.put(color, mercedes);
        }
        return mercedes;
    }
}
// at 03.05.2018 (13:30)