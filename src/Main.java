import java.util.Date;

public class Main {
    public static void main( String[] args ) {
        Date dt = method(); //пока есть ссылка - объект не удаляется
        dt = null; //пометить на удаление
        method2();
    }

    private static Date method() {
        Date date;
        date = new Date();
        Date date2 = date;
        System.out.println(date);
        return date;
    }

    private static void method2() {
    }
}