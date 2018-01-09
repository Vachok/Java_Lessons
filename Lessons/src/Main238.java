import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

import static java.awt.RenderingHints.*;



public class Main238 {
   
   public static void main(String[] args) {
      
      JFrame jFrame = MyJComp.getFrame(false, 0, 0, 0, 0);
      jFrame.add(new MyG2Comp());
   }
   static class MyG2Comp extends JComponent {
      
      @Override
      public void paint(Graphics g) {
         
         Graphics2D g2 = ( Graphics2D ) g;
   
         g2.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);
         Ellipse2D ellipse2D = new Ellipse2D.Double(50, 50, 100, 100);
         g2.draw(ellipse2D);
   
         RenderingHints renderingHints = new RenderingHints(null);
         renderingHints.put(KEY_ANTIALIASING, VALUE_ANTIALIAS_OFF);
         g2.setRenderingHints(renderingHints);
         Ellipse2D ellipse2D1 = new Ellipse2D.Double(150, 50, 100, 100);
         g2.draw(ellipse2D1);
      }
   }
   
}
// at 09.01.2018 (12:01)