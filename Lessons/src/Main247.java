import javax.swing.*;



public class Main247 {
   
   static JFrame jFrame = MyJComp.getFrame(false, 0, 0);
   static JPanel jPanel = new JPanel();
   // 16.01.2018 9:07
   
   
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      JTextField jTextField = new JTextField(10);
      JTextField jTextField2 = new JTextField(10);
      jTextField.setDragEnabled(true);
      jTextField2.setDragEnabled(true);
      jPanel.add(jTextField);
      jPanel.add(jTextField2);
      jFrame.revalidate();
   }
}
// at 16.01.2018 (9:06)