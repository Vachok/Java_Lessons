package lessons.general.cap;

import lessons.general.Lessons;

import java.util.logging.Logger;

/**
 * Cap теорема
 * <p>
 * Consistency - пишу на 1й, доступно на 2м <br>
 * Avaliablity - компьютер должен ответить <br>
 * Partition tolerance - компьютер должен предоставлять сервис
 * <p>
 *
 * @since 24.01.2019 (11:05)
 */
public class CapTheor implements Lessons {

    private static final Logger LOGGER = Logger.getGlobal();

    @Override
    public void launchMe() {
        linksPut("703-359", "https://youtu.be/jXaNJaIDr5o", false);
    }

}
