package pattern.observ;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, который будет реализовывать обсервер.
 * <p>
 * Суть - должен быть {@link List} , где будут храниться обсерверы.
 */
class Observerr {

    /**
     *
     */
    static List<Observerr> observerrList = new ArrayList<>();
    String name;
    String state;

    public Observerr(String name) {
        this.name = name;
        observerrList.add(this);
    }

    /**
     * Когда мы будем менять статус (или что угодно),
     * будет вызываться {@link #notifyAllObservers()},
     * который будет оповещать всех из {@link #observerrList}.
     *
     * @param state статус
     * @see ObsMain#main(String[]) .
     */
    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observerr observerr : observerrList) {
            observerr.update();
        }
    }

    private void update() {
        System.out.println(name + " changed " + state);
    }
}
