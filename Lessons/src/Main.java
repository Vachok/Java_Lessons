import javax.swing.*;
import java.awt.*;



public class Main {
   static JFrame jFrame = MyJComp.getFrame(false, 0, 0, 0, 0);
   
   public static void main(String[] args) {
      
      jFrame.add(new JButton("1"), BorderLayout.CENTER);
      jFrame.add(new JButton("2"), BorderLayout.NORTH);
      jFrame.add(new JButton("3"), BorderLayout.SOUTH);
      jFrame.add(new JButton("4"), BorderLayout.WEST);
      jFrame.add(new JButton("5"), BorderLayout.EAST);
   
   }
   
}
