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
        File file = new File(idLesson+"");
        try(FileOutputStream fileOutputStream = new FileOutputStream(file)){
            Set<?> keys = dataToSave.keySet();
            for (Object o:keys){
                Object o1 = dataToSave.get(keys.toString());
                PrintWriter printWriter = new PrintWriter(fileOutputStream);
                String writable;
               try{
                   writable= o.toString()+" key; "+o1.toString()+" value";}catch (NullPointerException e){continue;}
                for(byte b:o.toString().getBytes()){
                    printWriter.append((char) b);
                }
                return true;
            }
        }catch (IOException e){
            messageToUser.errorAlert(SOURCE_CLASS, "ID - 18", e.getMessage());
            return false;
        }
    return false;
    }
}