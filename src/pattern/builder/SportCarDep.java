package pattern.builder;

/**
 Создаём спорткар.
 <p>
 У него куча параметров.
 Конструктор для этих целей не очень подходит. Их нужно будет слишком большое колличество,
 чтобы описать варианты. {@link #SportCarDep(String)}, {@link #SportCarDep(String, int)}, {@link #SportCarDep(String, String)}, {@link #SportCarDep(String, String, int)} ....
 <p>
 Вариант с кучей getter тоже не самый хороший ...
 {@link #getColor()}, {@link #getMaxSpeed()}, {@link #getName()}

 @see SportCar
 @deprecated не самое лучшее решение */
@SuppressWarnings("ALL")
class SportCarDep {
    private String name;
    private String color;
    private int maxSpeed;

    /**
     @param name название
     */
    SportCarDep(String name) {
    }

    /**
     @param name имя
     @param color цвет
     */
    public SportCarDep(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /**
     @param name имя
     @param maxSpeed скорость
     */
    public SportCarDep(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    /**
     @param name имя
     @param color цвет
     @param maxSpeed скорость
     */
    public SportCarDep(String name, String color, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
