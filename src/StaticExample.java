public class StaticExample {
    static StaticExample staticExample = new StaticExample();
    static int n = 4;
    static int i = returnIntStatic();

    static int k = 3;
    int j = returnInt();
    static {
        System.out.println("static");
    }
    {
        System.out.println("clean");
    }
    StaticExample() {
        System.out.println("constructor");
    }
    static int returnIntStatic() {
        System.out.println(n);
        System.out.println(k);
        System.out.println("return static int");
        return 1;
    }
    int returnInt() {
        System.out.println("return int");
        return 2;
    }

    public static void main( String[] args ) {
        new StaticExample();
    }
}
