import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CustomDia {
   
   static JFrame jFrame = MyJComp.getFrame(false, 0, 0, 0, 0);
   static JPanel jPanel = new JPanel();
   // 29.12.2017 9:40
   
   
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      JButton jButton = new JButton("Show Dialog");
      jPanel.add(jButton);
      jButton.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
   
            MyDia myDia = new MyDia();
            myDia.setVisible(true);
         }
      });
      
   }
   static class MyDia extends JDialog {
      
      public MyDia() {
         
         super(CustomDia.jFrame, "Title", true);
         add(new JTextField(), BorderLayout.NORTH);
         add(new JButton("click"), BorderLayout.SOUTH);
         setBounds(890, 400, 130, 104);
         getFocusOwner();
      }
   } // Тот самый конструктор
}
