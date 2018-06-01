package solid.opclose;

interface CarIn {
    void workInTaxi();
}

/**<b>Основной класс</b>
 <p>
 Каждый объект, должен быть открыт для расширения и закрыт
 для редактирования.
 * @since 01.06.2018 (16:00)
 * @author IKudryashov
 * @see ToyotaT
 */
public class OpClose {
    /**Проверим наших таксистов.
     * Делать так не верно
     * @param args null
     */
    public static void main(String[] args) {
        ToyotaT toyotaT = new ToyotaT();
        workInTaxiBAD(toyotaT);
        Celica celica = new Celica();
        workInTaxiBAD(celica);

    }

    /** Так код не будет менятся.
     * @param carIn передаём "машину"
     */
    static void workInTaxi(CarIn carIn) {
        carIn.workInTaxi();
    }

    /**Работа в такси
     * Делать так не верно
     * @see CarIn
     * @see ToyotaT
     * @param toyotaT машина-такси
     * @deprecated не верно. Нужно через {@link CarIn}
     */
    @Deprecated
    static void workInTaxiBAD(ToyotaT toyotaT) {
        if ((toyotaT instanceof Celica)) {
            toyotaT.getPassager();
        } else {
            toyotaT.getPassagers();
        }
    }
}
