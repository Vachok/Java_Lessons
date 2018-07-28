package lessons.general;


/**
 * Его должны имплементить уроки.
 */
public interface Lessons {

    /**
     * Загрузочный метод. Запуск класса.
     */
    void launchMe();

    void linksPut(String lessonname, String links, boolean saveToDB);
}
