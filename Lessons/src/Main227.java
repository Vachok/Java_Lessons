import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;



public class Main227 {
   
   public static void main(String[] args) {
      
      JFrame jFrame = MyJComp.getFrame(false, 0, 0, 0, 0);
      jFrame.add(new MyComponent());
   }
   static class MyComponent extends JComponent {
      
      @Override
      public void paint(Graphics g) {
         
         Graphics2D g2 = ( Graphics2D ) g;
         
         Area area = new Area(new Rectangle2D.Double(0, 0, 100, 100));
         area.subtract(new Area(new Ellipse2D.Double(50, 50, 150, 150)));
         g2.fill(area);
      }
   }
}
// at 09.01.2018 (9:33)