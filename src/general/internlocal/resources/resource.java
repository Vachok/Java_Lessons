package general.internlocal.resources;



import java.awt.*;
import java.util.ListResourceBundle;



public class resource extends ListResourceBundle {
   
   private static final Object[][] contents = {{"somevalue", "This Text"}, {"backgroundColor", Color.black}, {"defaultPaperSize", new double[]{210, 297}}};
   public Object[][] getContents() {
      
      return resource.contents;
   }
}
