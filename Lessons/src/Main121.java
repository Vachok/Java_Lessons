import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;



public class Main121 extends MyJComp {
   
   public static void main(String[] args) {
      
      JFrame jFrame = getFrame(false, 0, 0, 0, 0);
      jFrame.add(new MyComponent());
   }
   private static class MyComponent extends JComponent {
      
      @Override
      public void paint(Graphics g) {
   
         Graphics2D g2 = ( Graphics2D ) g;
         Point2D point = new Point2D.Double(50, 0);
         Point2D point2 = new Point2D.Double(100, 50);
         Line2D line = new Line2D.Double(0, 0, 100, 100);
         g2.draw(line);
      }
   }
}



//03.01.2018 (14:47) by {Vachok}