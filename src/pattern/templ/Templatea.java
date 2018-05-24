package pattern.templ;

/**
 * Абстрактный класс-шаблон.
 * <p>
 * Здесь просто указываем порядок шагов.
 *
 * @see JobClass
 * @see TemplMain
 * @since 20.05.2018 (13:57)
 */
abstract class Templatea {
    /**
     * Шаг 1.
     */
    abstract void stepOne();

    /**
     * Шаг 2.
     */
    abstract void stepTwo();

    /**
     * Шаг 3.
     */
    abstract void stepThree();

    /**
     * Запуск.
     */
    void run() {
        stepOne();
        stepTwo();
        stepThree();
    }
}