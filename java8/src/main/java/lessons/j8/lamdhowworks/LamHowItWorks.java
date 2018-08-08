package lessons.j8.lamdhowworks;

import lessons.j8.Lessons;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**<h1>Как работают лямбда-выражения.</h1>
 * @since 08.08.2018 (11:12)
 */
public class LamHowItWorks implements Lessons {
    /**
     * <h2>GitHubID</h2>.<h2>JavaLesson ID</h2>
     */
    private static final Double ID_LESSON = 660.335;

    private static final String SOURCE_CLASS = LamHowItWorks.class.getSimpleName();
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> linksToSave = new ConcurrentHashMap<>();

    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        linksToSave.clear();
        linksToSave.put(lessonName, links);
        lessons.j8.helper.SaverProgress saverProgress = new lessons.j8.helper.SaveToDatabase();
        if (saveToDB) {
            saverProgress.isSaved(linksToSave, ID_LESSON);
        } else Logger.getLogger(getClass().getSimpleName()).log(Level.WARNING, "NOT SAVED!");
    }

    @Override
    public void launchMe() {
        boolean isSaved = true;
        linksPut(this.getClass().getPackageName(), SOURCE_CLASS, isSaved);
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/660", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/GMzP5vIG9YU?t=601", isSaved);
        goApp(isSaved);
    }

    /**<h2>2 вида операций с лямбдами</h2>
     * Intermediate - операции при которых ничего не проиходит. Подготовительные операции. Напр. map
     <p>
     Terminal - операции, которые что-то делают. Например forEach.
     <p>
     Функции проходят "Вертикально".
     В примере все 2 для каждого элемента.
     {@link #ordersBy(boolean)}
     * @param isSaved to db
     */
    private void goApp(boolean isSaved) {
        Stream<String> stringStream = Stream.of("a", "b", "c");
        stringStream.map(s->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, s + " MAP" + isSaved);
            linksPut(SOURCE_CLASS, s+" MAP", isSaved);
            return s;
        }).map(s->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO,s +" MAP2" + isSaved);
            linksPut(SOURCE_CLASS, s+" MAP2", isSaved);
            return s;
        }).forEach(s-> {Logger.getLogger(SOURCE_CLASS).log(Level.INFO, s + " " + isSaved);
        linksPut(SOURCE_CLASS, s, isSaved);});
        ordersBy(isSaved);
    }

    /**<h2>Последовательность выполнения</h2>
     * В данном примере forEach не запустится вообще.
     <p>
     Вывод - лучше сначала применить фильтры, а потом замапать.
     {@link #goApp2(boolean)}
     * @param isSaved to db
     */
    private void ordersBy(boolean isSaved) {
        Stream<String> stringStream = Stream.of("a", "b", "c");
        stringStream.map(s->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, s + " MAP" + isSaved);
            linksPut(SOURCE_CLASS, s+" MAP", isSaved);
            return s.toUpperCase();
        }).filter(s->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO,s +" filter" + isSaved);
            linksPut(SOURCE_CLASS, s+ "filter", isSaved);
            return s.equals("a");
        }).forEach(s->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO,s +" foreach" + isSaved);
            linksPut(SOURCE_CLASS, s+" foreach", isSaved);
        });
        goApp2(isSaved);
    }

    /**<h2>Нельзя переиспользовать стримы</h2>
     *Но из этого можно выйти следующим образом.
     * {@link #goApp2_1(boolean)}
     * @param isSaved to db
     */
    private void goApp2(boolean isSaved) {
        Stream<String> stringStream = Stream.of("a", "b", "c");
        stringStream.forEach(s->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO,s +" 1" + isSaved);
            linksPut(SOURCE_CLASS, s+" 1", isSaved);
        });
/*        stringStream.forEach(s->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, s + " 2" + isSaved);
            linksPut(SOURCE_CLASS, s+" 2", isSaved);
        });*/
        goApp2_1(isSaved);
    }

    /**<h2>Использование {@link Supplier}</h2>
     * Если надо переиспользовать стрим - можно поюзать {@link Supplier}
     * {@link #parStr(boolean)}
     * @param isSaved to db
     */
    private void goApp2_1(boolean isSaved) {
        Stream<String> stringStream = Stream.of("a", "b", "c");
        Supplier<Stream<String>> supplier = ()->Stream.of("a", "b", "c");
        supplier.get().forEach(s->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO,s +" 1" + isSaved);
            linksPut(SOURCE_CLASS, s+" 1", isSaved);
        });
        supplier.get().forEach(s->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, s + " 2" + isSaved);
            linksPut(SOURCE_CLASS, s+" 2", isSaved);
        });
        parStr(isSaved);
    }

    /**<h2>Параллельные стримы</h2>
     * Информация выводится вразнобой. Из-за использования forkjoin.
     * {@link #sortEd(boolean)}
     * @param isSaved to db
     */
    private void parStr(boolean isSaved) {
        ForkJoinPool forkJoinPool = new ForkJoinPool().commonPool();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, forkJoinPool.getParallelism() + " pool" + isSaved);
        linksPut(SOURCE_CLASS, forkJoinPool.getPoolSize()+" pool ", isSaved);
        Stream<String> stringStream = Stream.of("a", "b", "c");
        stringStream.parallel().map(s->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO,s+Thread.currentThread().getName() +" map" + isSaved);
            linksPut(SOURCE_CLASS, s+Thread.currentThread().getName()+" map", isSaved);
            return s;
        }).map(s->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, s + " map2" + isSaved);
            linksPut(SOURCE_CLASS, s+Thread.currentThread().getName()+" map2", isSaved);
            return s;
        }).forEach(s->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, s + " " + isSaved);
            linksPut(SOURCE_CLASS, s, isSaved);
        });
        sortEd(isSaved);
    }

    /**<h2>Операция sorted</h2>
     * Sorted - это statefull операция.
     * Она всегда будет выполняться НЕ смешиваясь с другими операциями.
     * @param isSaved to db
     */
    private void sortEd(boolean isSaved) {
        Stream<String> stringStream = Stream.of("a", "b", "c");
        stringStream.sorted((s1, s2)->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO,s1 +s2+" sorted" + isSaved);
            linksPut(SOURCE_CLASS, s1+s2+" sorted", isSaved);
        return s1.compareTo(s1);
        }).forEach(s->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, s + " map" + isSaved);
            linksPut(SOURCE_CLASS, s+" map", isSaved);
        });
    }
}
