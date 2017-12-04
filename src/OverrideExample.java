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

}
