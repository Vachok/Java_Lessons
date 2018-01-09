import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;



public class Main228 extends MyJComp {
   
   public static void main(String[] args) {
      
      JFrame jFrame = getFrame(false, 0, 0, 0, 0);
      jFrame.add(new MyG2Comp());
   }
   static class MyG2Comp extends JComponent {
      
      @Override
      public void paint(Graphics g) {
         
         Graphics2D g2 = ( Graphics2D ) g;
         Line2D line2D = new Line2D.Double(0, 0, 100, 200);
         g2.draw(line2D);
      }
   }
   
}
// at 09.01.2018 (10:06)