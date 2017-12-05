public class InitExample {
    static {
        System.out.println("static init block");
    } //статический код инициализации. запуск 1
    {
        System.out.println("init block");
    } //обычный код инициализации. запуск при создании экземпляра
    public static void main( String[] args ) {

    }
}
