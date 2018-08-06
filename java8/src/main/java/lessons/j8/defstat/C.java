package lessons.j8.defstat;

import lessons.j8.helper.SaveToDatabase;
import lessons.j8.helper.SaverProgress;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

interface C {

    default void sayHello(){
        Map<String, String> mapSt = new ConcurrentHashMap<>();
        String SOURCE_CLASS = C.class.getSimpleName();
        SaverProgress saverProgress = new SaveToDatabase();
        Logger.getLogger(SOURCE_CLASS).log(Level.INFO, "c Hello!" + " ");
        mapSt.put("Say", "Hello C");


        saverProgress.isSaved(mapSt, 654.329);
    }
}
