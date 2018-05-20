package pattern.strat;

/**
 * Стратегия.
 * {@link StratMain}
 *
 * @author IKudryashov
 * @since 18.05.2018 (16:08)
 */
interface Strat {

    /**
     * @param price цена товара
     * @return стратегическая цена
     * @see FullPrice
     * @see HalfPrice
     */
    double getPrice(double price);
}

