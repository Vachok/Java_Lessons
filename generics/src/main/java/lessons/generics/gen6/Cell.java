package lessons.generics.gen6;

/**Generic
 * @since 19.07.2018 (17:14)
 * @param <T>
 */
 class Cell <T>{
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}