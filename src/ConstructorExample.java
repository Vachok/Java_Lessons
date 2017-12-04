class MyParent{
    MyParent() {
        System.out.println("MyParrentConstructor");
    }
}

public class ConstructorExample extends Object {
    ConstructorExample() {
        System.out.println("Constructor Example");
    }

    public static void main (String[] args) {
        new ConstructorExample();
    }
}
