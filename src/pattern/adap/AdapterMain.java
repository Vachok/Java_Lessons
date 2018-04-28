package pattern.adap;

/**
 <b>Основной класс</b>
 <p>
 Адаптер - это преобразователь интерфейс-интерфейс.
 Обёртка интерфейса. Нечто подобное {@link Integer} и <code>int</code>.

 @since 28.04.2018 */
public class AdapterMain {
    /**
     Работа адаптера.
     <p>
     Создаём экземпляр {@link CarWash} и отправляем в него {@link Opel}.
     Всё ок - всё работает. Но есть проблема - {@link Truck} ...
     <p>{@code
    carWash.washCar(new Opel()); - ok
    carWash.washCar(new MyMAN()); - not ok!
    }
     <p>
     Суть. Интерфейс {@link Truck}, нужно "превратить" в {@link Car1}. Делается всё это с помощью обёртки.
     В данном случае роль обёртки-адапрера выполняет {@link TruckWrap}. Он "проталкивает" {@link Truck} в {@link CarWash}

     @param args null

     @see Car1
     */
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.washCar(new Opel());
//impos         carWash.washCar(new MyMAN());
        carWash.washCar(new TruckWrap(new MyMAN()));
    }
}

