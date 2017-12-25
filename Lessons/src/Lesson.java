import javax.swing.*;
import java.awt.*;



public class Lesson {
   
   public static void main(String[] args) {
   
      JFrame jFrame = getFrame();
      String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
      for(String s:fonts) {
         System.out.println(s);
      }
//      Font font = new Font("Courier", Font.BOLD, 20);
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
