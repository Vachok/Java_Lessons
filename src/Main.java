import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main( String[] args ) {
        Set set = new HashSet();
        set.add("1 ");
        set.add("2 ");
        set.add("2 ");
        set.add("1 ");
        set.add("1 ");
        for (Object o : set) {
            System.out.print(o);
        }
    }
}