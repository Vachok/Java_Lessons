package lessons.generics.extend;


/** Generic Interface
 @since 18.07.2018 (12:51)
@see One
 @see Two
 @see Three
 @param <T>  */
interface GenFace<T>{
    T getT();
}
class One implements GenFace{

    @Override
    public Object getT() {
        return null;
    }
}
class Two implements GenFace<String>{

    @Override
    public String getT() {
        return null;
    }
}
class Three<T> implements GenFace<T>{

    @Override
    public T getT() {
        return null;
    }
}
