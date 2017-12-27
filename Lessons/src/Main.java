import javax.swing.*;



public class Main extends MyJComp {
   
   static JFrame jFrame = getFrame(false, 0, 0, 0, 0);
   static JPanel jPanel = new JPanel();
   public static void main(String[] args) {
   
      jFrame.add(jPanel);
      jPanel.add(new JCheckBox("check"));
   }
   
}
