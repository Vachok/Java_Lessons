package pattern.factor;

/**
 Ауди
 <p>
 Описание характеристик
 */
class Audi implements Car {
    @Override
    public void drive() {
        int maxSpeed = 240;
        System.out.println(this.getClass().getSimpleName() + " max speed = " + maxSpeed);
    }

    @Override
    public void colour() {
        System.out.println("WHITE AUDI");
    }

    @Override
    public int price() {
        int price = 2300000;
        System.out.println("2 300 000 RUR for Audi");
        return price;
    }
}
