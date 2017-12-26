import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.jar.JarFile;



public class MouseLesson {
   
   static JFrame jFrame = MyJFrame.getFrame();
   
   public static void main(String[] args) {
      JComponent jComponent = new MyComponent();
      jFrame.add(jComponent);
      jFrame.addMouseMotionListener(new MouseAdapter() { // следим за действиями мыши в jFrame
         @Override
         public void mouseMoved(MouseEvent e) { // будем следить за движениями мыши
            super.mouseMoved(e);
            MyComponent.xCoord = e.getX(); // берет Х
            MyComponent.yCoord = e.getY(); // берёт Y
            jComponent.repaint();
         }
      });
   }
   static class MyComponent extends JComponent {
      public static int xCoord;
      public static int yCoord;
      @Override
      protected void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.drawString("Coordinates x: " + MyComponent.xCoord + " y: " + MyComponent.yCoord, 35, 35); // выведем на экран координаты
         
      }
   }
}
