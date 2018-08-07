package lessons.j8.methref;

import lessons.j8.Lessons;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * <h1>Method References</h1>
 *{@link #goApp(boolean)}
 * @since 07.08.2018 (9:52)
 */
public class MethRef implements Lessons {
    /**
     * <h2>GitHubID</h2>.<h2>JavaLesson ID</h2>
     */
    private static final Double ID_LESSON = 656.331;

    private static final String SOURCE_CLASS = MethRef.class.getSimpleName();
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();

    /**
     * <b>Сохнанение прогресса</b>
     * <p>
     *
     * @param lessonName in DB
     * @param links      in DB
     * @param saveToDB   true = save
     */
    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        linksToSave.clear();
        linksToSave.put(lessonName, links);
        lessons.j8.helper.SaverProgress saverProgress = new lessons.j8.helper.SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, ID_LESSON);
        } else Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
    }

    /**
     * Загрузочный метод. Запуск класса.
     */
    @Override
    public void launchMe() {
        boolean isSaved = true;
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSaved);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/653", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/nNEMhUQCysA", isSaved);
        goApp(isSaved);
    }

    /**<h2>Концепт</h2>
     * Есть {@link java.util.stream.Stream}. Его надо переделать в UPPERCASE.
     * {@code Stream.of("one", "two").map(x->x.toUpperCase());}. Можно ещё больше упростить.
     <p>
     {@code Stream.of("one", "two").map(String::toUpperCase);}.
     * @param isSaved to DB
     * @see Student
     */
    private void goApp(boolean isSaved){
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, "goApp!" + " " + isSaved);
        linksPut(SOURCE_CLASS, "goApp!", isSaved);
        Stream.of("one", "two").map(x->x.toUpperCase());
        Stream.of("one", "two").map(String::toUpperCase);
        newStud(isSaved);
    }

    /**<h2>Пример ссылки на метод</h2>
     * Поток ссылается на геттер имени у {@link Student}
     * Тут вызовется только метод {@link Student#getName()}. Потом выводим на экран, через ссылку на метод {@code System.out.
     * println}.
     * Чтобы не расписывать {@code x-> System.out.println(x)}.
     * Это и есть Method Reference.
     * @param isSaved to DB
     */
    private void newStud(boolean isSaved) {
        Stream.of(new Student("Vachok"), new Student("Неприятный"), new Student("Мудачок")).map(Student::getName).forEach(System.out::println);
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, "МОХ" + " " + isSaved);
        linksPut(SOURCE_CLASS, "МОХ", isSaved);
        specSignat(isSaved);
    }

    /**<h2>Конструкторы</h2>
     * Таким образом, через Method Reference, можно вызвать конструктор у {@link Student#Student(String)}.
     * Записи равноценны.
     * @param isSaved to DB
     */
    private void specSignat(boolean isSaved) {
        Stream<Student> studentStream1 = Stream.of("John", "Mike", "Spyke").map(Student::new);
        Stream<Student> studentStream = Stream.of("John", "Mike", "Spyke").map(x -> new Student(x));
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, studentStream + " " + isSaved);
        linksPut(SOURCE_CLASS, studentStream.toString(), isSaved);
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO,studentStream1.toString() +" " + isSaved);
        linksPut(SOURCE_CLASS, studentStream1.toString(), isSaved);
    }
}

