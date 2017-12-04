public class StaticExmpl {
    static int i; //Шаг1 инициализация переменных
    static int g = 6; //static
    int j;
    int b = 6; //step3
    static {
        System.out.println("static initializer"); //шаг2 инициализаторы
    }
    {
        System.out.println("initializator"); //шаг 4 (не статический иниц.
    }
    {
        System.out.println("secondInitializator");
    }
    StaticExmpl() {
        System.out.println("Constructor"); //step5
    }
    static void staticMethod() {
        System.out.println("static method");
    }

    public static void main( String[] args ) {
        System.out.println(StaticExmpl.g);
        new StaticExmpl(); //причина step3
        new StaticExmpl(); //причина step3 новые СтатикКлассы
    }
}
