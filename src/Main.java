

public class Main {
    public static void main(String[] args) throws Exception {
        SomeClass someClass = new SomeClass();
        Class clss = someClass.getClass();
        Class clss2 = SomeClass.class;
        Class clss3 = Class.forName("SomeClass");

    }
}


class SomeClass {
    private static transient int i;
    String s;

    public SomeClass() {
    }

    SomeClass(String s) {
        this.s = s;
    }

    public String someMethod(String s) {
        System.out.println("this is" + s);
        return s;
    }
}
