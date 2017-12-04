public class StaticExmpl {
    static int i; //Шаг1 инициализация переменных
    static int g = 6; //static
    int j;
    static {
        System.out.println("static initializer"); //шаг2 инициализаторы
    }
    {
        System.out.println("initializator");
    }
    StaticExmpl() {
        i++; // каждый раз +1
        System.out.println("Constructor");
    }
    static void staticMethod() {
        System.out.println("static method");
    }

    public static void main( String[] args ) {
        System.out.println(StaticExmpl.g);
    }
}
