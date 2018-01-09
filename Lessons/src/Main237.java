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
   
         Rectangle2D rectangle2D2 = new Rectangle2D.Double(150, 50, 100, 100);
         Color color2 = new Color(0f, 0f, 0f, 0.5f);
         g2.setColor(color2);
         g2.fill(rectangle2D2);
   
         Rectangle2D rectangle2D3 = new Rectangle2D.Double(250, 50, 100, 100);
         Color color3 = new Color(0f, 0f, 0f, 0.1f);
         g2.setColor(color3);
         g2.fill(rectangle2D3);
      }
   }
   
}
// at 09.01.2018 (11:46)