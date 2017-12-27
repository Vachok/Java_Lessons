import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;



public class Main extends MyJComp {
   
   static JFrame jFrame = getFrame(true, 500, 500, 800, 300);
   static JPanel jPanel = new JPanel();
   public static void main(String[] args) {
   
      jFrame.setTitle("by Vachok");
      jFrame.add(jPanel);
      jPanel.add(new JCheckBox("18 марта 2018. TrueStory"));
      JRadioButton jRadioButton1 = new JRadioButton("Путин");
      JRadioButton jRadioButton2 = new JRadioButton("ХУЙ");
      jRadioButton2.setSelected(true);
      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(jRadioButton1);
      buttonGroup.add(jRadioButton2);
      jPanel.add(jRadioButton1);
      jPanel.add(jRadioButton2);
      Border border = BorderFactory.createEtchedBorder();
      Border border1 = BorderFactory.createTitledBorder(border, "у тебя есть выБОР");
      JComboBox<String> comboBox = new JComboBox<>();
      comboBox.addItem("свобода");
      comboBox.addItem("равенство");
      comboBox.addItem("УПЯЧКА");
      jPanel.add(comboBox);
      jPanel.setBorder(border1);
   }
   
}
