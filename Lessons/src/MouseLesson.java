import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.jar.JarFile;



public class MouseLesson {
   
   static JFrame jFrame = MyJFrame.getFrame();
   static JPanel jPanel = new JPanel();
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      jPanel.addMouseListener(new MouseAdapter() {
   
   
         @Override
         public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            MouseLesson.jPanel.setBackground(Color.BLUE);
         }
      });
   }
}
