import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class FileDialogLesson {
   
   static JFrame jFrame = MyJComp.getFrame(true, 400, 200, 800, 600);
   static JPanel jPanel = new JPanel();
   // 29.12.2017 13:48
   
   
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      JButton jButton = new JButton("Dialog File");
      jPanel.add(jButton);
      jButton.addActionListener(new ActionListener() {
         
         
         @Override
         public void actionPerformed(ActionEvent e) {
            
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showDialog(FileDialogLesson.jPanel, "save as..");
         }
      });
   }
}
