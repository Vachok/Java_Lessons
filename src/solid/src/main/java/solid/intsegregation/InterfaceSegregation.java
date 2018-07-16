package solid.intsegregation;

/**
 * <b>Управляющий класс</b>
 * <p>
 * {@link solid.StartMe}
 *
 * @since 16.07.2018 (14:13)
 */
public class InterfaceSegregation {
    /**
     * Создадим повара.
     * График: работать-есть-работать.
     *
     * @param args null
     */
    public static void main(String[] args) {
        IWorker iWorker = new Cook();
        iWorker.work();
        iWorker.eat();
        iWorker.work();
    }
}

