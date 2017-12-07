import java.io.File;
import java.io.IOException;

public class Main {

    public static void main( String[] args ) {
        if (args.length > 5)
            System.out.println(args[5]);
        new Main().meMethod();
    }

    void meMethod() throws IOException {
        File file = new File("");
        file.createNewFile();
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