package pattern.visito;

/**
 * Интерфейс-визитёр.
 * Передаём его в {@link Animall}.
 * Должен иметь имплементацию. {@link ConcreteVisito}
 */
interface Visito {
    /**
     * {@link Dog}
     */
    void doDog();

    /**
     * {@link Cat}
     */
    void doCat();
}
