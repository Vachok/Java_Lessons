package solid.opclose;

/**
 * Клиет захотел использовать в парке не очень подходящее авто.
 *
 * @see ToyotaT
 * @see OpClose
 * @since 01.06.2018 (16:13)
 */
class Celica extends ToyotaT {
    @Override
    public void workInTaxi() {
        getPassager();
    }
}
