package pattern.bridg;

/**
 * Абстрактный класс. Грузовик.
 * Должен содержать копию моста, как и {@link CarI}
 *
 * @see CarI
 * @since 28.04.2018
 */
abstract class TruckI {
    /**
     * Поле, содержащее {@link BridgeI}
     */
    BridgeI bridgeI;

    /**
     * Сеттер для {@link #bridgeI}.
     *
     * @param bridgeI {@link BridgeI}
     */
    public TruckI(BridgeI bridgeI) {
        this.bridgeI = bridgeI;
    }

    /**
     * Понятие ехать.
     */
    abstract void drive();

}

