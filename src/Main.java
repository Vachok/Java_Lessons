import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main<T extends Main & Comparable & Serializable> {

    public static void main( String[] args ) {

        List<File> list = new ArrayList<String>();
        Main main = new Main();
        main.method(list);

        for (File file : list) {
            System.out.println(file.getAbsoluteFile());
        }
    }

    void method( List list ) {

        list.add(new Main());
    }
}