import javax.swing.*;
import java.awt.*;



public class MyJFrame {
   
   static JFrame getFrame(boolean size, int x, int y, int width, int height) {
      
      JFrame jFrame = new JFrame(){};
      jFrame.setVisible(true);
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Dimension dimension = toolkit.getScreenSize();
      if(!size) {
         x = dimension.width / 2 - 250;
         y = dimension.height / 2 - 250;
         width = 500;
         height = 300;
      }
      jFrame.setBounds(x, y, width, height);
      return jFrame;
   } // тот самый фрейм
   public static void getFrameWintButton() {
   
      JFrame jFrame = getFrame(false, 0, 0, 0, 0);
      JPanel jPanel = new JPanel();
      jFrame.add(jPanel);
      JButton jButton = new JButton();
      jButton.setText("Vax!");
      jPanel.add(jButton);
   }
}
