package general.internlocal.resources;



import javax.management.ObjectName;
import java.awt.*;
import java.util.ListResourceBundle;



public class resource_ru extends ListResourceBundle {
   
   private static final Object[][] contents = {{"somevalue", "Этот текст"}, {"backgroundColor", Color.black}, {"defaultPaperSize", new double[]{210, 297}}};
   public Object[][] getContents() {
      
      return resource_ru.contents;
   }
}
