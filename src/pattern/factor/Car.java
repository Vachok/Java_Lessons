package pattern.factor;

/**
 * Базовые свойства машины
 * <p>
 * Любая может ехать, она какого-то цвета и у нее есть цена.
 */
public interface Car {
    void drive();

    void colour();

    int price();
}
