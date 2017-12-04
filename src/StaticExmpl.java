public class StaticExmpl {
    static int i; // вначале 0
    int j;
    static {
        System.out.println("static initializer");
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
     new StaticExmpl();
     new StaticExmpl();
     new StaticExmpl();
     new StaticExmpl();
        System.out.println(StaticExmpl.i);
    }
}
