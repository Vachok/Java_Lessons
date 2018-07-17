package lessons.generics.whatis;


/**Созданный свой Generic. Например Банковская ячейка.
 *В байтокоде дженерики выглядят примерно так: {@link CellMimicry}
 * @param <T> можно определить свой тип. (деньги, золото, пр.)
 * @since 17.07.2018 (17:23)
 * @see Main
 */
public class Cell<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
