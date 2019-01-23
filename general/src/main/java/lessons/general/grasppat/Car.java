package lessons.general.grasppat;

/**
 * За создание объекта {@link AutoRadio} должен отвечать этот класс.
 * Не нужно передавать в конструктор.
 * <p>
 *
 * @since 23.01.2019 (12:21)
 */
class Car {

    /**
     * Зависимый объект
     */
    AutoRadio autoRadio;

    /**
     * Конструктор
     */
    public Car() {
        this.autoRadio = new AutoRadio("Information Expert Pattern");
    }

    /**
     * @param autoRadio зависимый объект
     * @deprecated
     */
    @Deprecated
    public Car(AutoRadio autoRadio) {

    }
}
