package pattern.visito;

/**
 * <b>Основной класс</b>
 <p>
 *Концепт.
 *Есть интерфейс {@link Animall}. У него есть пара имплементаций. {@link Dog}, {@link Cat}.
 *И нужно это засунуть в библиотеку. Но код {@link Dog#doJob()}, мы менят не можем...
 <p>
 Для этого можно воспользоваться {@link Visito}.
 * @author 14350
 * @since 20.05.2018
 */
public class VisMain {
    /**
     * Воспользуемся визитёром.
     * <p>
     * Суть в том, что {@link ConcreteVisito} можно менять и он будет динамический.
     * Например, если прога расположена удалённо, можно отправить {@link ConcreteVisito},
     * для выполнения своего кода.
     * <p>
     * Суть - код можно менять динамически. Не перекомпилируя.
     *
     * @param args null
     */
    public static void main(String[] args) {
        Animall animall = new Dog();
        animall.doJob(new ConcreteVisito());
        Animall animall1 = new Cat();
        animall1.doJob(new ConcreteVisito());
    }
}

