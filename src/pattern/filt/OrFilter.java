package pattern.filt;

import java.util.List;

/**
 * OrFilrer. Несколько условий сразу. С учетом параметра.
 * <p>
 * Можно объединить {@link SpeedFilter} <b>или</b> {@link DoorsFilter}
 *
 * @author 14350
 * @see AndFilter
 * @since 30.04.2018
 */
class OrFilter implements CarFilter {
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
    public OrFilter(CarFilter filterOne, CarFilter filterTwo) {
        this.filterOne = filterOne;
        this.filterTwo = filterTwo;
    }

    /**
     * Создаются 2 фильтра.
     * <p>
     *
     * @param cars {@link CarFord} лист машин
     * @return отфильтрованный по {@link #filterOne} или {@link #filterTwo} лист машин
     */
    @Override
    public List<CarFord> filter(List<CarFord> cars) {
        List<CarFord> list = filterOne.filter(cars);
        List<CarFord> list2 = filterTwo.filter(cars);
        for (CarFord car : list2) {
            if (!list.contains(car)) {
                list.add(car);
            }
        }
        return list;
    }
}
