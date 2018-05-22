package pattern.state;

/**
 * <b>Основной класс</b>
 * <p>
 * Объект, который при изменении состояния меняет поведение.
 *
 * @author IKudryashov
 * @since 17.05.2018 (17:06)
 */
public class StateMain {
    /**
     * Состояние энкапсулируется в объект, и в зависимости от этого
     * мы меняем поведение.
     *
     * @param args null
     */
    public static void main(String[] args) {
        Contextc contextc = new Contextc(new LowerCaseSt(), "Vaka");
        contextc.doAct();
        contextc.setStatei(new UpperCaseSt());
        contextc.doAct();
    }
}
