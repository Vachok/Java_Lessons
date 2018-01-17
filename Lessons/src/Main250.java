import javax.swing.*;
import java.awt.*;



public class Main250 {
   
   public static void main(String[] args) throws AWTException {
      
      if(SystemTray.isSupported()) {
         SystemTray tray = SystemTray.getSystemTray();
         Image image = new ImageIcon("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\icons8-угнетение-15.png", "descr").getImage();
         tray.add(new TrayIcon(image));
      }
   }
}
// at 17.01.2018 (12:50)