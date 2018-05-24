package pattern.intercfilter;

/**
 * Класс, который мы будем запускать. Контроллер фильтра.
 *
 * @author IKudryashov
 * @see InFilter
 * @since 24.05.2018 (9:29)
 */
public class TargtClass {

    /**
     * @param data данные фильтра
     * @see FilterChain
     * @see InterFilterMain
     */
    void doJob(String data) {
        System.out.println("TargtClass.doJob " + data);
    }
}
