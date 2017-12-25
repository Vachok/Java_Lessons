import javax.swing.*;
import java.awt.*;



public class Main {
   
   public static void main(String[] args) {
      JFrame jFrame = getFrame();
      JPanel jPanel = new JPanel();
      jFrame.add(jPanel);
      jPanel.add(new JButton("Submit"));
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
