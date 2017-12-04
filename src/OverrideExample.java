class Parent{
    int method() {
        return i;
    }
}

class Child extends Parent {
    @Override
    int method() {
        return 2;
    }
}

public class OverrideExample {
    public static void main( String[] args ) {
        Parent parent = new Parent();
        Child child = new Parent();
    }

}
