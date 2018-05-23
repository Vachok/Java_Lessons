package pattern.dao;

/**
 * Интерфейс, поможет сделать {@link Db} и {@link FileSyst} взаимозаменяемыми.
 * <p>
 * Заимплементим его в оба класса.
 *
 * @author IKudryashov
 * @see DaoMain
 * @since 23.05.2018 (14:34)
 */
interface DataDao {
    /**
     * Достаём данные.
     *
     * @return данные по-запросу.
     * @see Db
     * @see FileSyst
     */
    String getData();
}
