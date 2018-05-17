package pattern.proxer;

/**
 <b>Основной класс</b>
 <p>
 Proxy - будет "вклиниваться" между {@link CarP} и {@link Reno}

 @see CarProxy
 @since 03.05.2018 (14:46) */
public class ProxMain {
    /**
     Между имплементацией {@link CarP} и реализацией {@link Reno},
     вклинивается {@link CarProxy}.
     <code>Console output is saving to: C:\Users\ikudryashov.EATMEAT\IdeaProjects\Java_Lessons\README.md
     proxy
     Reno drive
     Process finished with exit code 0</code>

     @param args null
     */
    public static void main(String[] args) {
        CarP car = new CarProxy();
        car.drive();
    }
}

