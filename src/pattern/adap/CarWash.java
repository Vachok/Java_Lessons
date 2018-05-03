package pattern.adap;

/**
 * Класс, который принимает интерфейс и обрабатывает его.
 * <p>
 * Автомойка. Использует {@link Car1} - интерфейс.
 *
 * @since 28.04.2018
 */
class CarWash {
    public void washCar(Car1 car1) {
        car1.wash();
    }
}

