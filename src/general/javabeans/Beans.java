package general.javabeans;



import javax.swing.*;
import java.awt.*;



public class Beans {
   
   public static void main(String[] args) {
      
      JFrame jFrame = getMyFrame();
      // https://youtu.be/hejYNQiy1Xg?t=135
      
   }
   
   /*
   Java Bean - это переиспользуемый объект. Например кнопка, JButton - это бин.
   Бины можно брать готовые.
   Бинами могут быть заранее нарисованные компоненты.
   https://youtu.be/hejYNQiy1Xg
   * */
   static JFrame getMyFrame() {
      
      JFrame jFrame = new JFrame();
      jFrame.setVisible(true);
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Dimension dimension = toolkit.getScreenSize();
      int x = dimension.width / 2 - 250;
      int y = dimension.height / 2 - 250;
      int width = 500;
      int height = 300;
      jFrame.setBounds(x, y, width, height);
      return jFrame;
   }
}
