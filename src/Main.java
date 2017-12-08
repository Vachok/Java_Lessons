import java.util.HashMap;
import java.util.Map;

class Book {
    String author;
    String name;
}

class Ticket {
    int number;
    String libraryName;

    @Override
    public boolean equals( Object o ) { // сверяет совпадения, если по-хэшу несколько объектов
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (number != ticket.number) return false;
        return libraryName.equals(ticket.libraryName);
    }

    @Override
    public int hashCode() { // адресует
        int result = number;
        result = 31 * result + libraryName.hashCode();
        return result;
    }
}

public class Main {
    public static void main( String[] args ) {
        Ticket ticket = new Ticket();
        ticket.number = 1123;
        Book book = new Book();
        book.author = "Kernegi";
        book.name = "how to get friends";
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket , book);

        Ticket ticket2 = new Ticket();
        ticket2.number = 1123;

        Book karnegiBook = library.get(ticket2);
        System.out.println(karnegiBook.author);
    }
}