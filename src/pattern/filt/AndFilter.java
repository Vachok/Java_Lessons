package pattern.filt;

import java.util.List;

/**
 * AndFilter. Несколько условий сразу.
 * <p>
 * Можно объединить {@link SpeedFilter} и {@link DoorsFilter}
 *
 * @author 14350
 * @see OrFilter
 * @since 30.04.2018
 */
class AndFilter implements CarFilter {
    /**
     * Условие 1.
     */
    CarFilter filterOne;
    /**
     * Условие 2
     */
    CarFilter filterTwo;

    /**
     * @param filterOne создание фильтра 1
     * @param filterTwo создание фильтра 2
     * @see FiltMain
     */
    public AndFilter(CarFilter filterOne, CarFilter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }

    /**
     * Создаются 2 фильтра. {@link #AndFilter(CarFilter, CarFilter)}.
     * <p>
     * Сначала к <code>cars</code> применяется {@link #filterOne}, потом,
     * к отфильтрованному <code>list</code>, применяется {@link #filterTwo}
     *
     * @param cars {@link CarFord} лист машин
     * @return отфильтрованный по {@link #filterOne} и {@link #filterTwo} лист машин
     */
    @Override
    public List<CarFord> filter(List<CarFord> cars) {
        List<CarFord> list = filterOne.filter(cars);
        return filterTwo.filter(list);
    }
}
