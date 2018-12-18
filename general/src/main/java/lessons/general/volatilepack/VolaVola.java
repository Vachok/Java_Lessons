package lessons.general.volatilepack;

import lessons.general.Lessons;

import java.util.logging.Logger;

/**
 * Volatile and happens before
 * <p>
 * Volatile - заставляет читать переменные напрямую. Не используя кэш CPU.
 * <a href="https://github.com/Vachok/Java_Lessons/commit/0a3029031eeee5acd793f249345766efa75ecbfc"
 * target=_blank>Урок про волатильность</a> <br>
 * Volatile пишет не одну, а <b>все</b> переменные в память.
 * Потоки будут видеть и читать/записывать сразу все переменные (даже <b>не</b> volatile).
 * <p>
 * Volatile - присваивается для конкретной переменной,
 * в то время как synchronized делает подобную операцию для <b>функций</b>. <br>
 * Нельзя менять volatile на sync. У sync нет принципа <i>Happens Before</i> {@link #memModel()}. <br>
 * Синхронный контекст не будет выгружен из памяти!
 <p>
 Volatile: сливает и читает кэш напрямую. Добавляет happens before. <br>
 Synchronized: сливает и читает кэш напрямую. Блокирует кусок кода, чтобы никто не мог его больше выполнить.
 *
 * @since 18.12.2018 (15:12)
 */
public class VolaVola implements Lessons {

    private static final Logger LOGGER = Logger.getLogger(VolaVola.class.getSimpleName());
    private static int a = 0;
    private static int b = 0;

    /**
     * <a href="https://youtu.be/PP1Ac_PDlCM?t=400" target=_blank>Memory Model</a>
     * <p>
     * Ситуация, когда r1=2 и r2=1 казалось бы невозможна. НО <br>
     * На разных процессорах, используется разное кэширование и поток t1 может прервать t2 или наоборот. <br>
     * Volatile задаёт процессору <b>Happens Before Order</b>. Она ставит строгий порядок выполнения.
     * Всё, что идёт после переменной volatile будет исполнено в строгом порядке. t1 потом t2.
     */
    private static void memModel() {
        LOGGER.info("VolaVola.memModel");
        Thread t1 = new Thread() {
            @Override
            public void run() {
                int r1 = a;
                b = 1;
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                int r2 = b;
                a = 1;
            }
        };
        t1.start();
        t2.start();
    }

    @Override
    public void launchMe() {
        linksPut("684-346", "https://youtu.be/PP1Ac_PDlCM?t=1083", true);
        memModel();
    }
}
