package pattern.absfact;

import pattern.factor.Car;
import pattern.factor.CarFactory;

/**
 * Магнат-кукловод. Всё ему лишь игра.
 * <p>
 * Купил себе "Фабрику Фабрик" {@link AbstractFactory}.
 * Она произвела пару заводов {@link pattern.factor.CarFactory}, {@link TankFactory}.
 * Они, в свою очередь, произвели продукцию. {@link TankFactory.T52}, {@link TankFactory.T60}, {@link pattern.factor.CarFactory.Toyota}, {@link CarFactory.Audi}.
 * <p>
 * Ну и надо на всех покататься! <b>.drive()</b>
 */
public class MasterOfPuppets {
    public static void main(String[] args) {
        Factory factoryCar = new AbstractFactory().createFactory("Car");
        Factory factoryTank = new AbstractFactory().createFactory("Tank");
        Car toyota = factoryCar.createCar("Toyota");
        Car audi = factoryCar.createCar("Audi");
        toyota.drive();
        audi.drive();
        Tank tankT51 = factoryTank.createTank("t51");
        Tank tankT52 = factoryTank.createTank("t52");
        tankT51.drive();
        tankT52.drive();
    }
}
