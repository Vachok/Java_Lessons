import java.io.IOException;

public class Main {

    public static void main( String[] args ) {
        new Main().meMethod();
    }

    void meMethod() throws IOException {
        //    throw new RuntimeException();
            throw new IOException();
    }
}





/* Иерархия Exceptions
1. Throwable
    2. Error - не нужно ловить! Это риторические проблемы - сами придут.
    2. Exception -
        3. RuntimeException
        3. IO
        3 ....можно добавить свои подклассы

 */