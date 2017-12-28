import javax.swing.*;
import java.util.jar.JarFile;



public class Main {
   
   static JFrame jFrame = MyJComp.getFrame(false, 0, 0, 0, 0);
   public static void main(String[] args) {
      
      JPanel jPanel = new JPanel();
      jFrame.add(jPanel);
      jPanel.add(new JButton("one"));
      jPanel.add(new JButton("two"));
      jPanel.add(new JButton("three"));
   }
   
}
