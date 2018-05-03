package pattern.factor;

import pattern.absfact.MasterOfPuppets;

/**
 * Использование {@link CarFactory} классом {@link CarBoss}
 * <p>
 * Запрос в {@link CarFactory}, где мы просим {@link Car} toyota и audi,
 * Классы {@link CarFactory.Toyota} {@link CarFactory.Audi}, переопределяют метод {@link Car#drive()}.
 * На выходе в этом классе, имеем "максимальную скорость" по-марке.
 * <a href='https://youtu.be/A4uNotdECBg'>YouTube</a>
 */
public class CarBoss {
    /**
     * Владелец фабрики авто
     *
     * @param args null
     * @see MasterOfPuppets
     * @see CarFactory
     */
    public static void main(String[] args) {
        System.out.println("From Lesson 2 https://github.com/Vachok/Java_Lessons/commit/482e102f0d12a87218544e8a4aa4f28ecbe556ad");
    }
    /*
        CarFactory carFactory = new CarFactory();
        Car toyota = carFactory.create("Toyota");
        Car audi = carFactory.create("Audi");
        int at = audi.price() - toyota.price();
        audi.colour();
        toyota.colour();
        System.out.println("++++" + at + " difference in RUR.");

        audi.drive();
    */
}

