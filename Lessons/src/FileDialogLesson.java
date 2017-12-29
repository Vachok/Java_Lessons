import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;



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
            JTextField textField = new JTextField("Опа! Нихуя", 50);
            fileChooser.add(textField, BorderLayout.SOUTH);
            fileChooser.addPropertyChangeListener(new PropertyChangeListener() {
      
      
               @Override
               public void propertyChange(PropertyChangeEvent evt) {
         
                  textField.setText(evt.getNewValue().toString());
               }
            });
            fileChooser.showDialog(FileDialogLesson.jPanel, "saveme");
         }
      });
      jPanel.revalidate();
   }
}