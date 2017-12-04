public class ConstructorExample { //https://youtu.be/Se9yZGZg9-w?t=1m
     ConstructorExample(){ //не может быть статик, абстракт, финал
        System.out.println("run");
    }
}

class Run {
    public static void main (String[] args) {
        ConstructorExample constructorExample = new ConstructorExample();
    }
}