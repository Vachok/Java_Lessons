package pattern.mvc;

/**
 * Класс-контроллер.
 * <p>
 * Управляет процессом. Берёт данные из модели (может быть чем угодно), и передаёт ее
 * в вьюху. Взаимодействуем через интерфейс {@link ModelLayer}.
 *
 * @author IKudryashov
 * @see MvcMain
 * @since 21.05.2018 (16:42)
 */
class Controllerm {
    /**
     * Получает инфо из БД
     * <p>
     * <p>
     * Если мы хотим изменить способ "получения {@link Student}",
     * достаточно просто использовать {@link #modelLayerF}
     */
    ModelLayer modelLayer = new DBLayer();
    /**
     * Получает инфо из файлов.
     *
     * @see #modelLayer
     */
    ModelLayer modelLayerF = new FileSystemLayer();
    /**
     * Создадим копию вьювера. Консольный вывод.
     * Можем быстро сменить, на {@link HtmlViewS}, и смотреть html
     */
    ViewVachok viewVachok = new ConsoleViewS();

    /**
     * Сам по себе рабочий метод
     */

    void exeCute() {
        Student student = modelLayer.getStudent();
        viewVachok.showStudent(student);
    }
}

