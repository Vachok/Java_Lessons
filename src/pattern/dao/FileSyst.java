package pattern.dao;

/**
 * Класс файловая система.
 *
 * @author IKudryashov
 * @see Db
 * @see DaoMain
 * @since 23.05.2018 (14:27)
 */
class FileSyst implements DataDao {
    /**
     * @return условные данные из ФС.
     */
    String getDataFromFs() {
        return "data from FS";
    }

    /**
     * @return дописываем, для универсальности.
     */
    @Override
    public String getData() {
        return getDataFromFs();
    }
}
