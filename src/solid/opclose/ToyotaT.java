package solid.opclose;

/**
 * Автомобиль Тойота.
 * <p>
 *
 * @see OpClose
 * @since 01.06.2018 (16:07)
 */
class ToyotaT implements CarIn {
    /**
     * Берём пассажиров.
     * Не хорошо. Нужно юзать интерфейсы!
     */
    void getPassagers() {
        System.out.println("Sit down please!");
    }

    /**
     * Но появилась {@link Celica}. Она не может брать
     * на борт 4х.
     *
     * @see OpClose
     */
    void getPassager() {
        System.out.println("Sit down one...");
    }

    /**
     * @see CarIn
     * @see Celica
     */
    @Override
    public void workInTaxi() {
        getPassagers();
    }
}
