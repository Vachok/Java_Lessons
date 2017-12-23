import java.util.Date;


public class Main {
    static long numOfOperation = 10_000_000_000L;
    public static void main(String[] args) {
        
        System.out.println(new Date());
        long j = 0;
        for(long i = 0;i < numOfOperation;i++){
            j += i;
        }
        System.out.println(j);
        System.out.println(new Date());
    }
}



//23.12.2017(10:39)by{Vachok}