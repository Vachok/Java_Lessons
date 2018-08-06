package lessons.j8.defstat;

import lessons.j8.helper.SaveToDatabase;
import lessons.j8.helper.SaverProgress;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**<h1>Класс, имплементит {@link A}</h1>
 * Переопределять нужно только {@link #printMessage(String)}
 * При желании можно переопределить и {@link #sayHello()}
 * @see DefAndStat
 * @since 06.08.2018 (12:44)
 */
class B implements A, C{
    private static final double ID_LESSON = 654.329;
    private static final String SOURCE_CLASS = B.class.getSimpleName();
private static SaverProgress saverProgress = new SaveToDatabase();
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();

    @Override
    public void printMessage(String messAge) {
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, "hello" + " " );
        linksToSave.put(SOURCE_CLASS,"hello");
        saverProgress.isSaved(linksToSave, ID_LESSON);

    }


    /**<h2>При совпадении имён</h2>
     * Если имплементятся несколько интерфейсов, где существуют методы с одинаковыми названиями,
     * необходимо переопределить или сделать что-то с этими методами.
     * По-другому компилятор будет ругаться и не даст сделать код.
     */
    @Override
    public void sayHello() {
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, "sayHello Overriden" + " ");
        linksToSave.put(SOURCE_CLASS, "sayHello Overridden");
    }
}
