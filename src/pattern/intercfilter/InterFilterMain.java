package pattern.intercfilter;

/**
 * @since 23.05.2018 (17:10)
 */
interface InFilter {
    void exec(String data);
}

/**
 * <b>Основной класс</b>
 * <p>
 *По-сути своей фаерволл.
 * @see InFilter
 * @author IKudryashov
 * @since 23.05.2018 (16:39)
 */
public class InterFilterMain {
}

class AuthFilter implements InFilter {

    @Override
    public void exec(String data) {
        System.out.println("AuthFilter.exec");
    }
}
