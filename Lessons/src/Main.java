import javax.swing.*;
import java.awt.*;



public class Main extends MyJComp {
   
   static JFrame jFrame = getFrame(false, 0, 0, 0, 0);
   static JPanel jPanel = new JPanel();
   public static void main(String[] args) {
   
      jFrame.add(jPanel);
      jPanel.add(new JCheckBox("check"));
      JRadioButton jRadioButton1 = new JRadioButton("one");
      JRadioButton jRadioButton2 = new JRadioButton("two");
      jRadioButton2.setSelected(true);
      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(jRadioButton1);
      buttonGroup.add(jRadioButton2);
      jPanel.add(jRadioButton1);
      jPanel.add(jRadioButton2);
      
   }
   
}
