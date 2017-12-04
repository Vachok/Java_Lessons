public class StaticExmpl {
    static int i = 5;
    int j;
    static {
        i = 6; //static-поле
        System.out.println("static initializer");
    }
    {
        System.out.println("initializator");
    }
    StaticExmpl() {
        System.out.println("Constructor");
    }
    static void staticMethod() {
        i = 7;
        System.out.println("static method");
    }

    public static void main( String[] args ) {
        System.out.println(i);
        StaticExmpl.staticMethod();
        System.out.println(StaticExmpl.i);
    }
}
