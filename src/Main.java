import java.util.Date;

public class Main {
    public static void main( String[] args ) {
        Date dt = method()
        //после выполнения, объект может быть удалён
        method();
        method2();
    }

    private static Date method() {
        // Date date; - так объект НЕ создаётся. это только объявление
        // new Date(); - так объект создан, но потерян. нет ссылки
        Date date; //создание ссылки на объект в памяти
        date = new Date(); //создание объекта в памяти
        Date date2 = date;
        System.out.println(date);
        return date;
    }

    private static void method2() {
    }
}