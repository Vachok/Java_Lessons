class MyParent{
    MyParent(int i) {
        System.out.println("MyParrentConstructor");
    }
}

public class ConstructorExample extends MyParent {
    ConstructorExample() {
        super();
        System.out.println("Constructor Example");
    }

    public static void main (String[] args) {
        new ConstructorExample();
    }
}
