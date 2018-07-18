package lessons.generics.genmethods;


/**  {@link Laun3}
 Generic class
 @since 18.07.2018 (13:34)
 @param <T>  */
class Cell<T>{

    /** Конструктор тоже может быть GENERIC
     @param x
     @param <X>
     */
    <X> Cell(X x){

    }

    /**
     * Generic Object
     */
    T t;

    /**
     @param t {@link T}
     */
    void setT(T t) {
        this.t = t;
    }

    /** Можно создать Generic методы, которые хранят независимые друг от друга типы.
     @param e
     @param <E>
     @return
     */
    <E> E getE(E e){
        return e;
    }
}
