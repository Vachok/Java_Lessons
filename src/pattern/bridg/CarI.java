package pattern.bridg;

/**
 * Абстрактный класс. Автомобиль.
 * Должен содержать копию моста, как и {@link TruckI}.
 *
 * @see BridgeI
 * @see TruckI
 * @since 28.04.2018
 */
abstract class CarI {
    /**
     * Поле, содержащее {@link BridgeI}
     *
     * @see #CarI(BridgeI)
     */
    BridgeI bridgeI;

    /**
     * Сеттер для {@link #bridgeI}.
     *
     * @param bridgeI {@link BridgeI}
     */
    public CarI(BridgeI bridgeI) {
        this.bridgeI = bridgeI;
    }

    /**
     * Понятие ехать.
     */
    public abstract void drive();
}

