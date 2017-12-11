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

        List<Child> list = new ArrayList<Child>();
        Main main = new Main();
        main.method(list);

        for (Child child : list) {
            System.out.println(child);
        }
    }

    void method( List<Parrent> list ) {
        list.add(new Main());
    }
}

/* Generic
не может быть static
нельзя создать их Array
в списках определённого типа может быть только этот тип
 */