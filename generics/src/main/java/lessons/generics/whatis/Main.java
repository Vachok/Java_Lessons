package lessons.generics.whatis;


import lessons.generics.StartMe;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**<b>Generic 1. Что это.</b>
 * Дженерик тип это указатель типа, из которого состоят коллецкии.
 * Удобно использовать для сохранения информации.
 * {@link #start()}
 * @since 17.07.2018 (17:00)
 */
public class Main implements Lessons {
    /**
     * This Class Simple Name
     */
    private static final String SOURCE_CLASS = Main.class.getSimpleName();

    private static GenericsLesson saver = new StartMe();

    private static List<String> links = new ArrayList<>();

    private static MessageToUser messageToUser = new MessageCons();

    /**
     * Служебный метод.
     * @see GenericsLesson
     */
    @Override
    public void launchMe() {
        links.add(new Date()+" Generic 1");
        links.add("https://youtu.be/2Sbg8tJAQ2I?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX&t=511");
        saver.progressSaver(links, true);
        start();
    }

    /**
     * {@link Cell} - так выглядит Generic.
     * До JAVA 5 было так: {@link #beforeFiveJavaWas()}
     * Продолжение {@link #startTwo()}
     */
    private static void start() {
        Cell<String> stringCell = new Cell<>();
        stringCell.setT("Hello");
        String s = stringCell.getT();
        messageToUser.info(SOURCE_CLASS, "Now Actual", s);
        beforeFiveJavaWas();
        startTwo();
    }

    /**{@link #start()}
      Если класс содержит generic-объект, этот объект не обязательно указывать.
      Без указаний типа - класс может хранить <b>любой</b> объект!
     <p>
     Сам по-себе пустой generic бесполезный. Чаще всего их используют в коллекциях
     */
    private static void startTwo(){
        Cell<String> stringCell = new Cell<>();
        Cell cell = new Cell();
        cell.setT(new Cell<>());
    }

    /**
     * {@link #start()}
     * JAVA сама приводит типы, но байткод будет одинаков. Для совместимости.
     * @see CellMimicry
     */
    private static void beforeFiveJavaWas() {
        CellMimicry cellMimicry = new CellMimicry();
        cellMimicry.setObject("hello");
        String s = ( String ) cellMimicry.getObject();
        messageToUser.info(SOURCE_CLASS, "Before java 5", s);
    }

    /**
     * Раньше, до появления Generic-types, в массив можно было вложить любой тип данных, что выдывало ошибку.
     * @deprecated
     */
    @Deprecated
    private void oldWOutGenerics(){
        List list = new ArrayList();
        list.add("1");
        list.add(1);
    }
}

