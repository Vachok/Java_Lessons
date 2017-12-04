public class StaticExmpl {
    static int i;
    static int g = 6;
    int b = 6;

    static {
        System.out.println("static initializer"); //шаг1
    }

    {
        System.out.println("initializator");
    }
        {
            System.out.println("secondInitializator");
        }
        StaticExmpl() {
        System.out.println("Constructor");
    }
        static void staticMethod () {
        System.out.println("static method"); //step2
    }

    public static void main( String[] args ) {
        staticMethod();
        new StaticExmpl(); //причина step3
        new StaticExmpl(); //
    }
}
