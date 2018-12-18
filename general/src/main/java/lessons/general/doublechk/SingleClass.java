package lessons.general.doublechk;

/**
 * Singleton class
 * <p>
 * Делаем "ленивую" инициализацию.
 *
 * @since 18.12.2018 (16:22)
 */
public class SingleClass {

    private static volatile  SingleClass ourInstance;

    private SingleClass() {
    }

    /**
     * Double check trouble!
     * <p>
     * В данном случае необходимо использовать <b>volatile!</b> {@link #ourInstance}
     * <p>
     * Если синхронизировать весь метод целиком - синхронизация будет отнимать слишком много ресурсов.
     * Лучше провести синхронизацию внутри {@code if (ourInstance == null)}. <br>
     * Но если мы зайдём 2мя потоками в if - синхронизация не успеет отработать, и будут созданы 2 instance. <br>
     * Поэтому делается double check. Ещё один if.
     <p>
     Java Memory Model, операции могут менятся местами. Описание проблемы: <p>
     <code>
     Double-checked locking is the practice of checking a lazy-initialized
     object's state both before and after
     a synchronized block is entered to determine whether or not to initialize the object.
     It does not work reliably in a platform-independent manner without additional synchronization
     for mutable instances of anything other than float or int.
     Using double-checked locking for the lazy initialization of any
     other type of primitive or mutable object risks a second thread using an uninitialized or
     partially initialized member while the first thread is still creating it, and crashing the program.
     There are multiple ways to fix this.
     The simplest one is to simply not use double checked locking at all, and synchronize the whole method instead.
     With early versions of the JVM,
     synchronizing the whole method was generally advised against for performance reasons.
     But synchronized performance has improved a lot in newer JVMs, so this is now a preferred solution.
     If you prefer to avoid using synchronized altogether,
     you can use an inner static class to hold the reference instead.
     Inner static classes are guaranteed to load lazily.
     <img src="https://i.imgur.com/cyDYnYM.png" alt="bytecode of example" >
     </code><p>
     Запись в <b>SingleClass</b> происходит раньше чем его инициализация. Следовательно сперва записывается null,
     и только потом начинается инициализация класса.
     *
     * @return new {@link SingleClass}
     */
    public static SingleClass getInstance() {
        if (ourInstance == null) {
            synchronized (SingleClass.class) {
                if (ourInstance == null) {
                    ourInstance = new SingleClass();
                }
            }
        }
        return ourInstance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SingleClass{");
        sb.append("ourInstance=").append("\nDouble-checked locking is the practice of checking a lazy-initialized\n" +
            "     object's state both before and after\n" +
            "     a synchronized block is entered to determine whether or not to initialize the object.");
        sb.append('}');
        return sb.toString();
    }
}
