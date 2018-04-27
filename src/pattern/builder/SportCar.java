package pattern.builder;

/**
 <b>Создадим builder для спорткара</b>

 @see Builder
 @see BuildMain */
class SportCar {
    private String name;
    /**
     <b>Красный</b>
     по-умолчанию.
     */
    private String color = "red";
    /**
     <b>250</b>
     по-умолчанию.
     */
    private int maxSpeed = 250;

    /**
     Приватный конструктор, чтобы запретить создавать экземпляры
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
     <b>Строитель</b>
     <p>
     Статичный класс, который будет строить {@link SportCar}. Должен содержать такие же поля, как у основного.
     <p>
     Передадим его в {@link SportCar#SportCar(Builder)}
     */
    static class Builder {
        private String name;
        private String color;
        private int maxSpeed;

        /**
         Конструктор, для тех полей, которые обязательны.
         <p>
         Остальным полям делаем <i>setter</i> {@link #setColor(String)}, {@link #maxSpeed}. Сеттеры должны возвращать {@link Builder}

         @param name имя кара

         @see SportCar
         */
        public Builder(String name) {
            this.name = name;
        }

        /**
         @param color цвет
         */
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        /**
         @param maxSpeed макс. скорость
         */
        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        /**
         Метод, который будет строить.

         @return построенный новый {@link SportCar}
         */
        public SportCar build() {
            return new SportCar(this);

        }
    }
}
