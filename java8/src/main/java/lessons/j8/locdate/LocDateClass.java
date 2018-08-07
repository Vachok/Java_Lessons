package lessons.j8.locdate;

import lessons.j8.Lessons;
import lessons.j8.lambada.LaMbaDa;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>Local Date</h1>
 *
 * @since 07.08.2018 (17:13)
 */
public class LocDateClass implements Lessons {
    /**
     * <h2>GitHubID</h2>.<h2>JavaLesson ID</h2>
     */
    private static final Double ID_LESSON = 659.334;

    private static final String SOURCE_CLASS = LocDateClass.class.getSimpleName();
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
        linksPut(getClass().getSimpleName(), "https://github.com/Vachok/Java_Lessons/issues/659", isSaved);
        linksPut(getClass().getSimpleName(), "https://youtu.be/3yJD7PClPjE", isSaved);
        goApp(isSaved);
    }

    /**
     * <h2>Как было раньше</h2>
     * Как раньше выводили дату. Брали класс {@link Date}, создавали {@link Calendar}.
     * Потом через {@link SimpleDateFormat} приводили к нужному виду, и всё это можно было
     * вывести на экран. {@code INFO: 08/08/2018}.
     * <p>
     * Как предлагается делать сейчас. {@link #whatNow(boolean)}.
     *
     * @param isSaved to db
     */
    private void goApp(boolean isSaved) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MONTH, 2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, simpleDateFormat.format(date) + " " + isSaved);
        linksPut(SOURCE_CLASS, simpleDateFormat.format(date), isSaved);

        try {
            Date date1 = simpleDateFormat.parse("14/10/2018");
            Logger.getLogger(SOURCE_CLASS).log(Level.INFO, date1.toString() + " " + isSaved);
            linksPut(SOURCE_CLASS, date1.toString(), isSaved);
        } catch (ParseException e) {
            Logger.getLogger(SOURCE_CLASS).log(Level.WARNING, e.getMessage());
        }
        whatNow(isSaved);
    }

    /**
     * <h2>Класс {@link LocalDate}</h2>
     * В JAVA 1.8, появился повый класс {@link LocalDate}, который предоставляет множество методов.
     * Для форматирования и парсинга используется {@link DateTimeFormatter}.
     * {@code LocalDate localDate3 = LocalDate.parse("14/10/2018", dateTimeFormatter);}
     *
     * @param isSaved to db
     */
    private void whatNow(boolean isSaved) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.minusDays(5);
        LocalDate localDate2 = localDate.plusMonths(5);
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, localDate.toString() + " " + isSaved);
        linksPut(SOURCE_CLASS, localDate.toString(), isSaved);
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, localDate1.toString() + " " + isSaved);
        linksPut(SOURCE_CLASS, localDate1.toString(), isSaved);
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, localDate2.toString() + " " + isSaved);
        linksPut(SOURCE_CLASS, localDate2.toString(), isSaved);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, localDate.format(dateTimeFormatter) + " " + isSaved);
        linksPut(SOURCE_CLASS, localDate.format(dateTimeFormatter), isSaved);
        LocalDate localDate3 = LocalDate.parse("14/10/2018", dateTimeFormatter);
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, localDate3.toString() + " " + isSaved);
        linksPut(SOURCE_CLASS, localDate3.toString(), isSaved);
        String s = null;
        try {
            s = new String(" ".getBytes(), "UNICODE");
        } catch (UnsupportedEncodingException e) {
            Logger.getLogger(SOURCE_CLASS).log(Level.WARNING, e.getMessage());

        }
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO,s +" " + isSaved);
        linksPut(SOURCE_CLASS, s, isSaved);
    }
}
