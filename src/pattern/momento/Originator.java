package pattern.momento;

/**
 * Оригинальный объект
 *
 * @author IKudryashov
 * @since 08.05.2018 (14:45)
 */
class Originator {
    /**
     * Данные о состоянии (что будем сохранять)
     */
    String state;

    /**
     * @return {@link #state}
     */
    public String getState() {
        return state;
    }

    /**
     * @param state {@link #state}
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return новая копия {@link MomentoC}
     */
    MomentoC createMomentoC() {
        return new MomentoC(state);
    }

    /**
     * @param momentoC данные из {@link MomentoC}
     */
    void getDataMomento(MomentoC momentoC) {
        this.state = momentoC.getState();
    }
}
