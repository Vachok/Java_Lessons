package pattern.iterat;


/**
 * <b>Основной класс</b>
 *<p>
 Позволяет "бегать" по-коллекции
 * @author 14350
 * @since 06.05.2018 (11:56)
 * @see IteratorFace
 */
public class IterMain {
    /**
     Бежим по-коллекции.
     <p>
     Сначала создаём копию контейнера {@link ContainerClass}.
     Потом берём из неё {@link IteratorFace}.
     И бежим - {@link IteratorFace#hasNext()}, {@link IteratorFace#next()}

     @param args null

     @see ContainerClass#array
     */
    public static void main(String[] args) {
        ContainerClass containerClass = new ContainerClass();
        IteratorFace iterator = containerClass.getIterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}

