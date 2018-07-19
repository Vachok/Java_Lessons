package lessons.generics;


import lessons.generics.bnds.Launcher4;
import lessons.generics.extend.Launcher2;
import lessons.generics.gen6.Launcher6;
import lessons.generics.genmethods.Laun3;
import lessons.generics.whatis.Launcher1;
import lessons.generics.wildcards.Launcher5;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.DataConnectTo;
import ru.vachok.mysqlandprops.RegRuMysql;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;


/**
 * Класс, для сохранения прогресса занятий.
 */
public class StartMe implements GenericsLesson {

    /**
     * This Class Simple Name
     */
    private static final String SOURCE_CLASS = StartMe.class.getCanonicalName();
    private static MessageToUser messageToUser = new MessageCons();
    private static DataConnectTo dataConnectTo = new RegRuMysql();

    /**
     * Запуск урока номер 1. ("http://lesson.vachok.ru/generic/lessons/generics/whatis/package-summary.html")
     */
    private static Lessons whatIsGeneric = new Launcher1();

    /**<a href="https://www.youtube.com/watch?v=IsKnSd7SmHw&feature=youtu.be&list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX" target=_blank>Урок Java 311: Generic 2: Наследование Generics</a>
     <p>
     * <a href="https://github.com/Vachok/Java_Lessons/issues/618" target=_blank>GITHub</a>
     <p>
     <a href="http://lesson.vachok.ru/generic/overview-summary.html" target=_blank>Lesson DOCS</a>
     */
    private static Lessons extGenericsTwo = new Launcher2();

    /**<a href="https://youtu.be/KkjCnEi3msI?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX" target=_blank>Урок Java 312: Generic 3: Generics методы</a>
     <p>
     * <a href="https://github.com/Vachok/Java_Lessons/issues/619" target=_blank>GITHub</a>
     <p>
     <a href="http://lesson.vachok.ru/generic/lessons/generics/extend/package-summary.html" target=_blank>Lesson DOCS</a>
     */
    private static Lessons genMethThree = new Laun3();
    /**<a href="https://youtu.be/5et8IyafnWE?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX" target=_blank>Урок Java 313: Generic 4: Bounds</a>
     <p>
     * <a href="https://github.com/Vachok/Java_Lessons/issues/619" target=_blank>GITHub</a>
     <p>
     <a href="http://lesson.vachok.ru/generic/lessons/generics/bnds/package-summary.html" target=_blank>Lesson DOCS</a>
     */
    private static Lessons genBoundsFour = new Launcher4();
    /**<a href="https://youtu.be/5et8IyafnWE?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX" target=_blank>Урок Java 313: Generic 4: Bounds</a>
     <p>
     * <a href="https://github.com/Vachok/Java_Lessons/issues/619" target=_blank>GITHub</a>
     <p>
     <a href="http://lesson.vachok.ru/generic/lessons/generics/bnds/package-summary.html" target=_blank>Lesson DOCS</a>
     */
    private static Lessons genWildCardFive = new Launcher5(false);
    private static Lessons gen6 = new Launcher6(true);

    public static void main(String[] args) {
        whatIsGeneric.launchMe();
        extGenericsTwo.launchMe();
        genMethThree.launchMe();
        genBoundsFour.launchMe();
        genWildCardFive.launchMe();
        gen6.launchMe();
    }
    private static void toDB(Collection<String> links, double lessonID){
        String sql = "insert into lessons (sclass, links, lessonid) values (?,?,?)";
        String trunk = "truncate lessons";
        try(Connection c = dataConnectTo.getDataSource().getConnection();
            PreparedStatement pT = c.prepareStatement(trunk);
            PreparedStatement p = c.prepareStatement(sql)){
            pT.executeUpdate();
            p.setString(1, SOURCE_CLASS);
            p.setString(2, new String(links.toString().replaceAll(", ", "\n").getBytes()));
            p.setDouble(3, lessonID);
            p.executeUpdate();
        }catch(SQLException e){
            messageToUser.out(SOURCE_CLASS+"_26", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
            messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));}
    }

    private void toFile(List<String>links) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("lesson.now");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)){
            String s = new String((new Date() + "\n" + SOURCE_CLASS + "\n" + (links.toString().replaceAll(", ", "\n"))).getBytes(), "UTF-8");
            for(byte b: s.getBytes()) {
                bufferedOutputStream.write(b);}
        }catch(IOException e){ messageToUser.errorAlert(SOURCE_CLASS, "ID - 38", e.getMessage()); }

    }

    @Override
    public void progressSaver(List<String> links, boolean db, double lessonID) {
        toFile(links);
        if (db) toDB(links, lessonID);
    }
}
