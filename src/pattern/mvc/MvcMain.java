package pattern.mvc;

/**
 * <b>Основной класс</b>
 <p>
 Концепция - состоит из 3х условных частей-классов. Контроллер {@link Controllerm}, вьювер и модель.
 * @author 14350
 * @since 20.05.2018
 */
public class MvcMain {
    /**
     * Создаём копию контроллера и запускаем его метод {@link Controllerm#exeCute()}
     *
     * @param args null
     */
    public static void main(String[] args) {
        Controllerm controllerm = new Controllerm();
        controllerm.exeCute();
    }
}
