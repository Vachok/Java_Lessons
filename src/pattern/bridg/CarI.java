package pattern.bridg;

/**
 * Абстрактный класс. Автомобиль.
 Должен содержать копию моста, как и {@link TruckI}.
 * @since 28.04.2018
 * @see BridgeI
 * @see TruckI
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

