import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;



public class Main234 {
   
   public static void main(String[] args) {
      
      JFrame jFrame = MyJComp.getFrame(false, 0, 0, 0, 0);
      jFrame.add(new MyG2Comp());
   }
   static class MyG2Comp extends JComponent {
      
      @Override
      public void paint(Graphics g) {
         
         Graphics2D g2 = ( Graphics2D ) g;
         g2.setPaint(new GradientPaint(new Point(0, 0), Color.RED, new Point(200, 100), Color.YELLOW));
         try{
            g2.setPaint(new TexturePaint(ImageIO.read(new File("pexels-photo-220634.jpeg")), new Rectangle2D.Double(0, 0, 200, 100)));
         }
         catch(IOException e){
            e.printStackTrace();
         }
         Ellipse2D ellipse2D = new Ellipse2D.Double(0, 0, 200, 100);
         g2.fill(ellipse2D);
      }
   }
}
// at 09.01.2018 (10:25)