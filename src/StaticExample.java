public class StaticExample {
    static StaticExample staticExample = new StaticExample(); //записываем в static class конструктор. может запустить обычные поля ДО статик
    static int n = 4; //стaтика инициализируется первая. по-очереди
    static int i = returnIntStatic(); //но в этом примере статичный StaticExample инициализирует конструктор

    static int k = 3;
    int j = returnInt(); //после иниц. статики, запускается метод
    static {
        System.out.println("static"); //7. после статичных полей, иниц. статичный конструктор
    }
    {
        System.out.println("clean"); //2. после static-конструктора, ещё раз. 8
    }
    StaticExample() {
        System.out.println("constructor"); //3 и ещё раз 9
    }
    static int returnIntStatic() {
        System.out.println(n); //4
        System.out.println(k); //5
        System.out.println("return static int"); //6
        return 1;
    }
    int returnInt() {
        System.out.println("return int"); //1
        return 2;
    }

    public static void main( String[] args ) {
        new StaticExample();
    }
}
/* Итоговый вывод на экран:
return int
        clean
        constructor
        4
        0
        return static int
static
return int
        clean
        constructor
https://youtu.be/xWSZZwDpcGU?t=18m44s
        */
