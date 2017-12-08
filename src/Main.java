import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main( String[] args ) {
        Date date = new Date(0);
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar);
    }
}