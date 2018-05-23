package pattern.dao;

/**
 * Класс забирающий данные из базы.
 *
 * @author IKudryashov
 * @see DaoMain
 * @since 23.05.2018 (14:20)
 * @deprecated
 */
@Deprecated
class Db implements DataDao {
    /**
     * @return условные данные.
     */
    String getFromTable() {
        return "data from table";
    }

    /**
     * @return для универсальности.
     */
    @Override
    public String getData() {
        return getFromTable();
    }
}
