// hashCode - возвращает адрес объекта
// equals - проверяет, находится ли объект по тому же адресу
import java.util.HashMap;
import java.util.Map;

class Book {
    String author;
    String name;
}

public class Main {
    public static void main( String[] args ) {
        Book book = new Book();
        book.author = "Kernegi";
        book.name = "how to get friends";
        Map<String, Book> library = new HashMap<>();
        library.put(book.name , book);

        Book karnegiBook = library.get(book.name);
        System.out.println(karnegiBook.author);

        System.out.println(book.hashCode());
        System.out.println(new Book().hashCode());
    }
}