package pattern.dao;

/**
 * <b>Основной класс</b>.
 <p>
 Важный и широко используемый паттерн. К примеру есть {@link Db}({@link #db}).
 <p>
 Нужно делать классы {@link Db} и {@link FileSyst} взаимозаменяемыми. Для этого
 добавим интерфейс {@link DataDao}
 <p>
 Правило - <b>не надо менять готовый код.</b>. Если что-то нужно добавить,
 допишем класс...
 * @since 22.05.2018 (20:17)
 * @author IKudryashov
 */
class DaoMain {
    /**
     * Допустим мы хотим его использовать. {@link #mainD(String[])} (String[])}
     * Так же нам нужно вывести данные из {@link FileSyst}. Вместо ДБ.
     *
     * @deprecated
     */
    @Deprecated
    static Db db = new Db();
    /**
     * Теперь используем "файлы".
     * <p>
     * При такой операции, получается, что меня код в одном месте, придётся менять его
     * и в другом. Что <b>КАТЕГОРИЧЕСКИ</b> не правильно.
     *
     * @deprecated
     */
    @Deprecated
    static FileSyst fileSyst = new FileSyst();
    /**
     * Интерфейс-коммуникатор.
     *
     * @see Db
     * @see FileSyst
     */
    static DataDao dataDao = new FileSyst();

    /**
     * Делаем правильно .
     * <p>
     * Теперь, для выбора откуда печатать данные, надо просто зменить переменную
     * {@link #dataDao}.
     *
     * @param args {@link #mainD(String[])} - так делать <b>нельзя</b>!!!
     */
    public static void main(String[] args) {
        System.out.println("dataDao = " + dataDao);
    }

    /**
     * Выведем данные.
     *
     * @param args null
     * @deprecated используем {@link #main(String[])}
     */
    @Deprecated
    public static void mainD(String[] args) {
        System.out.println("db = " + db.getFromTable());
        System.out.println("fileSyst = " + fileSyst.getDataFromFs());
    }
}

