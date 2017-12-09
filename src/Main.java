import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    int age;

    public Person( int age ) {
        this.age = age;
    }

    @Override
    public int compareTo( Person p ) {
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + '}';
    }
}

public class Main {
    public static void main( String[] args ) { //https://youtu.be/x4CUbW-K8E8?t=7m7s
        Set set = new TreeSet<>(); //создание отсортированной коллекции
        set.add(new Person(4)); // элемент коллекции
        set.add(new Person(6)); // элемент коллекции
        set.add(new Person(5)); // элемент коллекции
        set.add(new Person(2)); // элемент коллекции
        for (Object o : set) {
            System.out.println(o);
        }
    }
}