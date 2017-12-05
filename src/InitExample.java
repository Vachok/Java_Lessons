public class InitExample {
    static {
        System.out.println("static init block");
    } //статический код инициализации. запуск при первом обращении
    {
        System.out.println("init block");
    } //обычный код инициализации. запуск при создании экземпляра
    InitExample() {
        //super(); он есть по-умолчанию
        System.out.println("constructor");
    }
        public static void main( String[] args ) {
        new InitExample();
    }
}
