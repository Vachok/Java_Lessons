import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SingleClassLesson {
   
   public static void main(String[] args) {
      JFrame jFrame = getFrame();
      JPanel jPanel = new JPanel();
      jFrame.add(jPanel);
      JButton jButton = new JButton("Submit");
      jPanel.add(jButton);
      jButton.addActionListener(new ActionListener() {
   
   
         @Override
         public void actionPerformed(ActionEvent e) {
            jFrame.setTitle(((JButton)e.getSource()).getText()); // берем source ивента из button, отдаём в заголовок
         }
      });
   }
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
