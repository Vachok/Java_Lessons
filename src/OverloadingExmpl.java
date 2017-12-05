public class OverloadingExmpl {
    public static void main( String[] args ) {
        OverloadingExmpl overloadingExmpl = new OverloadingExmpl();
        short b = 5;
        overloadingExmpl.method((byte)b);

    }
// Что стартует первым?

    void method(int i) {
        System.out.println("int");
    }
    void method(long i) {
        System.out.println("long");
    }
    void method(Integer i) {
        System.out.println("Integer");
    }
    void method(double i) {
        System.out.println("double");
    }
    void method(short... i) {
        System.out.println("byte...");
    }
    void method(Short i) {
        System.out.println("Byte");
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