public class StaticExmpl {
    static int i;
    int i;
    static {
        System.out.println("static initializer");
    }
    {
        System.out.println("initializator");
    }
    StaticExmpl() {
        System.out.println("Constructor");
    }

    public static void main( String[] args ) {

    }
}
