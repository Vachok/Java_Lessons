import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main( String[] args ) {
        Set set = new TreeSet<>();
        set.add("2");
        set.add("5");
        set.add("4");
        set.add("1");
        for (Object o : set) {
            System.out.println(o);
        }
    }
}