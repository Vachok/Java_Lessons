import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class DialogClass extends MyJComp {
   
   static JFrame jFrame = getFrame(false, 0, 0, 0, 0);
   static JPanel jPanel = new JPanel();
   
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      JButton jButton = new JButton("Show Dialog");
      jPanel.add(jButton);
      jButton.addActionListener(new ActionListener() {
         
         
         @Override
         public void actionPerformed(ActionEvent e) {
   
            JOptionPane.showOptionDialog(DialogClass.jPanel, "FUCK", "Fucker", 0, 0, null, new Object[]{"one", "two", "three"}, "two");
         }
      });
      jPanel.revalidate();
   }
}
