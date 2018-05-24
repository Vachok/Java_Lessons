package pattern.visito;

/**
 * Класс СОБАКА.
 *
 * @see Animall
 */
class Dog implements Animall {

    /**
     * @param visito {@link Visito}
     */
    @Override
    public void doJob(Visito visito) {
        visito.doDog();
    }
}
