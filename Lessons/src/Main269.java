import java.io.*;
import java.util.Properties;



public class Main269 {
   
   
   public static void main(String[] args) throws IOException {
      
      Properties defProp = new Properties();
      Properties properties = new Properties(defProp);
      defProp.setProperty("bla", "my def");
/* Запись my.prop
      properties.setProperty("one", "1");
      System.out.println(properties.getProperty("one"));
      FileOutputStream out = new FileOutputStream("my.prop");
      properties.store(out, "my commets");
*/
      FileInputStream in = new FileInputStream("my.prop");
      properties.load(in);
      System.out.println(properties.getProperty("vachok"));
      System.out.println(properties.getProperty("bla"/*~, "my def"*/));
   }
}
// at 19.01.2018 (12:59)