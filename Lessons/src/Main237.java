import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;



public class Main237 {
   
   public static void main(String[] args) {
      
      JFrame jFrame = MyJComp.getFrame(false, 0, 0, 0, 0);
      jFrame.add(new MyG2Comp());
   }
   static class MyG2Comp extends JComponent {
      
      @Override
      public void paint(Graphics g) {
         
         Graphics2D g2 = ( Graphics2D ) g;
         Rectangle2D rectangle2D = new Rectangle2D.Double(50, 50, 100, 100);
         Color color = new Color(0f, 0f, 0f);
         g2.setColor(color);
         g2.fill(rectangle2D);
      }
   }
   
}
// at 09.01.2018 (11:46)