package pattern.builder;
/**
 <b>Основной action-class</b>

 @see pattern.builder
 @since 27 apr 2018 */
public class BuildMain {
    /**
     Построим Ауди!
     <code> SportCar sportCar = new SportCar.Builder("Audi").setMaxSpeed(300).setColor("White").build();</code>
     @param args null
     <p>
     @see SportCar
     @see SportCar.Builder
     */
    @SuppressWarnings(value = "all")
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder("Audi").setColor("White").build();
        System.out.printf("sportCar = %s%n", sportCar.getColor());
        System.out.println("sportCar.getName() = " + sportCar.getName());
        System.out.println("sportCar.getMaxSpeed() = " + sportCar.getMaxSpeed());
    }
}

