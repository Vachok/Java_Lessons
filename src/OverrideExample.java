class Parent{
     Parent method(Parent parent)  {
        return new Parent();
    }
}

class Child extends Parent {
    @Override
    Child method(Child child) {
        return new Child();
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
