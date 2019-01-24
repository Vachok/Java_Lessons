package lessons.general.grasppat;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Если у вас есть UI - используйте контроллер
 * <p>
 *
 * @since 23.01.2019 (12:02)
 */
public class GRASPController {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(new String("GRASPController{ Отвечает за работу кнопок/ссылок и тп."
            .getBytes(), StandardCharsets.UTF_8));
        sb.append('}');
        return sb.toString();
    }
}
