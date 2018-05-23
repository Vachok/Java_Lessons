import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;


public class Main3 {
    public static void main(String[] args) {
        
        System.out.println(Math.random());
        System.out.println(ThreadLocalRandom.current().nextInt()); //RANDOM для многопоточных
        System.out.println(TimeUnit.DAYS.toMillis(14));
        
    }
}



//23.12.2017(17:54)by{Vachok}