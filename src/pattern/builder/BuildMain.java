package pattern.builder;

/**
 Основной action-class

 @see pattern.builder
 @since 27 apr 2018 */
public class BuildMain {
    /**
     <b>Построим Ауди!</b>

     <code> SportCar sportCar = new SportCar.Builder("Audi").setMaxSpeed(300).setColor("White").build();</code>

     @param args null
     */
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder("Audi").setMaxSpeed(300).setColor("White").build();
        System.out.println("sportCar = " + sportCar.getColor());
        System.out.println("sportCar.getName() = " + sportCar.getName());
        System.out.println("sportCar.getMaxSpeed() = " + sportCar.getMaxSpeed());
    }
}

