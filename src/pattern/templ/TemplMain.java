package pattern.templ;

/**
 * <b>Основной класс</b>
 * <p>
 * Концепт.
 * <p>
 * Должен быть абстрактный класс. {@link Templatea}. Шаблон, который задаёт алгоритм.
 <p>
 * Применение. Сервлеты. Инициализация, doGet, doPost.
 *Например, есть разные игры. Но они идут по-одному алгоритму. {@link Game}, {@link PokerGame}.
 *Алгоритм, методоы которого будут заданы позже.
 * @author IKudryashov
 * @since 18.05.2018 (16:38)
 */
public class TemplMain {
    /**
     * Воспользуемся нашим {@link Templatea}.
     * Сделаем {@link JobClass}. На выходе:
     *
     * <code> step1
     * step2
     * step3 </code>.
     *
     * @param args null
     */
    public static void main(String[] args) {
        Templatea templatea = new JobClass();
        templatea.run();
        Game game = new PokerGame();
        game.run();
    }
}

