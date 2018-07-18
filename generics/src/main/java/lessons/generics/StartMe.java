package lessons.generics;


import lessons.generics.whatis.GenericsLesson;
import lessons.generics.whatis.Lessons;
import lessons.generics.whatis.Main;
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
     * Запуск урока номер 1. ("")
     */
    private static Lessons whatIsGeneric = new Main();

    public static void main(String[] args) {
        whatIsGeneric.launchMe();
    }

    @Override
    public void progressSaver(List<String> links, boolean db) {
        toFile(links);
        if (db) toDB(links);
    }

    private void toFile(List<String>links) {

        try(FileOutputStream fileOutputStream = new FileOutputStream("lesson.now");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)){
            String s = new String((new Date() + "\n" + SOURCE_CLASS + "\n" + (links.toString().replaceAll(", ", "\n"))).getBytes(), "UTF-8");
            for(byte b: s.getBytes()) {
                bufferedOutputStream.write(b);}
        }catch(IOException e){ messageToUser.errorAlert(SOURCE_CLASS, "ID - 38", e.getMessage()); }

    }

    private static void toDB(Collection<String> links){
        String sql = "insert into lessons (sclass, links) values (?,?)";
        String trunk = "truncate lessons";
        try(Connection c = dataConnectTo.getDataSource().getConnection();
            PreparedStatement pT = c.prepareStatement(trunk);
            PreparedStatement p = c.prepareStatement(sql)){
            pT.executeUpdate();
            p.setString(1, SOURCE_CLASS);
            p.setString(2, links.toString().replaceAll(", ", "\n"));
            p.executeUpdate();
        }catch(SQLException e){
            messageToUser.out(SOURCE_CLASS+"_26", (e.getMessage() + "\n\n" + Arrays.toString(e.getStackTrace()).replaceAll(", ", "\n")).getBytes());
            messageToUser.errorAlert(SOURCE_CLASS, e.getMessage(), Arrays.toString(e.getStackTrace()));}
    }
}
