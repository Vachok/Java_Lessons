package lessons.general;


import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaveToFile;
import lessons.general.helper.SaverProgress;

import java.io.UnsupportedEncodingException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

/**
 * Его должны имплементить уроки.
 */
public interface Lessons {

    /**
     * Сохранение прогресса.
     *
     * @param lessonName Название урока
     * @param links      ссылка на <a href="https://www.youtube.com" target=_blank>youtube</a>
     * @param saveToDB   true - созраняет в БД, false - в файл.
     */
    default void linksPut(String lessonName, String links, boolean saveToDB) {
        SaverProgress saverProgress = new SaveToFile();
        if (saveToDB) {
            saverProgress = new SaveToDatabase();
        }
        Map<String, String> stringStringMap = new TreeMap<>();
        stringStringMap.put(lessonName, links);
        try{
        saverProgress.isSaved(stringStringMap, new String(lessonName.getBytes(), "UTF-8"));
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        Logger.getLogger(this.getClass().getSimpleName()).warning(saverProgress.toString());
    }

    /**
     * Загрузочный метод. Запуск класса.
     */
    void launchMe();
}
