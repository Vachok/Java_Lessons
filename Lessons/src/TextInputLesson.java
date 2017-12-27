import javax.swing.*;



public class TextInputLesson {
   
   static JFrame jFrame = MyJFrame.getFrame();
   static JPanel jPanel = new JPanel();
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      jPanel.add(new JLabel("this is label"));
      jPanel.add(new JTextField("default значение", 20));
      JTextField jTextField = new JTextField();
      jTextField.getText();
      jPanel.add(new JPasswordField(20));
      JTextArea jTextArea = new JTextArea(5, 20);
      jPanel.add(jTextArea);
      jPanel.revalidate();
   }
}
