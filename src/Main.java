import java.io.File;
import java.io.IOException;

public class Main {

    public static void main( String[] args ) {

    }

    void meMethod() {
        /*chk
        throw new Throwable();
        throw new Exception();
        throw new IOException();
//////////|||||||||||||||||||||||||||||||||||||||\\
        /*UNchk
        throw new Error();
        throw new RuntimeException();
         */
    }
}



/* Иерархия Exceptions
1. Throwable
    2. Error - не нужно ловить! Это риторические проблемы - сами придут.
    2. Exception -
        3. RuntimeException - это "ошибки программирования" (unchk)
        3. IO (chk)
            3.1 Если работаем с "чужими" - нужно помещать в try/catch.
            3.2 Если пишем сами, для других прогеров. https://youtu.be/mLpMtc62530?t=39m25s
        3 ....можно добавить свои подклассы

 */