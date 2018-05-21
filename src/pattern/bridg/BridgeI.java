package pattern.bridg;

/**
 * Интерфейс-мост.
 * <p>
 * Его должен содержать {@link CarI} и {@link TruckI}
 * <p>
 * А он должен быть имплементирован в {@link CarIBridge} и {@link TruckIBridge}
 */
interface BridgeI {
    void drive();
}
