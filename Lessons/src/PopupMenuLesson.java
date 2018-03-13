import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PopupMenuLesson extends MyJComp {
   
   static JFrame jFrame = getFrame(false, 0, 0, 0, 0);
   static JPanel jPanel = new JPanel();
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      JPopupMenu jPopupMenu = new JPopupMenu();
      jPopupMenu.add(new JMenuItem("Путин"));
      jPopupMenu.add(new JMenuItem("Поедает"));
      jPopupMenu.add(new JMenuItem("Страну"));
      jPanel.setComponentPopupMenu(jPopupMenu);
   }
}
