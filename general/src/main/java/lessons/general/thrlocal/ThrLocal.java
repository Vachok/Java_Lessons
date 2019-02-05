package lessons.general.thrlocal;

import lessons.general.Lessons;
import ru.vachok.messenger.MessageCons;

import java.util.logging.Logger;

/**
 ThreadLocal
 <p>
 Контейнер, куда можно ложить объекты, которые будут локальны для текущего потока.
 Другие потоки видеть этот объект не будут.

 @since 05.02.2019 (12:33) */
public class ThrLocal implements Lessons {

    private static final Logger LOGGER = Logger.getGlobal();

    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    @Override
    public void launchMe() {
        linksPut("707-363", "https://youtu.be/4Cr7kqf7nq4", false);
        try {
            thrLoC();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     Суть - у каждого потока будет своё значение.
     <p>

     @throws InterruptedException .join()
     */
    private void thrLoC() throws InterruptedException {
        threadLocal.set("Hello local");
        Thread one = new ThrOne();
        Thread two = new ThrTwo();
        one.start();
        two.start();
        one.join();
        two.join();
        new MessageCons().infoNoTitles(getClass().getSimpleName() + " " + threadLocal.get());
    }

    /**
     @see ThrLocal
     @since 05.02.2019 (12:39)
     */
    public static class ThrOne extends Thread {
        @Override
        public void run() {
            threadLocal.set(toString());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            new MessageCons().infoNoTitles("ThreadOne " + threadLocal.get());
        }
    }

    /**
     @see ThrLocal
     @since 05.02.2019 (12:46)
     */
    public static class ThrTwo extends Thread {
        @Override
        public void run() {
            threadLocal.set(toString());
            new MessageCons().infoNoTitles("ThreadTwo " + threadLocal.get());
        }
    }
}
