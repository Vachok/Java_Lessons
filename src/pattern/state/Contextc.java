package pattern.state;

/**
 * Допустим есть контекст. А в нём есть {@link #value}. Т.н. сост ояние объекта.
 * ({@link Statei}).
 *
 * @author IKudryashov
 * @since 18.05.2018 (14:49)
 */
class Contextc {

    /**
     * Сменим регистр букв у {@link #name}.
     */
    Statei statei;
    String name;
    /**
     * ...при изменении которого, нужно выполнить те или иные действия.
     * {@link #doAct()}
     * Это поле <code> boolean value;</code> нужно сделать как класс. {@link #statei}.
     */
    private boolean value;

    /**
     * {@link StateMain}
     *
     * @param statei состояние контекста
     * @param name   имя
     */
    public Contextc(Statei statei, String name) {
        this.statei = statei;
        this.name = name;
    }

    /**
     * Сеттер состояния.
     *
     * @param statei {@link Statei}
     * @return
     */
    public Contextc setStatei(Statei statei) {
        this.statei = statei;
        return this;
    }

    /**
     * Должен менять поведение, при изменении {@link #value}.
     */
    void doAct() {
        statei.doAction(this);
    }
}
