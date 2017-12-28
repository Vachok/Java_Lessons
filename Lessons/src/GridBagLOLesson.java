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
      jPanel.add(new TextArea(4, 20), constraints1);
   }
}
