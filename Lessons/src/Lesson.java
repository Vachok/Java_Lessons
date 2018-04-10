import javafx.geometry.Point2D;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;



public class Lesson {
   
   public static void main(String[] args) {
   
      JFrame jFrame = getFrame(); // покажем методом фрейм
      jFrame.add(new MyComponet()); // добавим в него контент
   }
   static class MyComponet extends JComponent{
   
      @Override
      protected void paintComponent(Graphics g) {
   
         Font font = new Font("Courier", Font.BOLD, 20); // выбираем шрифт
         Graphics2D g2 = ( Graphics2D ) g; // указываем способ отрисовки
         g2.setFont(font); // передаём выбранный шрифт
         g2.drawString("hello world! i'm KUDR and i'm SWINGer! ))", 20, 20); // вывод надписи
         java.awt.geom.Point2D p1 = new java.awt.geom.Point2D.Double(70, 70); // создаём точку
         java.awt.geom.Point2D p2 = new java.awt.geom.Point2D.Double(170, 170); // создаём точку
         Line2D l2 = new Line2D.Double(p1, p2); // чем рисуем точку
         g2.draw(l2); // рисуем точку
         Ellipse2D el = new Ellipse2D.Double(); // создаём эллипс
         el.setFrameFromDiagonal(p1, p2);
         g2.setPaint(Color.BLUE); // красим в синий
         g2.draw(el); // рисуем эллипс
         Rectangle2D r2 = new Rectangle2D.Double(); // создаём квадрат
         r2.setFrameFromDiagonal(p1, p2);
         g2.draw(r2);
         try{URL url = new URL("http://i65.tinypic.com/16bcabo.jpg"); // показываем путь до картинки
            Image image = new ImageIcon(url).getImage(); // качаем картинку
            g2.drawImage(image, 192, 50, null ); // покажем картинку
         }
         catch(MalformedURLException e){
            e.printStackTrace();
         }
      }
   } // контент
   static JFrame getFrame(){
      JFrame jFrame = new JFrame(){};
      jFrame.setVisible(true); // делаем видимым
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // делаем возможность его закрыть
      Toolkit toolkit = Toolkit.getDefaultToolkit(); // метод
      Dimension dimension = toolkit.getScreenSize(); // получим им разрешение экрана
      jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 300 ); // сделаем рамку, по-параметрам
      return jFrame; // отдадим рамку
   } // фрейм
}
