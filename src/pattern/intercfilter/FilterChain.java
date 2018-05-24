package pattern.intercfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Хранит цепочку фильтров.
 *
 * @author IKudryashov
 * @see InterFilterMain
 * @see InFilter
 * @since 24.05.2018 (9:27)
 */
class FilterChain {
    /**
     * Список {@link InFilter} фильтров, применяемых к {@link TargtClass}
     */
    List<InFilter> inFilters = new ArrayList<>();
    /**
     * То, что надо запустить, после фильтров.
     */
    TargtClass targtClass = new TargtClass();

    /**
     * @param filter добавить {@link InFilter}
     */
    void addFilter(InFilter filter) {
        inFilters.add(filter);
    }

    void filter(String data) {
        for (InFilter inFilter : inFilters) {
            inFilter.exec(data);
        }
        targtClass.doJob(data);
    }
}

