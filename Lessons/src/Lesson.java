import javafx.geometry.Point2D;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;



public class Lesson {
   
   public static void main(String[] args) {
   
      JFrame jFrame = getFrame();
      jFrame.add(new MyComponet());
   }
   static class MyComponet extends JComponent{
   
      @Override
      protected void paintComponent(Graphics g) {
         Font font = new Font("Courier", Font.BOLD, 20);
         Graphics2D g2 = (Graphics2D)g;
         g2.setFont(font);
         g2.drawString("hello world! i'm KUDR and i'm SWINGer! ))", 20, 90);
         java.awt.geom.Point2D p1 = new java.awt.geom.Point2D.Double(70, 70);
         java.awt.geom.Point2D p2 = new java.awt.geom.Point2D.Double(170, 170);
         Line2D l2 = new Line2D.Double(p1, p2);
         g2.draw(l2);
         Ellipse2D el = new Ellipse2D.Double(70, 70,170,170);
         g2.setPaint(Color.BLUE);
         g2.draw(el);
         Rectangle2D r2 = new Rectangle2D.Double(70, 70, 170, 170);
         g2.draw(r2);
      }
   }
   static JFrame getFrame(){
      JFrame jFrame = new JFrame(){};
      jFrame.setVisible(true);
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Dimension dimension = toolkit.getScreenSize();
      jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 300 );
      return jFrame;
   }
}
