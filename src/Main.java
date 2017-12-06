import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    Object o;

    public static void main( String[] args ) {
        method();
    }

    private static void method() {
        Runtime runTime = Runtime.getRuntime();
        System.out.println("total memory before: " + runTime.totalMemory());
        System.out.println("free memory before: " + runTime.freeMemory());
        List<Date> dateList = new ArrayList<>(200000000);
        for (int i = 0; i < 200000000; i++) ;
        {
            Date date = new Date();
            dateList.add(date);
            //date = null;
        }
        dateList = null;
        System.out.println("total memory after: " + runTime.totalMemory());
        System.out.println("free memory after: " + runTime.freeMemory());
        System.gc();
        System.out.println("total memory after gc: " + runTime.totalMemory());
        System.out.println("free memory after gc: " + runTime.freeMemory());
    }

    @Override
    public void finalize() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAa");

    }
}