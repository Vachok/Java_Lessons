public class Main {

    public static void main( String[] args ) {
        new Main().meMethod();
    }

    void meMethod() {
        try {
            System.out.println("try");
            throw new MyException();
        } catch (MyException e) {
            System.out.println("catch");
        }
    }

    private class MyException extends Throwable {
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