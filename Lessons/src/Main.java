import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main {
   
   static JFrame jFrame = MyJFrame.getFrame();
   static JPanel jPanel = new JPanel();
   
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      JButton jButton = new JButton(new MyAction());
      jPanel.add(jButton);
   }
   static class MyAction extends AbstractAction{
      
      @Override
      public void actionPerformed(ActionEvent e) {
   
         Main.jPanel.setBackground(Color.BLUE);
      }
   }
}
