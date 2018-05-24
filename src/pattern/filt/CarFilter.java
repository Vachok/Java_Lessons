package pattern.filt;

import java.util.List;

/**
 * CarFilter - фильтр машин ({@link CarFord})
 * <p>
 * Java_Lessons
 *
 * @author 14350
 * @see FiltMain
 * @since 29.04.2018
 */
interface CarFilter {
    /**
     * Принимаем лист - отдаём отфильтрованный {@link List}
     *
     * @param cars {@link CarFord}
     * @return отфильтрованный {@link CarFord}
     */
    List<CarFord> filter(List<CarFord> cars);
}

