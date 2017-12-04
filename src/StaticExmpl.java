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
        staticExmpl.j = 1;
        staticExmpl2.j =2;
        System.out.println(staticExmpl.j);
        System.out.println(staticExmpl2.j);
    }
}
