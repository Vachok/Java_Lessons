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
      jButton.setText("Submit");
      jPanel.add(jButton);
   }
   static class MyAction extends AbstractAction{
   
      MyAction() {
         putValue(AbstractAction.SHORT_DESCRIPTION, "Make me blue");
      }
      @Override
      public void actionPerformed(ActionEvent e) {
   
         Main.jPanel.setBackground(Color.BLUE);
      }
   }
}
