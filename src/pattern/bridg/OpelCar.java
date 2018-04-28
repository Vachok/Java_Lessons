package pattern.bridg;

/**
 * Автомобиль Опель.
 * <p>
 * Класс, который будет "ходить по-{@link BridgeI}"
 *
 * @since 28.04.2018
 */
class OpelCar extends CarI {
    public OpelCar(BridgeI bridgeI) {
        super(bridgeI);
    }

    /**
     * Понятие ехать.
     */
    @Override
    public void drive() {
        System.out.println("Drive My OPEL");
    }
}
