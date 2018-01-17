import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main250 {
   
   public static void main(String[] args) throws AWTException {
      
      if(SystemTray.isSupported()) {
         SystemTray tray = SystemTray.getSystemTray();
         Image image = new ImageIcon("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\icons8-угнетение-15.png", "descr").getImage();
         PopupMenu popupMenu = new PopupMenu();
         popupMenu.add(new MenuItem("Угнетать"));
         popupMenu.add(new MenuItem("Выйти")).addActionListener(new ActionListener() {
      
      
            @Override
            public void actionPerformed(ActionEvent e) {
         
               System.exit(111);
            }
         });
         tray.add(new TrayIcon(image, "Угнетатель", popupMenu));
      }
   }
}
// at 17.01.2018 (12:50)