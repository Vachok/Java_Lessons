import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Car extends Main implements Comparable, Serializable {
    @Override
    public int compareTo( Object o ) {

        return 0;
    }
}

public class Main<T extends Main & Comparable & Serializable> { // удобны для хранения данных

    public static void main( String[] args ) {

        List<Main> list = new ArrayList<String>(); // только Main
        List list2 = new ArrayList(); // что угодно! плохо!
        list.add("STring");
        list2.add("");
        list2.add(new Object());
        list2.add(new File());
        for (Object o : list2) {
            File f = (File) o;
        }
    }
}