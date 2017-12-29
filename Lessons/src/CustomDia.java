import javax.swing.*;
import java.awt.*;



public class CustomDia {
   
   static JFrame jFrame = MyJComp.getFrame(false, 0, 0, 0, 0);
   static JPanel jPanel = new JPanel();
   // 29.12.2017 9:40
   
   
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      
   }
   static class MyDia extends JDialog { // Создаём класс-расширение
      
      public MyDia() { // создаём метод
         // параметры
         super(CustomDia.jFrame, "Title", true);
         add(new JTextField(), BorderLayout.NORTH);
         add(new JButton("click"), BorderLayout.SOUTH);
         setBounds(50, 50, 150, 50);
      }
   } // создание конструктора диалогов. Тот самый конструктор
}
