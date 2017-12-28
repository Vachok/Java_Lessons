import javax.swing.*;
import java.awt.*;
import java.util.jar.JarFile;



public class GridBagLOLesson extends MyJComp {
   
   static JFrame jFrame = getFrame(false, 0, 0, 0, 0);
   static JPanel jPanel = new JPanel();
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      GridBagLayout gridBagLayout = new GridBagLayout();
      jPanel.setLayout(gridBagLayout);
      GridBagConstraints constraints1 = new GridBagConstraints();
      constraints1.weightx = 0;
      constraints1.weighty = 0;
      constraints1.gridx = 0;
      constraints1.gridy = 0;
      constraints1.gridheight = 2;
      constraints1.gridwidth = 2;
      jPanel.add(new JTextArea(4, 20), constraints1);
   
      GridBagConstraints constraints2 = new GridBagConstraints();
      constraints2.weightx = 0;
      constraints2.weighty = 0;
      constraints2.gridx = 2;
      constraints2.gridy = 0;
      constraints2.gridheight = 1;
      constraints2.gridwidth = 2;
      jPanel.add(new JButton("Submit. Very long name!"), constraints2);
   
      GridBagConstraints constraints3 = new GridBagConstraints();
      constraints3.weightx = 0;
      constraints3.weighty = 0;
      constraints3.gridx = 2;
      constraints3.gridy = 1; // опустим местоположение элемента
      constraints3.gridheight = 1;
      constraints3.gridwidth = 1;
      jPanel.add(new JButton("Submit"), constraints3);
   
      GridBagConstraints constraints4 = new GridBagConstraints();
      constraints4.weightx = 0;
      constraints4.weighty = 0;
      constraints4.gridx = 3;
      constraints4.gridy = 1; // опустим местоположение элемента
      constraints4.gridheight = 1;
      constraints4.gridwidth = 1;
      jPanel.add(new JButton("Submit"), constraints4);
      jPanel.revalidate();
      
      
   }
}
