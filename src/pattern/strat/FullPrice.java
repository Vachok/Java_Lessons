package pattern.strat;

/**
 * Полная цена.
 *
 * @author IKudryashov
 * @since 18.05.2018 (16:11)
 */
class FullPrice implements Strat {

    @Override
    public double getPrice(double price) {
        return price;
    }
}
