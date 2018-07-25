package lessons.general;

import lessons.general.alistllistone.ALLists;
import lessons.general.binsearch.BinSearch;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaveToFile;
import lessons.general.helper.SaverProgress;
import lessons.general.methodexception.MethExc;
import lessons.general.stackqdeq.QdeQ;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageSwing;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.props.DBRegProperties;
import ru.vachok.mysqlandprops.props.FileProps;
import ru.vachok.mysqlandprops.props.InitProperties;

import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

public class StartMe implements Lessons {
    private static Lessons lessons = new MethExc();
    private static final String APP_NAME =  "u0466446_lessons-";
    private static final String SOURCE_CLASS = StartMe.class.getSimpleName();
    private static Properties properties = new Properties();
    private Map<String, String> javaID;
    private static InitProperties initProperties = new DBRegProperties(StartMe.class.getPackageName() + "-" + SOURCE_CLASS);
    private double idLesson;
    private MessageToUser messageToUser = new MessageSwing();

    public StartMe(Map<String, String> javaID, double idLesson) {
        this.javaID = javaID;
        this.idLesson = idLesson;
    }

    public static void main(String[] args) {
        lessons.launchMe();

    }
    @Override
    public void launchMe() {
        javaID.put(APP_NAME, SOURCE_CLASS);
        properties.put(APP_NAME, SOURCE_CLASS);
        initProperties.setProps(properties);
        aSave();
    }
    private void aSave(){
        SaverProgress saverProgress = new SaveToDatabase();
        SaverProgress saverToFile = new SaveToFile();
        boolean savedToDB = saverProgress.isSaved(javaID, idLesson);
        boolean savedFile = saverToFile.isSaved(javaID, idLesson);

        messageToUser.info(idLesson+"", "DB="+savedToDB, "file = "+savedFile);

    }
}