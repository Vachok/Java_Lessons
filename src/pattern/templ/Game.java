package pattern.templ;

/**
 * Абстрактный класс-шаблон.
 * <p>
 * Здесь просто указываем порядок шагов.
 * Другой пример.
 *
 * @see JobClass
 * @see TemplMain
 * @since 20.05.2018 (13:57)
 */
abstract class Game {
    /**
     * Шаг 1.
     */
    abstract void startGame();

    /**
     * Шаг 2.
     */
    abstract void playGame();

    /**
     * Шаг 3.
     */
    abstract void endGame();

    /**
     * Запуск.
     */
    void run() {
        startGame();
        playGame();
        endGame();
    }
}