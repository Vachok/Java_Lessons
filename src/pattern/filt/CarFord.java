package pattern.filt;

/**
 * Автомобиль типа "Форд."
 *
 * @since 29.04.2018 (14:13)
 */
class CarFord {
    /**
     * Скорость
     */
    int maxSpeed;
    /**
     * Цвет
     */
    String color;
    /**
     * Кол-во дверей
     */
    int doors;

    /**
     * Конструктор "Фордов".
     *
     * @param maxSpeed скорость
     * @param color    цвет
     * @param doors    кол-во дверей
     * @see FiltMain
     */
    public CarFord(int maxSpeed, String color, int doors) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.doors = doors;
    }
}
