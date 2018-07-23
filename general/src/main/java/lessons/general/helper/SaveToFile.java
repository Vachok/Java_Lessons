package lessons.general.helper;

import java.util.Map;

/**
 * @since 21.07.2018 (23:43)
 */
class SaveToFile implements SaverProgress {

    @Override
    public boolean isSaved() {
        return false;
    }

    @Override
    public void saveMap(Map<?, ?> dataToSave, double idLesson) {

    }
}