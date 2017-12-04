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
    }

    public static void main( String[] args ) {
        StaticExmpl staticExmpl = new StaticExmpl();
        StaticExmpl staticExmpl2 = new StaticExmpl();
        i = 1;
        i =2;
        System.out.println(i);
        System.out.println(i);
    }
}
