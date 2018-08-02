package lessons.general.autoclose;

import static lessons.general.autoclose.ACHowTo.linksToSave;

/**
 * <h1>Класс с эксепшенами</h1>
 * <p>
 * Класс должен имплементить {@link AutoCloseable}
 */
class MyCloseable implements AutoCloseable {
    private static final String SOURCE_CLASS = MyCloseable.class.getSimpleName();

    /**
     * <h2>Конструктор</h2>
     *
     * @throws Exception test
     */
    MyCloseable() throws Exception {
        System.out.println("MyCloseable.instance initializer");
        linksToSave.put(SOURCE_CLASS, "MyCloseable.instance initializer");
    }

    /**
     * <h2>Overriden метод из {@link AutoCloseable}</h2>
     *
     * @throws Exception тест
     */
    @Override
    public void close() throws Exception {
        System.out.println("MyCloseable.close");
        linksToSave.put(SOURCE_CLASS, "MyCloseable.close");
        throw new  Exception("MyCloseable.close EXCEPTION");
    }

    /**
     * <h2>Рабочий метод</h2>
     * {@link ACHowTo#goApp()}
     * <p>
     * Выбросим эксепшн - {@link #doIt()}
     *
     * @throws Exception тест
     */
    void doIt(int i) throws Exception {
        System.out.println("MyCloseable.doIt");
    }

    /**<h2>Рабочий метод</h2>
     <p>
     и {@link Exception} внутри.
     @see ACHowTo#goApp()
     * @throws Exception test
     */
    void doIt() throws Exception {
        System.out.println("MyCloseable.doIt");
        throw new  Exception("DO JOB EXCEPTION ");
    }
}
