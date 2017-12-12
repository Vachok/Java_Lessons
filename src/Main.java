import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) throws Exception {
        SomeClass someClass = new SomeClass();
        Class clss = someClass.getClass();
        System.out.println(clss.getName());

        Class clss2 = SomeClass.class;
        Class clss3 = Class.forName("SomeClass");
        SomeClass someClass1 = (SomeClass) clss.newInstance();

        Constructor[] constructors = clss.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print("Constructors: " + constructor.getName() + " ");
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.print(parameter.getType().getName());
            }
        }
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
