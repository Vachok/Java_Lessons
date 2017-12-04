
import java.io.FileNotFoundException;
import java.io.IOException;

class Parent{
     Parent method() {
        return new Parent();
    }
}

class Child extends Parent {
    @Override
    Child method() {
        return new Child();
    }
}

public class OverrideExample {
    public static void main( String[] args ) throws Exception {
        Parent parent = new Parent();
        Parent child = new Child();

        System.out.println(parent.method());
        System.out.println(child.method());
    }
}
