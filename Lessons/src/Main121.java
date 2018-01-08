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
   
         RoundRectangle2D rectangle2D1 = new RoundRectangle2D.Double(200, 0, 100, 50, 20, 20);
         g2.draw(rectangle2D1);
   
         Ellipse2D ellipse2D = new Ellipse2D.Double(300, 0, 100, 50);
         g2.draw(ellipse2D);
   
         QuadCurve2D quadCurve2D = new QuadCurve2D.Double(400, 0, 400, 100, 450, 0);
         g2.draw(quadCurve2D);
   
         CubicCurve2D cubicCurve2D = new CubicCurve2D.Double(450, 50, 475, 250, 525, -50, 550, 50);
         g2.draw(cubicCurve2D);
   
         Arc2D arc2D = new Arc2D.Double(0, 100, 100, 100, 45, 45, Arc2D.PIE);
         g2.draw(arc2D);
   
         GeneralPath generalPath = new GeneralPath();
         generalPath.moveTo(100, 100);
         generalPath.lineTo(200, 100);
         generalPath.quadTo(200, 300, 300, 100);
         generalPath.curveTo(325, 200, 375, 0, 400, 100);
         generalPath.closePath();
         g2.draw(generalPath);
      }
   }
}



//03.01.2018 (14:47) by {Vachok}