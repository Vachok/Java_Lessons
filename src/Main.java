import java.util.HashMap;
import java.util.Map;

class Book {
    String author;
}

public class Main {
    int value;

    public static void main( String[] args ) {
        Book book = new Book();
        book.author = "Kernegi"
        Map<String, Book> library = new HashMap<>();
        library.put("How to get friends" , book);
    }
}