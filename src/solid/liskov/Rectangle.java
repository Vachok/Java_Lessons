package solid.liskov;

/**
 * Класс родитель.
 * <p>
 * Его параметры изменять не рекомендуется.
 *
 * @see Square
 * @see LiskovMain
 * @see Squarer
 */
class Rectangle implements ShapeF {
    int wight;
    int height;

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return {@link Square}
     * @deprecated
     */
    @Deprecated
    public int getSQ() {
        return wight * height;
    }

    /**
     * Получение квадрата
     *
     * @return {@link Squarer}
     */
    @Override
    public int getSquarer() {
        return 0;
    }
}
// at 16.07.2018 (9:28)