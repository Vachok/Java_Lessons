class Parent{
     StaticExample method() {
        return null;
    }
}

class Child extends Parent {
    @Override
    Parent method() {
        return null;
    }
}

public class OverrideExample {
    public static void main( String[] args ) {
        Parent parent = new Parent();
        Parent child = new Child();

        System.out.println(parent.method());
        System.out.println(child.method());
    }

}
