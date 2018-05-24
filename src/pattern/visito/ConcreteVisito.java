package pattern.visito;

/**
 * Сюда переопределим {@link Cat} и {@link Dog}
 */
class ConcreteVisito implements Visito {

    /**
     * Собака будет лаять так {@link VisMain#main(String[])}
     */
    @Override
    public void doDog() {
        System.out.println("HOW!");
    }

    /**
     * Кошка мяучит так.
     */
    @Override
    public void doCat() {
        System.out.println("MEY");
    }
}
