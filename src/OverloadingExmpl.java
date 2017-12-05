public class OverloadingExmpl {
    public static void main( String[] args ) {
        OverloadingExmpl overloadingExmpl = new OverloadingExmpl();
        short b = 5;
        overloadingExmpl.method(b);
    }

    void method(Integer i) {
        System.out.println("Integer");
    }
    void method(short... i) {
        System.out.println("byte...");
    }
    void method(Object i) {
        System.out.println("Object");
    }
    void method(Object... i) {
        System.out.println("Object");
    }
    void method(byte i) {
        System.out.println("byte");
    }
}