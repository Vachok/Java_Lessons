package lessons.generics.wildcards;

import lessons.generics.GenericsLesson;
import lessons.generics.Lessons;
import lessons.generics.StartMe;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import java.util.ArrayList;
import java.util.List;

/**<b>Wild Card</b>
 <p>
 О том, что не стоит совмещать Generic и НЕ Generic code.
 {@link Cell}
 * @since 19.07.2018 (16:06)
 */
public class Launcher5 implements Lessons {

    private static final String SOURCE_CLASS = Launcher5.class.getSimpleName();
    private static GenericsLesson saver = new StartMe();
    private static List<String> links = new ArrayList<>();
    private static MessageToUser messageToUser = new MessageCons();
    private boolean db;

    public Launcher5(boolean db) {
        this.db = db;
    }

    /** Тут в метод, который принимает НЕ generic, передаётся generic-class.
     *Получается <b>unchecked call</b> .
     * Это несовместимо с Java4-
     *
     * @param cell hello
     */
    static void add(Cell cell){
        cell.setT("hello");
    }

    @Override
    public void launchMe() {
        links.add(this.getClass().getSimpleName()+ " -> List <String> links: ");
        links.add("Wild Card >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        links.add("https://youtu.be/gilxWHyGXbg?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX");
        saver.progressSaver(links, db, 621.314);
        lessonStart();
    }

    /**
     * 1. Создаём экземпляр {@link Cell}, хранящий {@link House}
     * 2. Отправим его в {@link #add(Cell)}
     * 3. Пробуем создать копию {@link House}.
     * Вываливается <b>cannot be cast</b> exception.
     */
    private void lessonStart() {
        Cell<House> cell = new Cell<>();
        add(cell);
//        House house = cell.getT(); Exception in thread "main" java.lang.ClassCastException:
    }
}
