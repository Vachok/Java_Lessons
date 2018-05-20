package pattern.adap;

/**
 * Интерфейс для грузовика.
 * <p>
 * Грузовик тоже нуждается в чистке. Но он не влезает в наш {@link CarWash}!
 *
 * @since 28.04.2018
 */
interface Truck {
    void cleanMe();
}
