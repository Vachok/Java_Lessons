package lessons.general;

import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaveToFile;
import lessons.general.helper.SaverProgress;
import lessons.general.lists.ListsLesson;
import ru.vachok.messenger.MessageSwing;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.props.DBRegProperties;
import ru.vachok.mysqlandprops.props.InitProperties;

import java.util.Map;
import java.util.Properties;

public class StartMe implements Lessons {
    private static Lessons lessons = new ListsLesson();
    private static final String APP_NAME =  "u0466446_lessons-";
    private static final String SOURCE_CLASS = StartMe.class.getSimpleName();
    private static Properties properties = new Properties();
    private Map<String, String> javaID;
    private static InitProperties initProperties = new DBRegProperties(StartMe.class.getPackageName() +
        "-" + SOURCE_CLASS);
    private String idLesson;
    private MessageToUser messageToUser = new MessageSwing();

    public StartMe(Map<String, String> javaID, String idLesson) {
        this.javaID = javaID;
        this.idLesson = idLesson;
    }
    public static void main(String[] args) {
        lessons.launchMe();
        ConstantsFor constantsFor = new ConstantsFor();
        System.out.println("constantsFor = " + constantsFor);
    }
    @Override
    public void launchMe() {
        javaID.put(APP_NAME, SOURCE_CLASS);
        properties.put(APP_NAME, SOURCE_CLASS);
        initProperties.setProps(properties);
    }
    @Override
    public void linksPut(String lessonName, String links, boolean saveToDB) {
        SaverProgress saverToFile = new SaveToFile();
        boolean savedFile = saverToFile.isSaved(javaID, idLesson);
        messageToUser.info(idLesson + "", "DB=" + false, "file = " + savedFile);
    }

    private void aSave(){
        SaverProgress saverProgress = new SaveToDatabase();
        SaverProgress saverToFile = new SaveToFile();
        boolean savedToDB = saverProgress.isSaved(javaID, idLesson);
        boolean savedFile = saverToFile.isSaved(javaID, idLesson);
        messageToUser.info(idLesson+"", "DB="+savedToDB, "file = "+savedFile);
    }
}