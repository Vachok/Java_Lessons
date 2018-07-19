package lessons.generics.wildcards;

/** Generic class
 * @param <T>
 */
class Cell<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
