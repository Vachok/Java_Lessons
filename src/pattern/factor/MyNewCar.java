package pattern.factor;

/**
 Базовые свойства машины
 <p>
 {@link Toyota} и {@link Audi} - обе умеют ехать, но с разной макс.скоростью.
 Для этого они и переопределяют методы этого класса.
 */
interface Car {
    void drive();

    void colour();

    int price();
}

/**
 Использование {@link Factory} классом {@link MyNewCar}
 <p>
 Запрос в {@link Factory}, где мы просим {@link Car} <tt>toyota</tt> и <tt>audi</tt>,
 Классы {@link Toyota} {@link Audi}, переопределяют метод {@link Car#drive()}.
 На выходе в этом классе, имеем "максимальную скорость" по-марке.
 <a href='https://youtu.be/A4uNotdECBg'>YouTube</a>
 */
public class MyNewCar {
    public static void main(String[] args) {

        Factory factory = new Factory();
        Car toyota = factory.create("Toyota");
        Car audi = factory.create("Audi");
        int at = audi.price() - toyota.price();
        audi.colour();
        toyota.colour();
        System.out.println("++++" + at + " difference in RUR.");

        audi.drive();
    }
}

/**
 Тойота
 <p>
 Описание характеристик
 */
class Toyota implements Car {
    @Override
    public void drive() {
        int maxSpeed = 180;
        System.out.println(this.getClass().getSimpleName() + " max speed = " + maxSpeed);
    }

    @Override
    public void colour() {
        System.out.println("RED TOYOTA");
    }

    @Override
    public int price() {
        int price = 1500000;
        System.out.println("1 500 000 RUR for Toyota");
        return price;
    }
}

/**
 Ауди
 <p>
 Описание характеристик
 */
class Audi implements Car {
    @Override
    public void drive() {
        int maxSpeed = 240;
        System.out.println(this.getClass().getSimpleName() + " max speed = " + maxSpeed);
    }

    @Override
    public void colour() {
        System.out.println("WHITE AUDI");
    }

    @Override
    public int price() {
        int price = 2300000;
        System.out.println("2 300 000 RUR for Audi");
        return price;
    }
}

/**
 Паттерн типа Фабрика.
 <p>
 По аналогии с настоящими фабриками, выпускает какие-либо объекты.
 В данном примере мы выпускаем

 @see Audi
 @see Toyota
 <p>
 Ауди и Тойота имплементят интерфейс {@link Car}, и переопределяют метод {@link Car#drive()} */
class Factory {
    public Car create(String typeCar) {
        switch (typeCar) {
            case "Toyota":
                return new Toyota();
            case "Audi":
                return new Audi();
            default:
                return null;
        }
    }
}
