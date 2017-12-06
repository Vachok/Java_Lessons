import java.util.Date;

public class Main {
    public static void main( String[] args ) {
        method();
    }

    private static void method() {
        Runtime runTime = Runtime.getRuntime();
        System.out.println("total memory before: " + runTime.totalMemory());
        System.out.println("free memory before: " + runTime.freeMemory());
        for (long i = 0; i < 2000000000; i++) ;
        { // создание кучи объектов
            Date date = new Date(); // выделение памяти
            date = null; // помечаем на удаление
        }
        System.out.println("total memory after: " + runTime.totalMemory());
        System.out.println("free memory after: " + runTime.freeMemory());
        System.gc();
        System.out.println("total memory after gc: " + runTime.totalMemory());
        System.out.println("free memory after gc: " + runTime.freeMemory());
    }

    private static void method2() {
    }
}