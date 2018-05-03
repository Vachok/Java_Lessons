package pattern.adap;

/**
 * Машина, которая включает интерфейс "мыться"
 *
 * @see Car1#wash()
 * @since 28.04.2018
 */
class Opel implements Car1 {

    /**
     * Машина умеет мыться.
     * Этим методом моем Опеля.
     */
    @Override
    public void wash() {
        System.out.println(Opel.class.getTypeName() + " мыт = " + true);
    }
}
