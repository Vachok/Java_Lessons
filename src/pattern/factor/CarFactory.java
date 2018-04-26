package pattern.factor;
import pattern.absfact.Factory;
import pattern.absfact.Tank;

/**
 Паттерн типа Фабрика.
 <p>
 По аналогии с настоящими фабриками, выпускает какие-либо объекты.
 В данном примере мы выпускаем

 @see Audi
 @see Toyota
 <p>
 Ауди и Тойота имплементят интерфейс {@link Car}, и переопределяют метод {@link Car#drive()} */
public class CarFactory implements Factory {

    /**
     @param typeOfCar Toyota, Audi

     @return new {@link Toyota} или new {@link Audi}

     @see Car
     @see pattern.absfact.AbstractFactory
     */
    public Car createCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota":
                return new Toyota();
            case "Audi":
                return new Audi();
            default:
                return null;
        }

    }

    /**
     Фабрика автомобилей не производит танки.
     <p>
     но знает про них.

     @param typeTank любой

     @return null
     */
    @Override
    public Tank createTank(String typeTank) {
        return null;
    }

    /**
     Ауди - это {@link Car}. Всё, что умеет Car, умеет и Audi!
     <tt>Но по-особенному!</tt>
     <p>
     Описание характеристик
     */
    public static class Audi implements Car {
        /**
         И поехали :)
         */
        @Override
        public void drive() {
            int maxSpeed = 240;
            System.out.println(this.getClass().getSimpleName() + " max speed = " + maxSpeed);
        }

        /**
         Покрасим Аудюху
         */
        @Override
        public void colour() {
            System.out.println("WHITE AUDI");
        }

        /**
         @return цена
         */
        @Override
        public int price() {
            int price = 2300000;
            System.out.println("2 300 000 RUR for Audi");
            return price;
        }
    }

    /**
     Toyota - это {@link Car}. Всё, что умеет Car, умеет и Toyota!
     <tt>Но по-особенному!</tt>
     <p>
     Описание характеристик
     */
    static class Toyota implements Car {
        /**
         Едем 180
         */
        @Override
        public void drive() {
            int maxSpeed = 180;
            System.out.println(this.getClass().getSimpleName() + " max speed = " + maxSpeed);
        }

        /**
         Красим в белый
         */
        @Override
        public void colour() {
            System.out.println("RED TOYOTA");
        }

        /**
         @return цена
         */
        @Override
        public int price() {
            int price = 1500000;
            System.out.println("1 500 000 RUR for Toyota");
            return price;
        }
    }
}