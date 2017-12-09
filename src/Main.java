import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person {
    int age;

    public Person( int age ) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + '}';
    }
}

class ComparePerson implements Comparator<Person> {
    @Override
    public int compare( Person o1 , Person o2 ) {

    }
}

public class Main {
    public static void main( String[] args ) {
        Set set = new TreeSet<>();
        set.add(new Person(4));
        set.add(new Person(6));
        set.add(new Person(5));
        set.add(new Person(2));
        for (Object o : set) {
            System.out.println(o);
        }
    }
}