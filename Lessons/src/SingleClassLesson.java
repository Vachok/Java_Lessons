import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;



public class SingleClassLesson {
   
   public static void main(String[] args) {
      JFrame jFrame = getFrame();
      JPanel jPanel = new JPanel();
      jFrame.add(jPanel);
      JButton jButton = new JButton("Submit");
      jPanel.add(jButton);
      jButton.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "source.text")); //
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
