package pattern.strat;

/**
 * Объект стратегии.
 *
 * @author IKudryashov
 * @since 18.05.2018 (16:19)
 */
class Context {
    Strat strat;

    public Context(Strat strat) {
        this.strat = strat;
    }

    public double getPrice(double price) {
        return strat.getPrice(price);
    }
}
