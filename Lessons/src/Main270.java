import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.prefs.Preferences;



public class Main270 {
   
   public static void main(String[] args) {
      
      
      Preferences user = Preferences.userRoot();
//      user.put("key", "value");
      System.out.println(user.get("key", "default value"));
      
/*Example
      Preferences root = Preferences.systemRoot();
      Preferences myPackage = Preferences.userNodeForPackage(MyJComp.class);
      Preferences node = user.node("myPackage");
      node.put("one", "1");
      System.out.println(node.getInt("one", 2));
      user.exportSubtree(new FileOutputStream("myPref.xml"));
      user.importPreferences(new FileInputStream("myPref.xml"));
*/
   }
}
// at 19.01.2018 (13:36)