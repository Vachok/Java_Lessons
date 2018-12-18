package lessons.general.volatilepack;

import lessons.general.Lessons;

import java.util.logging.Logger;

/**
 * Volatile and happens before
 * <p>
 *     Volatile - заставляет читать переменные напрямую. Не используя кэш CPU.
 *<a href="https://github.com/Vachok/Java_Lessons/commit/0a3029031eeee5acd793f249345766efa75ecbfc"
 * target=_blank>Урок про волатильность</a>
 * @since 18.12.2018 (15:12)
 */
public class VolaVola implements Lessons {

    private static final Logger LOGGER = Logger.getLogger(VolaVola.class.getSimpleName());

    @Override
    public void launchMe() {
        linksPut("684-346","https://youtu.be/PP1Ac_PDlCM", true );
    }
}
