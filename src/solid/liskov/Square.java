package solid.liskov;

/**
 * Класс-child от {@link Rectangle}.
 * В этом варианте он переопределяет поведение родителя
 * Правильно делать через интерфейс.
 *
 * @deprecated
 */
@Deprecated
class Square extends Rectangle {
    public void setWight(int wight) {
        this.wight = wight;
        height = wight;
    }

    public void setHeight(int height) {
        this.height = height;
        wight = height;
    }
}
// at 16.07.2018 (9:28)