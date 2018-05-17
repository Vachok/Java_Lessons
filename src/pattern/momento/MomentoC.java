package pattern.momento;

/**
 * Класс, который будет хранить состояние {@link Originator}
 * <p>
 * Отвечает за {@link Originator#state}.
 *
 * @author IKudryashov
 * @since 08.05.2018 (14:46)
 */
class MomentoC {
    String state;

    public MomentoC(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
