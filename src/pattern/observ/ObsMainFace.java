package pattern.observ;

/**
 * Реализация через интерфейс.
 * <p>
 * Это более верный подход.
 *
 * @author IKudryashov
 * @since 17.05.2018 (16:26)
 */
public class ObsMainFace implements ObseFace {

    String name;
    String state;

    public ObsMainFace(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println();
    }
}
