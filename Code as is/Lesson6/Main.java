package Lesson6;

/** Условный человек
 *
 */
class Human {
    /**
     * Не менее 128 и не более 128
     * Используется для экономии памяти
     * @deprecated
     */
    byte b = 120;
    /**
     * Переменная на 2 байта. ~65500 (-32 - +32)
     * @deprecated
     */
    short s = 24567;
    /**
     * 4 байта. для 32 бит
     */
    int i = 5555558;
    /**
     * 8 байт. для 64 бит
     */
    long l = 767464654;
    /**
     * Значение с точкой. 32 bit
     * Необходимо узазывать f в конце, чтобы не путать с double
     */
    float f = 5.64f;
    /**
     * Значения с точкой. 64 bit
     */
    double d = 5.64;
    /**
     * Проверить правда / ложь
     */
    boolean bool = false;
    /**
     * 1 символ
     * @deprecated
     */
    char c = '4';

    /**
     * Ссылочная переменная (КЛАСС)
     * Не хранит в памяти. Только ссылается на объект
     */
    Human friend = new Human();
    Human mom;
    Human dad;

    Car car = new Car();

    public static void main(String[] args) {
        System.out.println("Имя переменной может быть любого размера");
        System.out.println("И не может начинаться с цифр или дугих символов");
        System.out.println("Кроме _ и $");
        System.out.println("Имена ДОЛЖНЫ быть логичными");
    }

}
