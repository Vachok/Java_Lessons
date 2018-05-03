package pattern.filt;

import java.util.ArrayList;
import java.util.List;

/**
 * Фильтр по кол-ву дверей
 * <p>
 * Будет выполнять фильтрацию. Должен имплементить {@link CarFilter}
 * Почти полная копия {@link SpeedFilter}.
 *
 * @see SpeedFilter
 * @author IKudryashov
 * @since 30.04.2018
 */
class DoorsFilter implements CarFilter {

    /**
     * Если макс. скорость {@link CarFord#getMaxSpeed()}, более <b>180</b>,
     * тогда добавить в {@code List list = new ArrayList();}
     * и вернуть его в {@link FiltMain}.
     *
     * @param cars {@link CarFord}
     * @return отфильтрованный список
     * @see FiltMain
     */
    @Override
    public List<CarFord> filter(List<CarFord> cars) {
        List<CarFord> list = new ArrayList<>();
        for (CarFord car : cars) {
            if (car.getDoors() > 2) {
                list.add(car);
            }
        }
        return list;
    }
}
