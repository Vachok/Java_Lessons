package lessons.generics.whatis;


/**
 * Generic Type, после компиляции
 *
 * @since 17.07.2018 (17:28)
 @see Cell
 */
class CellMimicry{
    Object object;

    public Object getObject(){
        return object;
    }
    public void setObject(Object object){
        this.object = object;
    }
}
