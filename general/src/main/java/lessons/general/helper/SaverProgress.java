package lessons.general.helper;

import java.util.Map;

/**
 * SaverProgress
 * <p>
 *
 * @author 14350
 * @since 21.07.2018
 */
public interface SaverProgress {

    boolean isSaved(Map<?, ?> dataToSave, double idLesson);
}
