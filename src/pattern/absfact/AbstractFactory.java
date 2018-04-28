package pattern.absfact;

import pattern.factor.CarFactory;

/**
 Фабрика фабрик. Или Абстрактная фабрика
 <p>
 Производит <b>фабрики</b>!
 */
class AbstractFactory {

    Factory createFactory(String typeFactory) {
        switch (typeFactory) {
            case "Car":
                return new CarFactory();
            case "Tank":
                return new TankFactory();
            default:
                return null;
        }
    }
}
