package general.internlocal.resources;



import java.awt.*;
import java.util.ListResourceBundle;



public class resource_de extends ListResourceBundle {
   
   private static final Object[][] contents = {{"somevalue", "GITLER"}, {"backgroundColor", Color.black}, {"defaultPaperSize", new double[]{210, 297}}};
   public Object[][] getContents() {
      
      return resource_de.contents;
   }
}