package pattern.absfact;

import pattern.factor.Car;
import pattern.factor.CarFactory;

/**
 Фейс нашей {@link AbstractFactory}
 <p>
 Через него мы говорим, чем ей займется.
 Проще - управляем.
 Описание, что именно умеет делать {@link AbstractFactory}.
 Прослойка между классами.
 <p>
 Суть - {@link MasterOfPuppets}, запрашивает например, {@link CarFactory.Audi}.
 Но у него нет желания, как всем, тащиться за ней в автосалон, стоять в очереди, и т.п.
 <p>
 Что он делает? Всё просто - он делает <b>собственный филиал автозавода</b>! {@link pattern.factor.CarFactory}.
 и для него лично начинают делать машины. Какие он скажет. {@link CarFactory.Audi}, {@link pattern.factor.CarFactory.Toyota}.
 <p>
 Но внезапно он захотел ещё и танки. Поскольку он крутой - он просто по-аналогии, ставит танковый завод. {@link TankFactory}
 <p>
 А роль этого класса - <i>управляющий имуществом</i>.
 */
public interface Factory {
    /**
     @param typeOfCar "Toyota", "Audi", "t51", "t52"

     @return {@link Car}, {@link Tank}
     */
    Car createCar(String typeOfCar);

    Tank createTank(String typeTank);
}