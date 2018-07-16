package solid.opclose;

interface CarIn {
    void workInTaxi();
}

/**
 * <b>Основной класс</b>
 * <p>
 * Каждый объект, должен быть открыт для расширения и закрыт
 * для редактирования.
 *
 * @author IKudryashov
 * @see ToyotaT
 * @since 01.06.2018 (16:00)
 */
public class OpClose implements CarIn {
    /**
     * Проверим наших таксистов.
     * Делать так не верно
     *
     * @param args null
     */
    public static void main(String[] args) {
        ToyotaT toyotaT = new ToyotaT();
        //  workInTaxiBAD(toyotaT);
        Celica celica = new Celica();
        // workInTaxiBAD(celica);

    }

    /**
     * Так код не будет менятся.
     *
     * @param carIn передаём "машину"
     */
    static void workInTaxi(CarIn carIn) {
        carIn.workInTaxi();
    }

    /**
     * Работа в такси
     * Делать так не верно
     *
     * @see CarIn
     * @see ToyotaT
     * @deprecated не верно. Нужно через {@link CarIn}
     * <p>
     * static void workInTaxiBAD(ToyotaT toyotaT) {
     * if ((toyotaT instanceof Celica)) {
     * toyotaT.getPassager();
     * } else {
     * toyotaT.getPassagers();
     * }
     * }
     */
    @Override
    public void workInTaxi() {

    }
}