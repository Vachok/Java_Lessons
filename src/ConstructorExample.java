public class ConstructorExample {
    int i;
    void ConstructorExample(String hello, int i) { //не может быть статик, абстракт, финал
        this.i = i;
        System.out.println("run");
        System.out.println(hello);
    }
}

class Run {
    public static void main (String[] args) {
        ConstructorExample constructorExample = new ConstructorExample();
        System.out.println(constructorExample.i);
    }
}