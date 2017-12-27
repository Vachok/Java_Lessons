import javax.swing.*;
import java.awt.*;



public class MyJComp {
   
   /** Нарисованный заранее JFrame
    *
    * @param size true/false. Если false - размер по-умолчанию
   x = dimension.width / 2 - 250;
   y = dimension.height / 2 - 250;
   width = 500;
   height = 300;
    * @param x начальная точка по-горизонтали
    * @param y начальная точка по-вертикали
    * @param width ширина
    * @param height высота
    * @return JFrame, по заданным (true) или по-дефолтным (false) параметрам
    */
   static JFrame getFrame(boolean size, int x, int y, int width, int height) {
   
      JFrame jFrame = new JFrame() {
      
      
      };
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
   }// тот самый фрейм
}
