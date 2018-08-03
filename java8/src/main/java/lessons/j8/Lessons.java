package lessons.j8;


/**
 * Его должны имплементить уроки.
 */
public interface Lessons {

    void linksPut(String lessonName, String links, boolean saveToDB);

    /**
     * Загрузочный метод. Запуск класса.
     */
    void launchMe();
}
