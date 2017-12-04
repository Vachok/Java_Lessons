public class StaticExmpl {
    static int i = 5;
    int j;
    static {
        System.out.println("static initializer");
    }
    {
        System.out.println("initializator");
    }
    StaticExmpl() {
        System.out.println("Constructor");
    }
    static void staticMethod() {
        System.out.println("static method");
        System.out.println(j); // не статично!
    }

    public static void main( String[] args ) {
        StaticExmpl staticExmpl = new StaticExmpl();
    }
}
