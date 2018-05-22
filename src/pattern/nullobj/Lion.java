package pattern.nullobj;

/**
 * Лев {@link Animal}
 *
 * @author IKudryashov
 * @since 18.05.2018 (15:27)
 */
class Lion implements Animal {

    /**
     * Лев ест
     */
    @Override
    public void eat() {
        System.out.println("Lion eats");
    }
}
