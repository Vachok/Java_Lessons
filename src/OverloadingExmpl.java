public class OverloadingExmpl {
    public static void main( String[] args ) {
        OverloadingExmpl overloadingExmpl = new OverloadingExmpl();
        short b = 5;
        short c = 5;
        overloadingExmpl.method(b, c);
    }
// 3 основных типа
    void method(long i , long c) { //1 расширение short -> long (exmpl)
        System.out.println("long");
    }
    void method(Short i, Short c) { //2 autoboxing
        System.out.println("Short");
    }
    void method(short... i) { //3 massive
        System.out.println("Short");
    }
}