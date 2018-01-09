import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;



public class Main235 {
   
   public static void main(String[] args) {
      
      JFrame jFrame = MyJComp.getFrame(false, 0, 0, 0, 0);
      jFrame.add(new MyG2Comp());
   }
   static class MyG2Comp extends JComponent {
      
      @Override
      public void paint(Graphics g) {
         
         Graphics2D g2 = ( Graphics2D ) g;
         Rectangle2D rectangle2D = new Rectangle2D.Double(0, 0, 100, 100);
   
         g2.translate(50, 50);
         
         g2.draw(rectangle2D);
      }
   }
   
}
// at 09.01.2018 (10:44)