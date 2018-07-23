package lessons.general;

import lessons.general.alistllistone.ALLists;
import lessons.general.helper.SaveToDatabase;
import lessons.general.helper.SaverProgress;
import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;
import ru.vachok.mysqlandprops.props.FileProps;
import ru.vachok.mysqlandprops.props.InitProperties;

import java.util.Map;
import java.util.Properties;

public class StartMe implements Lessons {
    private static final String APP_NAME = StartMe.class.getPackageName() + "-";
    private static final String SOURCE_CLASS = StartMe.class.getSimpleName();
    private static Properties properties = new Properties();
    private static InitProperties initProperties = new FileProps(SOURCE_CLASS);
    private static MessageToUser messageToUser = new MessageCons();
    private Map<String, String> javaID;
    private double idLesson;

    public StartMe(Map<String, String> javaID, double idLesson) {
        this.javaID = javaID;
        this.idLesson = idLesson;
    }

    public static void main(String[] args) {
        ALLists alLists = new ALLists();
        alLists.launchMe();
    }

    @Override
    public void launchMe() {
        javaID.put(StartMe.class.getPackageName(), SOURCE_CLASS);
        properties.put(StartMe.class.getPackageName(), SOURCE_CLASS);
        SaverProgress saverProgress = new SaveToDatabase();
        saverProgress.saveMap(javaID, idLesson);
        initProperties.setProps(properties);
    }
}