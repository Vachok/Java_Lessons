package pattern.state;

/**
 * Класс отвечает за маленькие буквы.
 *
 * @author IKudryashov
 * @see Contextc
 * @since 18.05.2018 (14:44)
 */
class LowerCaseSt implements Statei {

    /**
     * @param contextc {@link Contextc}
     * @see UpperCaseSt
     */
    @Override
    public void doAction(Contextc contextc) {
        System.out.println(contextc.name.toLowerCase());
    }
}
