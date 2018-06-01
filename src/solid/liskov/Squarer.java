package solid.liskov;

/**
 * Класс-child от {@link Rectangle}.
 * Получение объекта, согласно Liskov Principe,
 * правильно делать через интерфейс.
 */
class Squarer implements ShapeF {
    int wight;

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    /**
     * Получение квадрата
     *
     * @return {@link Squarer}
     */
    @Override
    public int getSquarer() {
        return wight * wight;
    }
}
// at 16.07.2018 (9:28)