package pattern.builder;

/**
 * Создадим pattern.builder для спорткара
 *
 * @see Builder
 * @see BuildMain
 */
class SportCar {
    private String name;
    private String color;
    private int maxSpeed;

    /**
     * Приватный конструктор, чтобы запретить создавать экземпляры
     *
     * @param builder {@link Builder}
     */
    private SportCar(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
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

    /**
     * Строитель
     * <p>
     * Статичный класс, который будет строить {@link SportCar}. Должен содержать такие же поля, как у основного.
     * Тут можно задать параметры по-умолчанию.
     * <p>
     * Передадим его в {@link SportCar#SportCar(Builder)}
     */
    static class Builder {
        private String name;
        private String color;
        /**
         * 200 - по-умолчанию
         */
        private int maxSpeed = 200;

        /**
         * Конструктор, для тех полей, которые обязательны.
         * <p>
         * Остальным полям делаем <i>setter</i> {@link #setColor(String)}, {@link #maxSpeed}. Сеттеры должны возвращать {@link Builder}
         *
         * @param name имя кара
         * @see SportCar
         */
        public Builder(String name) {
            this.name = name;
        }

        /**
         * @param color цвет
         * @return цвет
         */
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        /**
         * @param maxSpeed макс. скорость
         * @return макс. скорость
         */
        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        /**
         * Метод, который будет строить.
         *
         * @return построенный новый {@link SportCar}
         */
        public SportCar build() {
            return new SportCar(this);

        }
    }
}
