package pattern.filt;

import java.util.ArrayList;
import java.util.List;

/**
 * Фильтр по скорости
 * <p>
 *     Будет выполнять фильтрацию. Должен имплементить {@link CarFilter}
 * @since 29.04.2018
 * @version <a href="https://youtu.be/u_QTGD3Z9EU?t=268" target=_blank>stop</a>
 */
class SpeedFilter implements CarFilter {

    /**
     * Если макс. скорость {@link CarFord#getMaxSpeed()}, более <b>180</b>,
     * тогда добавить в <code>List list = new ArrayList();</code>
     * и вернуть его в {@link FiltMain}.
     *
     * @param cars {@link CarFord}
     * @return
     * @see FiltMain
     */
    @Override
    public List<CarFord> filter(List<CarFord> cars) {
        List<CarFord> list = new ArrayList<>();
        for (CarFord car : cars) {
            if (car.getMaxSpeed() > 180) {
                list.add(car);
            }
        }return list;
    }
}
