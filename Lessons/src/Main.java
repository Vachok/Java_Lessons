import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main {
   
   public static void main(String[] args) {
      JFrame jFrame = getFrame(); // возьмём фрейм
      JPanel jPanel = new JPanel(); // создадим панель
      jFrame.add(jPanel); // добавим панель на фрейм
      JButton jButton = new JButton("Submit"); // сделаем кнопку
      jPanel.add(jButton); // выведем кнопку
      jButton.addActionListener(new ActionListener() { // добавим на кнопку анонимный класс Action Listener
         @Override
         public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.BLUE); // покрасим рамку в синий, при нажатии https://i.imgur.com/m9hCdWX.gifv
         } // заоверрайдим ему actionPerformed
      }); // тут описывается действие при нажатии
   } // добавим кнопку-закрашивалку
   
   static JFrame getFrame(){
      JFrame jFrame = new JFrame(){};
      jFrame.setVisible(true);
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Dimension dimension = toolkit.getScreenSize();
      jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 300 );
      return jFrame;
   } // тот самый фрейм
   
}
