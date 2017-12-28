import javax.swing.*;
import java.awt.*;



public class Main {
   static JFrame jFrame = MyJComp.getFrame(false, 0, 0, 0, 0);
   
   public static void main(String[] args) {
   
      JPanel jPanel = new JPanel();
      jFrame.add(jPanel);
      jPanel.setLayout(new GridLayout(2, 2));
      jPanel.add(new JButton("1"));
      jPanel.add(new JButton("2"));
      jPanel.add(new JButton("3"));
      jPanel.add(new JButton("4"));
   }
   
}
