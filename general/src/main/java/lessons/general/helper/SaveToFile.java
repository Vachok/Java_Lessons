package lessons.general.helper;

import ru.vachok.messenger.MessageCons;
import ru.vachok.messenger.MessageToUser;

import java.io.*;
import java.util.Map;
import java.util.Set;

/**
 * @since 21.07.2018 (23:43)
 */
public class SaveToFile implements SaverProgress {

    private static final String SOURCE_CLASS = SaveToFile.class.getSimpleName();
    private MessageToUser messageToUser = new MessageCons();

    @Override
    public boolean isSaved(Map<?, ?> dataToSave, String idLesson) {
        File file = new File(idLesson + ".txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             PrintWriter printWriter = new PrintWriter(fileOutputStream, true)) {
            dataToSave.forEach((x,y)->{
                printWriter.println(x.toString()+" ; "+y.toString());
            });
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SaveToFile{");
        sb.append("SOURCE_CLASS='").append(SOURCE_CLASS).append('\'');
        sb.append('}');
        return sb.toString();
    }
}