package pattern.intercfilter;

/**
 * Класс-управлятор для {@link InFilter}
 *
 * @author IKudryashov
 * @see InterFilterMain
 * @since 24.05.2018 (9:37)
 */
class InFiltManager {
    /**
     * Инициализируем цепь фильтров {@link FilterChain}
     */
    FilterChain filterChain = new FilterChain();

    void setFilter(InFilter inFilter) {
        filterChain.addFilter(inFilter);
    }

    /**
     * @param req сами данные, что фильтровать.
     */
    void filterReq(String req) {
        filterChain.filter(req);
    }
}
