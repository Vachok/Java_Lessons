import javax.swing.*;
import java.awt.*;



public class MyJFrame {
   
   static JFrame getFrame(){
      JFrame jFrame = new JFrame(){};
      jFrame.setVisible(true);
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Dimension dimension = toolkit.getScreenSize();
      jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 300 );
      return jFrame;
   } // тот самый фрейм
   public static void getFrameWintButton() {
      JFrame jFrame = getFrame();
      JPanel jPanel = new JPanel();
      jFrame.add(jPanel);
      JButton jButton = new JButton();
      jButton.setText("Vax!");
      jPanel.add(jButton);
   }
}
