package pattern.bridg;



import java.util.Arrays;

/**
 Мост

 @see BridgeI
 @since 28.04.2018 */
class CarIBridge implements BridgeI {

    private String x;
    @Override
    public String toString() {
        String sTring = Arrays.toString(this.getClass().getDeclaredMethods());
        return "CarIBridge{}" + " " + sTring;
    }
    @Override
    public void drive() {
        System.out.println(this.toString());
        System.out.println("drive car...");
    }
}
