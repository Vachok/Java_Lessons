import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;



public class Main249 {
   
   public static void main(String[] args) throws IOException, URISyntaxException {
      
      if(Desktop.isDesktopSupported()) {
         Desktop desktop = Desktop.getDesktop();
         for(Desktop.Action action : Desktop.Action.values()){
            System.out.println(action);
         }
         if(desktop.isSupported(Desktop.Action.OPEN)) {
            desktop.open(new File("c:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\results\\idea64_2018-01-17_12-28-28.png"));
         }
         if(desktop.isSupported(Desktop.Action.BROWSE)) {
            desktop.browse(new URI("https://google.com"));
         }
      }
   }
}
// at 17.01.2018 (12:21)