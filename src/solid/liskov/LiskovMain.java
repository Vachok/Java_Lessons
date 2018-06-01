package solid.liskov;

/**
 * <b>Основной класс</b>
 * <p>
 * Суть. Все классы, которые мы наследуем, не должны трогать параметры родителя.
 *
 * @since 01.06.2018 (16:42)
 */
public class LiskovMain {
    static Rectangle getRectangle() {
        return new Rectangle();
    }

    public static void main(String[] args) {
        Rectangle rectangle = getRectangle();
        rectangle.setHeight(6);
        rectangle.setWight(9);
        System.out.println(rectangle.getSQ());
    }
}

class Rectangle {
    int wight;
    int height;

    public int getWight() {
        return wight;
    }

    public Rectangle setWight(int wight) {
        this.wight = wight;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Rectangle setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getSQ() {
        return wight * height;
    }
}