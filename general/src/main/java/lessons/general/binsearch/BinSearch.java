package lessons.general.binsearch;

import lessons.general.Lessons;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;
import static java.util.logging.Level.WARNING;

/**
 * <b>Binary Search</b>
 * <p>
 * Поиск по-коллекциям.
 *
 * @since 25.07.2018 (14:14)
 */
public class BinSearch implements Lessons {
    /**
     * ID урока. GitHub . Youtube
     */
    private static final double idLesson = 631.318;
    /**
     * {@link lessons.general.helper.SaveToDatabase}
     */
    private SaverProgress saverProgress = new SaveToDatabase();
    /**
     * {@link Map}, для отправки в БД/файл.
     */
    private Map<String, String> links = new ConcurrentHashMap<>();

    /**
     * 1. Запуск
     * 1.1 {@link #intSearch()}
     */
    @Override
    public void launchMe() {
        System.out.println("BinSearch.launchMe");
        links.put("BinSearch", "launchMe");
        intSearch();
    }

    /**
     * При использовании {@link Collections#binarySearch(List, Object)}, возвращается не сам элемнт, а его индекс.
     * Перед поиском коллекция должна быть отсортирована! {@link Collections#sort(List)}. Если этим пренебречь,
     * результат будет непредсказуем.
     */
    private void intSearch() {
        String x = "BinSearch.intSearch";
        System.out.println(x);
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(12);
        list.add(8);
        list.add(3000);
        list.add(999);
        list.add(999);
        list.add(5);
        list.add(999);

        Collections.sort(list);
        int index = Collections.binarySearch(list, 5);
        Integer obj = list.get(index);

        linksPut(x,index + " " + obj, false);

    }

    /**
     * @param x ID параметра в БД
     * @param s параметр
     * @param needToSave нужно ли сохранять.
     */
    private void linksPut(String x, String s, boolean needToSave) {
        links.put(x, s);

        System.out.println("index = " + x);
       Logger.getLogger(getClass().getSimpleName()).log(INFO, "result is " + s);

        if(needToSave) Logger.getLogger(getClass().getSimpleName()).log(INFO, "Saved? " + saverProgress.isSaved(links, idLesson));
        else Logger.getLogger(getClass().getSimpleName()).log(WARNING, "NO SAVE!");
    }

}
