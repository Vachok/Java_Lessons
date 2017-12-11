import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Parrent<T> {
}

class Child extends Parrent {

}

class Son extends Parrent {

}
public class Main {

    public static void main( String[] args ) {

        List<Main> list = new ArrayList<>();
        list.add(new Main());
        Main main = new Main();
        main.method(list);
    }

    void method( List<? extends Object> list ) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}