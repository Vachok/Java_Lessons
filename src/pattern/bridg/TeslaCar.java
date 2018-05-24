package pattern.bridg;

/**
 * Автомобиль Тесла.
 * <p>
 * Класс, который будет "ходить по-{@link BridgeI}"
 *
 * @since 28.04.2018
 */
class TeslaCar extends CarI {
    public TeslaCar(BridgeI bridgeI) {
        super(bridgeI);
    }

    /**
     * Понятие ехать.
     */
    @Override
    public void drive() {
        System.out.println("Drive My TESLA");
    }
}

