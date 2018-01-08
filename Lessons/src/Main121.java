import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;



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
         Line2D line = new Line2D.Double(point, point2);
         g2.draw(line);
   
         Rectangle2D rectangle2D = new Rectangle2D.Double(100, 0, 100, 50);
         g2.draw(rectangle2D);
   
         RoundRectangle2D rectangle2D1 = new RoundRectangle2D.Double(200, 0, 100, 50, 120, 120);
         g2.draw(rectangle2D1);
   
         Ellipse2D ellipse2D = new Ellipse2D.Double(300, 0, 100, 50);
         g2.draw(ellipse2D);
      }
   }
}



//03.01.2018 (14:47) by {Vachok}