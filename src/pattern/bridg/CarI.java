package pattern.bridg;

/**
 * Абстрактный класс. Автомобиль.
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

