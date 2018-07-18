package lessons.generics.bnds;


import java.io.Serializable;

/**  {@link Laun4}
Можно расширить функционал интерфейсами.
 Они добавляются через апостроф

 @since 18.07.2018 (13:34)
 @param <T>  */
class CellWithFace<T extends Job & Serializable>{

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

    /**{@link Job}
     *
     * Теперь объект T может выполнять метод {@link Job#doIt()}
     */
    public void doJob(){
        t.doIt();
    }

    /** Можно создать Generic методы, которые хранят независимые друг от друга типы.
     */
    <E> E getE(E e){
        return e;
    }
}
