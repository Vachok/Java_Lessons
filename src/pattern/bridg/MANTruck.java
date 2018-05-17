package pattern.bridg;

/**
 * Грузовик MAN
 * <p>
 * Для езды по-{@link BridgeI}.
 *
 * @since 28.04.2018
 */
class MANTruck extends TruckI {
    public MANTruck(BridgeI bridgeI) {
        super(bridgeI);
    }

    /**
     * Понятие ехать.
     */
    @Override
    void drive() {
        System.out.println("Drive My MAN!");
    }
}
