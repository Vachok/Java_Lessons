import javax.swing.*;
import java.awt.*;



public class Main121 extends MyJComp {
   
   public static void main(String[] args) {
      
      JFrame jFrame = getFrame(false, 0, 0, 0, 0);
      jFrame.add(new MyComponent());
   }
   private static class MyComponent extends JComponent {
      
      @Override
      public void paint(Graphics g) {
         
         g.drawLine(0, 0, 100, 100);
      }
   }
}



//03.01.2018 (14:47) by {Vachok}