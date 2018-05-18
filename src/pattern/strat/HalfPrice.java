package pattern.strat;

/**
 * Пол-цены.
 *
 * @author IKudryashov
 * @since 18.05.2018 (16:12)
 */
class HalfPrice implements Strat {
    @Override
    public double getPrice(double price) {
        return price / 2;
    }
}
