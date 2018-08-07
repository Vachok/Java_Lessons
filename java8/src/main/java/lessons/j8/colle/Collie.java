package lessons.j8.colle;

import lessons.j8.Lessons;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

/**
 * <h1>Collector</h1>
 *{@link #goApp(boolean)}
 * @since 07.08.2018 (10:57)
 */
public class Collie implements Lessons {
    /**
     * <h2>GitHubID</h2>.<h2>JavaLesson ID</h2>
     */
    private static final Double ID_LESSON = 657.332;

    private static final String SOURCE_CLASS = Collie.class.getSimpleName();
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
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/657", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/1rdSQ1PZoi8", isSaved);
        goApp(isSaved);
    }

    /**<h2>Метод Collect</h2>
     * Позволяет превратить {@link Stream} в различные коллекции. {@link Map}, {@link List}, {@link java.util.Set} и т.п.
     * Но на этом метод не ограничивается. Он может принимать на себя методы класса {@link Collectors}.
     * Рассмотрим примеры {@link #colOne(boolean)}
     * @param isSaved to db
     */
    private void goApp(boolean isSaved){
        Stream.of("one", "two").collect(Collectors.toCollection(TreeSet::new));
        Stream.of("one", "two").collect(Collectors.maxBy(Comparator.comparing(x->x)));
        Stream.of(1,2).collect(Collectors.averagingInt(x->x));
        Map<Boolean, List<Integer>> map = Stream.of(1,2,3,4).collect(Collectors.partitioningBy(x->x>2));
        Map<Integer, List<Integer>> map2 = Stream.of(1,2,1,4).collect(Collectors.groupingBy(x->x));
        colOne(isSaved);
    }

    /**<h2>Превращаем в Лист</h2>
     * Какой лист? {@code Collectors.toCollection(ArrayList::new)} - конкретно. {@link ArrayList}.
     <p>
     * Можно выбрать различные варианты. Например Максимальное значение, или среднее значение.
     <p>
     Можно сделать {@link Map}, с ключами true - где число больше 2х и false, где число меньше.
     {@code Map<Boolean, List<Integer>> map = Stream.of(1,2,3,4).collect(Collectors.partitioningBy(x->x>2));}
     <p>
     Группировка. {@code Map<Integer, List<Integer>> map2 = Stream.of(1,2,1,4).collect(Collectors.groupingBy(x->x));}
     Групприуем числа в {@link Map}. Где ключ будет цифра, а ключём все вхождения.
     <p>
     Объединить Стрим. Разделитель , суффикс, префикс.
     <p>
     Посчитать вхождения
     {@code Map<Integer, Long> map3 = Stream.of(1,2,1,4,7).collect(Collectors.groupingBy(x->x, counting()));}
     На выходе будет {@link Map}, где {@link Integer} - это число, а {@link Long} - кол-во вхождений этого числа.
     * @param isSaved to db
     */
    private void colOne(boolean isSaved) {
        Stream.of("one", "two").collect(toList());
        /* */
        Stream.of("one", "two").collect(Collectors.toCollection(ArrayList::new));
        Stream.of("one", "two").collect(Collectors.toCollection(TreeSet::new));
        /* */
        Stream.of("one", "two").collect(Collectors.maxBy(Comparator.comparing(x->x)));
        Stream.of(1,2).collect(Collectors.averagingInt(x->x));
        /* */
        Map<Boolean, List<Integer>> map = Stream.of(1,2,3,4).collect(Collectors.partitioningBy(x->x>2));
        /* */
        Map<Integer, List<Integer>> map2 = Stream.of(1,2,1,4).collect(Collectors.groupingBy(x->x));
        /* */
        String result = Stream.of("one", "two", "three").collect(Collectors.joining(",", "{","}"));
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, result + " " + isSaved);
        linksPut(SOURCE_CLASS, result, isSaved);
        /* */
        Map<Integer, List<Integer>> collects = Stream.of(1,2,1,4).collect(Collectors.groupingBy(x->x, mapping(x->x, toList())));
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, collects.toString() + " " + isSaved);
        linksPut(SOURCE_CLASS, collects.toString(), isSaved);
        /* */
        Map<Integer, Long> map3 = Stream.of(1,2,1,4,7,2,1,1,1,6).collect(Collectors.groupingBy(x->x, counting()));
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, map3.get(1) + " " + isSaved);
        linksPut(SOURCE_CLASS, map3.get(2).toString(), isSaved);
    }
}

