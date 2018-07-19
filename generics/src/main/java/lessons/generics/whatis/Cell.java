package lessons.generics.whatis;


/**Созданный свой Generic. Например Банковская ячейка.
 *В байтокоде дженерики выглядят примерно так: {@link CellMimicry}
 * @param <T> можно определить свой тип. (деньги, золото, пр.)
 * @since 17.07.2018 (17:23)
 * @see Launcher1
 */
public class Cell<T> {

    /**
     * GENERIC Object
     */
    T t;

    /**
     * @return generic
     */
    public T getT() {
        return t;
    }

    /**
     * @param t generic
     */
    public void setT(T t) {
        this.t = t;
    }
}
