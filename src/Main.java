import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Parrent<T> {
}

class Child extends Parrent {

}

class Son extends Child {

}
public class Main {

    public static void main( String[] args ) {

        List<Parrent> list = new ArrayList<>();
        list.add(new Parrent());
        Main main = new Main();
        main.method(list);
    }

    void method( List<? super Child> list ) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}