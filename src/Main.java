/*import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Parrent<T> {
    void method() {
        System.out.println("b");
    }
}

class Child extends Parrent {
}

class Son extends Child {
    void method() {
        System.out.println("son");
    }
}
public class Main {

    public static void main( String[] args ) {

        List<Parrent> list = new ArrayList<>();
        list.add(new Parrent());
        Main main = new Main();
        main.method(list);
    }

    void method( List<? super Child> list ) {
        list.add(new Son());
        for (Object o : list) {
            Parrent p = (Parrent) o;
            p.method();
        }
    }
}*/