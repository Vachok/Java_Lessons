package pattern.momento;

/**
 * <b>Основной класс</b>
 * <p>
 * Сохраняет состояние объекта.
 *
 * @author IKudryashov
 * @see Originator
 * @since 08.05.2018 (14:42)
 */
public class MomentoMain {
    /**Воспользуемся моментом :)
     <p>
     Сначала засетаем {@link Originator}.
     Потом, через класс {@link CareTaker}, сохраним его состояние.
     * @param args null
     */
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("one");
        CareTaker careTaker = new CareTaker();
        careTaker.setMomentoC(originator.createMomentoC());
        originator.setState("two");
        originator.getDataMomento(careTaker.getMomentoC());
        System.out.println(originator.getState());
    }
}

