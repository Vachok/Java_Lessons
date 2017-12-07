import java.io.IOException;

public class Main {

    public static void main( String[] args ) {
        System.out.println(args[5]);
            new Main().meMethod();
    }

    void meMethod() throws RuntimeException {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
        }
        //    throw new IOException();
    }
}



/* Иерархия Exceptions
1. Throwable
    2. Error - не нужно ловить! Это риторические проблемы - сами придут.
    2. Exception -
        3. RuntimeException - это "ошибки программирования"
        3. IO
        3 ....можно добавить свои подклассы

 */