package pattern.state;

/**
 * Класс отвечает за большие буквы.
 *
 * @author IKudryashov
 * @see Contextc
 * @since 18.05.2018 (14:44)
 */
class UpperCaseSt implements Statei {

    /**
     * @param contextc {@link Contextc}
     * @see LowerCaseSt
     */
    @Override
    public void doAction(Contextc contextc) {
        System.out.println(contextc.name.toUpperCase());
    }
}
