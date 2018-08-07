package lessons.j8.parallelll;

import lessons.j8.Lessons;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * <h1>Параллелизм</h1>
 * {@link #goApp(boolean)}
 *
 * При параллелизме нужно тщательно выбирать методы. Учитывать lazyness.
 * Особенно опасны при параллельном программировании такие методы как:
 * {@code map, sort, filter, flatmap, distinct, limit}. Это stateless.
 * При распараллеливании, они могут иметь побочные эффекты.
 * Пример {@link #forrrEach}
 <p>
 * Вывод:
 <p>
 - при большом объеме данных используем параллель. Естественно учитывая задачу.
 <p>
 - не стоит много забивать параллелями при большой конкуренции. Напр. при веб-приложениях, где
 каждый запрос обрабатывает свой поток.
 <p>
 - в целом всё зависит от архитектуры приложения. Нужно понимать для чего используется то или иное ср-во,
 и понимать как оно будет работать при параллельном вычислении.
 * @since 07.08.2018 (13:29)
 */
public class Para implements Lessons {
    /**
     * <h2>GitHubID</h2>.<h2>JavaLesson ID</h2>
     */
    private static final Double ID_LESSON = 658.333;

    private static final String SOURCE_CLASS = Para.class.getSimpleName();
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
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/658", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/21p9ZmeeOMw", isSaved);
        forrrEach(true);
    }

    /**
     * <h2>Параллельные стримы</h2>
     * Параллелизм, в отличие от конкуренции, выполняется <b>одновременно на нескольких ядрах</b>.
     * Следовательно увеличивается производительность.
     * Примеры:
     *
     * @param isSaved to db
     */
    private void goApp(boolean isSaved) {
        Stream stream = Stream.of(1, 2).parallel();
        List list = new ArrayList();
        list.parallelStream();
        paraWorks(isSaved);
    }

    /**
     * <h2>Работа стримов в параллели</h2>
     * 11050 VS 5900 в пользу parallel.
     */
    private void paraWorks(boolean isSaved) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 14_000_000; i++) {
            integers.add(i);
            integers.add(14_000_000 - i);
        }
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, new Date() + " " + isSaved);
        linksPut(SOURCE_CLASS, new Date() + "", isSaved);
        long l = System.currentTimeMillis();
        integers.stream().sorted().filter(x -> x % 2 == 0).map(x -> new Double(x)).forEach(x -> x.toString());
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, System.currentTimeMillis() - l + " " + isSaved);
        linksPut(SOURCE_CLASS, TimeUnit.MILLISECONDS.toSeconds(new Date().getTime() - l) + "", isSaved);
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, new Date() + " " + isSaved);
        linksPut(SOURCE_CLASS, new Date() + "", isSaved);
        par2(isSaved, integers);
    }

    /**
     * <h2>Запуск в параллель</h2>
     * На малых объемах данных, параллель лучше не использовать!
     * На создание отдельного потока нужно время.
     * {@link #miniStreams(boolean)}
     *
     * @param isSaved  to db
     * @param integers test
     */
    private void par2(boolean isSaved, List<Integer> integers) {
        long l = System.currentTimeMillis();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, System.currentTimeMillis() + " " + isSaved);
        linksPut(SOURCE_CLASS, System.currentTimeMillis() + "", isSaved);
        integers.stream().filter(x -> x % 2 == 0).map(x -> new Double(x)).forEach(x -> x.toString());
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, System.currentTimeMillis() - l + " msec" + isSaved);
        linksPut(SOURCE_CLASS, System.currentTimeMillis() - l + " msec", isSaved);
        miniStreams(isSaved);
    }

    /**
     * <h2>Параллелизм при малых объемах</h2>
     * Различные коллекции распараллеливаются по-разному.
     * Лучше всего параллелится {@link ArrayList}, хуже всего - {@link LinkedList}
     * {@link }
     *
     * @param isSaved to DB
     */
    private void miniStreams(boolean isSaved) {
        long l = System.currentTimeMillis();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            integers.add(i);
            integers.add(100 - i);
        }
        integers.stream().sorted().count();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, System.currentTimeMillis() - l + " msec " + isSaved);
        linksPut(SOURCE_CLASS, System.currentTimeMillis() - l + " msec ", isSaved);

        long l1 = System.currentTimeMillis();
        List<Integer> integers1 = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            integers.add(i);
            integers.add(100 - i);
        }
        integers.parallelStream().sorted().count();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, System.currentTimeMillis() - l1 + " msec " + isSaved);
        linksPut(SOURCE_CLASS, System.currentTimeMillis() - l1 + " msec ", isSaved);
        linkED(isSaved);
    }

    /**
     * <h2>Linked Parallel</h2>
     * 2587 par VS 325 !
     * Можно заполнять листы параллельно.
     * {@link #zapolnEnie(boolean)}
     *
     * @param isSaved to db
     */
    private void linkED(boolean isSaved) {
        long l = System.currentTimeMillis();
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            integers.add(i);
            integers.add(1_000_000 - i);
        }
        integers.stream().sorted().count();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, System.currentTimeMillis() - l + " msec linked " + isSaved);
        linksPut(SOURCE_CLASS, System.currentTimeMillis() - l + " msec linked ", isSaved);
        long l1 = System.currentTimeMillis();
        List<Integer> integers1 = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            integers.add(i);
            integers.add(1_000_000 - i);
        }
        integers.parallelStream().sorted().count();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, System.currentTimeMillis() - l1 + " msec linked par " + isSaved);
        linksPut(SOURCE_CLASS, System.currentTimeMillis() - l1 + " msec linked par ", isSaved);
        boolean pravoslAvie = true;
        zapolnEnie(pravoslAvie);
    }

    /**
     * <h2>Заполняем массив</h2>
     * В первом случае обычно, во втором параллельно.
     *
     * @param pravoslAvie to db
     */
    private void zapolnEnie(boolean pravoslAvie) {
        int size = 10;
        double[] values = new double[size];
        for (int i = 0; i < values.length; i++) {
            values[i] = i;
        }
        double[] values2 = new double[size];
        Arrays.parallelSetAll(values2, i -> i);
    }

    /**<h2>Вывод в консоль параллельно</h2>
     * При использовании parallel в этом случае, данные будут идти вразброс. Не по-порядку.
     * Необходимо всегда чётко понимать - для чего используется parallel, нужен ли он в данном конкретном случае.
     * Всё очень сильно зависит от того, что нужно получить. Например при сложении чисел, это не очень важно, и
     * можно сложить параллельно.
     *
     * @param isSaved в базу.
     */
    private void forrrEach(boolean isSaved){
        List<Integer> studs = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            studs.add(i);
        }
        studs.parallelStream().forEach(x-> {
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, x + " " + isSaved);
            linksPut(SOURCE_CLASS, x+"", isSaved);
        });
        studs.stream().forEach(x->{
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, x + " " + isSaved);
            linksPut(SOURCE_CLASS, x+"", isSaved);
        });
    }
}

