package solid.liskov;

/**
 * Правильное получение {@link Squarer}
 */
public interface ShapeF {
    /**
     * Получение квадрата
     *
     * @return {@link Squarer}
     */
    int getSquarer();
}
