public class ConstructorExample {
    int i;
    ConstructorExample(String hello, int i) { //не может быть статик, абстракт, финал
        this.i = i;
        System.out.println("run");
        System.out.println(hello);
    }
}

class Run {
    public static void main (String[] args) {
        ConstructorExample constructorExample = new ConstructorExample("hello", 5);
        System.out.println(constructorExample.i); //https://youtu.be/Se9yZGZg9-w?t=4m37s
    }
}