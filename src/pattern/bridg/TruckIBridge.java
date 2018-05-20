package pattern.bridg;


/**
 * Мост
 *
 * @see BridgeI
 * @since 28.04.2018
 */
class TruckIBridge implements BridgeI {
    @Override
    public void drive() {
        System.out.println("Truck drive...");
    }
}
