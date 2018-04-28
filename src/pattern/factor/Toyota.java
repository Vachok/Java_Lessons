package pattern.factor;

/**
 Тойота
 <p>
 Описание характеристик
 */
class Toyota implements Car {
    @Override
    public void drive() {
        int maxSpeed = 180;
        System.out.println(this.getClass().getSimpleName() + " max speed = " + maxSpeed);
    }

    @Override
    public void colour() {
        System.out.println("RED TOYOTA");
    }

    @Override
    public int price() {
        int price = 1500000;
        System.out.println("1 500 000 RUR for Toyota");
        return price;
    }
}
