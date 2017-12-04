public class ConstructorExample {
    int i;
    ConstructorExample(String hello, int i) { //не может быть статик, абстракт, финал
        this.i = i;
        System.out.println("run");
        System.out.println(hello);
    }
    ConstructorExample() { //не может быть статик, абстракт, финал
        this.i = i;
        System.out.println("run");
    }
    ConstructorExample(String hello) { //не может быть статик, абстракт, финал
        this.i = i;
        System.out.println("run");
        System.out.println(hello);
    }
}

class Run {
    public static void main (String[] args) {
        ConstructorExample constructorExample = new ConstructorExample("jhghjgg");
        System.out.println(constructorExample.i);
    }
}