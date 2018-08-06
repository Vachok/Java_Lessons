package lessons.j8.streams;

import lessons.j8.Lessons;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 * <h1>Стримы</h1>
 *{@link #goApp(boolean)}
 * @since 06.08.2018 (10:55)
 */
public class Str implements Lessons {
    /**
     * <h2>GitHubID</h2>.<h2>JavaLesson ID</h2>
     */
    private static final Double ID_LESSON = 653.328;

    private static final String SOURCE_CLASS = Str.class.getSimpleName();
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

    /**<h2>До стримов</h2>
     * Есть {@linkplain List}, для того, чтобы по нему пробежать, использовался {@code for}.
     * <b>Boiler Plate Code</b>. {@link #howWorks(boolean, List)}
     * @param isSaved to DB
     */
    private void goApp(boolean isSaved){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        for (String s: list){
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, s + " " + isSaved);
            linksPut(SOURCE_CLASS, s, isSaved);
        }
        howWorks(isSaved, list);
    }

    /**<h2>Как работает for</h2>
     * Через итератор. См. пример.
     * Современно, через Стримы {@link #j8Streams(boolean, List)}
     * @param isSaved to DB
     * @param list test
     */
    private void howWorks(boolean isSaved, List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, iterator.next() + " " + isSaved);
            linksPut(SOURCE_CLASS, iterator.next(), isSaved);
        }
        j8Streams(isSaved, list);
    }

    /**<h2>Работа со STREAM</h2>
     * Получаем из листа стрим.
     * Нюансы {@link #forEachNuance(List, boolean)}
     * @param isSaved to DB
     * @param list test
     */
    private void j8Streams(boolean isSaved, List<String> list) {
        Stream<String> stringStream = list.stream();
        stringStream.forEach(x-> {Logger.getLogger(SOURCE_CLASS).log(Level.INFO, x+" " + isSaved);
        linksPut(SOURCE_CLASS,x, isSaved);});
        /*Упростим*/
        list.stream().forEach(x->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, x + " " + isSaved);
            linksPut(SOURCE_CLASS, x, isSaved);
        });
        filtr(isSaved, list);
    }

    /**<h2>Фильтр</h2>
     * Оператор фильтр - это ленивый оператор. Он инициализируется в момент обращения к нему.
     * Оператор count - это eager оператор. Он инициирует запрос.
     * {@link #methCollect(boolean, List)}
     * @param isSaved to DB
     * @param list test
     */
    private void filtr(boolean isSaved, List<String> list) {
        list.stream().filter(x->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, "hello" + " " + isSaved);
            linksPut(SOURCE_CLASS, "hello", isSaved);
        return x.equals("one");}).count();
        methCollect(isSaved, list);
    }

    /**<h2>Collect</h2>
     * Метод Collect. Можно превратить Стрим в коллекцию. Например {@link Set}
     * {@link #methMap(boolean, List)}
     * @param isSaved to DB
     * @param list test
     */
    private void methCollect(boolean isSaved, List<String> list) {
        Set<String> one = list.stream().filter(x -> x.equals("one")).collect(Collectors.toSet());
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, one.toString() + " " + isSaved);
        linksPut(SOURCE_CLASS, one.toString(), isSaved);
        methMap(isSaved, list);
    }

    /**<h2>Метод MAP</h2>
     * Map - превращает одни объекты в другие.
     * Например можно все объекты превратить в UPPERCASE. Можно отпарсить {@link Integer#parseInt(String)}, и тп.
     * Зависит от фантазии.
     * {@link #methFlatMap(boolean, List)}
     * @param isSaved to DB
     * @param list test
     */
    private void methMap(boolean isSaved, List<String> list) {
        Stream<String> stringStream = list.stream().map(x -> x.toUpperCase());
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, stringStream + " " + isSaved);
        linksPut(SOURCE_CLASS, stringStream+"", isSaved);
        methFlatMap(isSaved, list);
    }

    /**<h2>Метод FlatMap</h2>
     * {@code asList} превращает листы в последовательности.
     * Есть массив из массивов. Для его сведения к одному массиву, используется {@code flatmap}.
     * {@link #methMinMax(boolean)}
     * @param isSaved to DB
     * @param list test
     */
    private void methFlatMap(boolean isSaved, List<String> list) {
        Stream<String> stringStream = Stream.of(asList("one", "two"), asList("three", "four")).flatMap(x -> x.stream());
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, stringStream.toString() + " " + isSaved);
        linksPut(SOURCE_CLASS, stringStream.toString(), isSaved);
        methMinMax(isSaved);
    }

    /**<h2>Сравнение</h2>
     * Сравнить 2 значения. необязательно {@linkplain Integer}.
     * Возвращает объект типа {@code optional}.
     * min и max возвращают минимальное и максимальное значение, но требуют передачи {@link Comparator}.
     * {@link #methReduce(boolean)}
     * @param isSaved to DB
     */
    private void methMinMax(boolean isSaved) {
        int val1 = Stream.of(1,2).min(Comparator.comparing(x->x)).get();
        int val2 = Stream.of(1,2).max(Comparator.comparing(x->x)).get();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, val1 + " " + val2 + " " + isSaved);
        linksPut(SOURCE_CLASS, val1 + " " + val2, isSaved);
        methReduce(isSaved);
    }

    /**<h2>Метод Reduce</h2>
     * Есть массив чисел. Мы хотим пробежать и собрать сумму.
     * <code>
     *     Integer acc = 0;
     *         for (Integer integer : Arrays.asList(1, 2, 3, 4, 5)) {
     *             acc = acc + integer;
     *         }
     *         int count = acc;
     *</code>
     *
     * @param isSaved to DB
     */
    private void methReduce(boolean isSaved) {
        int count = Stream.of(1,2,3,4,5).reduce(0,(acc,element)->acc+element);
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, count + " " + isSaved);
        linksPut(SOURCE_CLASS, count+"", isSaved);
        methOthers(isSaved);
    }

    /**<h2>Разные методы</h2>
     <p>
     * - sorted сортирует.
     <p>
     * - limit берёт лимит значений. Одно в данном случае.
     <p>
     * - distinct берёт уникальные значения.
     <p>
     * - skip пропускает столько-то значений.
     <p>
     * - filter может принимать разные методы.
     * напр. findAny, findAll, isPresent и тп. Возвращает optional.
     <p>
     * - mapToInt разоборачивает {@linkplain Integer} в примитив. Плюс у него есть полезные методы,
     * типа отдать среднее и тп.
     <p>
     * - count {@link #filtr(boolean, List)}
     <p>
     * - peek проходит через набор элементов, и преобразовывает во что-то, как и map. При этом проводит
     * какие-нибудь заданные операции над объектами.
     * @param isSaved to DB
     */
    private void methOthers(boolean isSaved) {
        List<String> collect = Stream.of("one", "two").sorted().collect(Collectors.toList());
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, collect + " collect sort" + isSaved);
        linksPut(SOURCE_CLASS, collect+" collect sort", isSaved);

        List<String> collect1 = Stream.of("one", "two").limit(1).collect(Collectors.toList());
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO,collect1 +" limit" + isSaved);
        linksPut(SOURCE_CLASS, collect1+" limit", isSaved);

        List<String> collect2 = Stream.of("one", "two").distinct().collect(Collectors.toList());
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, collect2 + " distinct" + isSaved);
        linksPut(SOURCE_CLASS, collect2+" distinct", isSaved);

        List<String> collect3 = Stream.of("one", "two").skip(1).collect(Collectors.toList());
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, collect3 + " skip" + isSaved);
        linksPut(SOURCE_CLASS, collect3+" skip", isSaved);

        String s1 = Stream.of("one", "two").filter(x -> x.equals("one")).findAny().get();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, s1 + " " + isSaved);
        linksPut(SOURCE_CLASS, s1, isSaved);

        boolean present = Stream.of("one", "two").filter(x -> x.equals("one")).findAny().isPresent();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO,present +" present" + isSaved);
        linksPut(SOURCE_CLASS, present+" present", isSaved);

        int sum = Stream.of(1, 2).mapToInt(x -> x).sum();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO,sum +" sum" + isSaved);
        linksPut(SOURCE_CLASS, sum+" sum", isSaved);

        long count = Stream.of(1, 2).count();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, count + " count" + isSaved);
        linksPut(SOURCE_CLASS, count+" count", isSaved);

        String s = Stream.of("one", "two").peek(x -> x.toUpperCase()).findFirst().get();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, s + " " + isSaved);
        linksPut(SOURCE_CLASS, s, isSaved);

        IntStream intStream = Stream.of(1,2).mapToInt(x->x);
        double average = intStream.summaryStatistics().getAverage();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, average + " average" + isSaved);
        linksPut(SOURCE_CLASS, average+" average", isSaved);
    }

    /**<h2>Нюанс в стримах</h2>
     * Стримы используются только один раз. Всякий раз нужно получить новый стрим.
     * @deprecated
     * @param list test
     * @param isSaved to DB
     */
    @Deprecated
    private void forEachNuance(List list, boolean isSaved){
        Stream<String> stringStream = list.stream();
        stringStream.forEach(x-> {Logger.getLogger(SOURCE_CLASS).log(Level.INFO, x+" " + isSaved);
            linksPut(SOURCE_CLASS,x, isSaved);});
        stringStream.forEach(x->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, x + " " + isSaved);
            linksPut(SOURCE_CLASS, x, isSaved);
        });
    }
}
