import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ColourChooseLesson extends MyJComp {
   
   public static void main(String[] args) {
      
      JFrame jFrame = getFrame(false, 0, 0, 0, 0);
      JPanel jPanel = new JPanel();
      jFrame.add(jPanel);
      JButton jButton = new JButton("Dialog");
      jPanel.add(jButton);
      jButton.addActionListener(new ActionListener() {
         
         
         @Override
         public void actionPerformed(ActionEvent e) {
            
            Color color = JColorChooser.showDialog(jPanel, "TIT", Color.blue);
            jPanel.setBackground(color);
         }
      });
      jPanel.revalidate();
   }
}



//03.01.2018 (14:35) by {Vachok}