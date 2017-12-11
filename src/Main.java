import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Parrent {

}

class Child extends Parrent {

}

public class Main {

    public static void main( String[] args ) {

        List<Child> list = new ArrayList<Child>(); // сюда нельзя записать Parrent
        List<Child>[] arr = new ArrayList<Child>[5]; // массив в Generic тоже нельзя
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