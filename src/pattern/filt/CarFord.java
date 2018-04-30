package pattern.filt;

/**
 * Автомобиль типа "Форд."
 *
 * @since 29.04.2018 (14:13)
 * @see FiltMain
 * @see SpeedFilter
 */
class CarFord {
    /**
     * Скорость
     */
    private int maxSpeed;
    /**
     * Цвет
     */
    private String color;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public CarFord setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public String getColor() {
        return color;
    }

    public CarFord setColor(String color) {
        this.color = color;
        return this;
    }

    public int getDoors() {
        return doors;
    }

    public CarFord setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    /**
     * Кол-во дверей
     */
    private int doors;

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
