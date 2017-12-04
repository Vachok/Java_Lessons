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
    ConstructorExample(int i) { //не может быть статик, абстракт, финал
        this.i = i;
        System.out.println("run");
    }
}

class Run {
    public static void main (String[] args) {
        ConstructorExample constructorExample = new ConstructorExample(5);
        System.out.println(constructorExample.i);
    }
}