public class OverloadingExmpl {
    public static void main( String[] args ) {
        OverloadingExmpl overloadingExmpl = new OverloadingExmpl();
        short b = 5;
        overloadingExmpl.method((int)(b));
    }

    void method(Integer i) {
        System.out.println("Integer"); //не запустится
    }
}