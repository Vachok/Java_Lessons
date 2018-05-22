package pattern.composentry;

/**
 * Класс, который объединяет {@link DepObj1} и {@link DepObj2}.
 *
 * @author IKudryashov
 * @see ComposEntMain
 * @since 22.05.2018 (12:54)
 */
class CoarseGainObj {
    /**
     * {@link DepObj1}
     */
    DepObj1 depObj1 = new DepObj1();
    /**
     * {@link DepObj2}
     */
    DepObj2 depObj2 = new DepObj2();

    /**
     * @return массив информации от объединяемых объектов.
     */
    public String[] getData() {
        return new String[]{depObj1.getData(), depObj2.getData()};
    }
}

/**
 * Класс, содержащий объединённый объект.
 * <p>
 * Сюда обращается клиент.
 *
 * @author IKudryashov
 * @see ComposEntMain
 * @since 22.05.2018 (12:59)
 */
class ComposiEntity {
    CoarseGainObj coarseGainObj = new CoarseGainObj();

    public String[] getData() {
        return coarseGainObj.getData();
    }
}