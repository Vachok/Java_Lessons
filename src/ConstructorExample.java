public class ConstructorExample {
    int i;
    ConstructorExample(String hello, int iValue) { //не может быть статик, абстракт, финал
        i = iValue;
        System.out.println("run");
        System.out.println(hello);
    }
}

class Run {
    public static void main (String[] args) {
        ConstructorExample constructorExample = new ConstructorExample("hello");
    }
}