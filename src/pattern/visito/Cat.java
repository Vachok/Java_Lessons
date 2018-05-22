package pattern.visito;

/**
 * Класс КОШКА.
 *
 * @see Animall
 */
class Cat implements Animall {
    /**
     * @param visito {@link Visito}
     */
    @Override
    public void doJob(Visito visito) {
        visito.doCat();
    }
}
