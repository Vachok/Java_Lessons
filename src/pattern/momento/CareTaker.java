package pattern.momento;

/**
 * Заботится обо всём. Хранит {@link MomentoC},
 *
 * @author IKudryashov
 * @since 08.05.2018 (14:55)
 */
class CareTaker {
    MomentoC momentoC;

    public MomentoC getMomentoC() {
        return momentoC;
    }

    public void setMomentoC(MomentoC momentoC) {
        this.momentoC = momentoC;
    }
}
