import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Parrent<T> {
}

class Child extends Parrent {

}

public class Main {

    public static void main( String[] args ) {

        List<Child> list = new ArrayList<>();
        list.add(new Child());
        Main main = new Main();
        main.method(list);
    }

    void method( List<Parrent> list ) {
        for (Parrent parrent : list) {
            System.out.println(parrent);
        }
        list.add(new Parrent());
    }
}