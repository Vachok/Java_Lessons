package pattern.templ;

/**
 * Класс реализует шаблон {@link Game}
 *
 * @see TemplMain
 */
class PokerGame extends Game {

    @Override
    void startGame() {
        System.out.println("Drawing cards");
    }

    @Override
    void playGame() {
        System.out.println("Checkouts");
    }

    @Override
    void endGame() {
        System.out.println("BANK!");
    }
}