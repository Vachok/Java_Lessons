package pattern.absfact;

import pattern.factor.Car;

/**
 * Танковая фабрика
 * <p>
 * По аналогии с настоящими фабриками, выпускает какие-либо объекты.
 * В данном примере мы выпускаем
 *
 * @see T60
 * @see T52
 */
class TankFactory implements Factory {
    /**
     * @param typeTank "t51", "t52"
     * @return new {@link T60}, new {@link T52}
     */
    @Override
    public Tank createTank(String typeTank) {
        switch (typeTank) {
            case "t52":
                return new T52();
            case "t51":
                return new T60();
            default:
                return null;
        }
    }

    /**
     * Знаем, что машины есть, но производить их не можем.
     *
     * @param typeOfCar любой
     * @return null
     */
    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }

    /**
     * Танк Т-52
     * <p>
     * Описание характеристик
     *
     * @see Tank
     * @see TankFactory
     * @see AbstractFactory
     */
    static class T52 implements Tank {
        /**
         * Учим танк понятию - "ехать".
         */
        @Override
        public void drive() {
            int maxSpeed = 50;
            System.out.println(this.getClass().getSimpleName() + "GO! max speed = " + maxSpeed);
        }
    }

    /**
     * T60
     * <p>
     * Описание характеристик
     *
     * @see Tank
     * @see TankFactory
     * @see AbstractFactory
     */
    static class T60 implements Tank {
        /**
         * Учим танк понятию - "ехать".
         */
        @Override
        public void drive() {
            int maxSpeed = 40;
            System.out.println(this.getClass().getSimpleName() + "GO! max speed = " + maxSpeed);
        }
    }
}
