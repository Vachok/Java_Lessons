package lessons.j8.defstat;

/**<h1>Пример default и static интерфейса</h1>
 * @see B
 * @since 06.08.2018 (12:40)
 */
interface A{
    /**<h2>Пример static</h2>
     * @param x тест
     * @param y тест
     * @return x+y
     */
    static int add(int x, int y){
        return x+y;
    }

    /**<h2>Обычный метод</h2>
     * @param messAge сообщение
     */
    void printMessage(String messAge);

    /**
     * <h2>Дефолтовый метод</h2>
     * Метод, куда можно добавить код.
     * {@link B}
     */
    default void sayHello(){
        printMessage("hello");
    }
}
