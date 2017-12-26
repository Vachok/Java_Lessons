import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.jar.JarFile;



public class MouseLesson {
   
   static JFrame jFrame = MyJFrame.getFrame();
   static JPanel jPanel = new JPanel();
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      jPanel.addMouseListener(new MouseListener() {
         
         
         @Override
         public void mouseClicked(MouseEvent e) { // действие по-клику
         
         }
         @Override
         public void mousePressed(MouseEvent e) { // действие при нажатии
         
         }
         @Override
         public void mouseReleased(MouseEvent e) { // при отпускании
         
         }
         @Override
         public void mouseEntered(MouseEvent e) { // при входе в компонент
         
         }
         @Override
         public void mouseExited(MouseEvent e) { // при выходе из компонента
         
         }
      });
   }
}
