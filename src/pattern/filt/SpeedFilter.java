package pattern.filt;

import java.util.List;

/**
 * Фильтр по скорости
 * <p>
 *     Будет выполнять фильтрацию. Должен имплементить {@link CarFilter}
 * @since 29.04.2018
 */
class SpeedFilter implements CarFilter {

    @Override
    public List<CarFord> filter(List<CarFord> cars) {
        return null; //stopship
    }
}
