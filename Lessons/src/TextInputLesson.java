import javax.swing.*;



public class TextInputLesson {
   
   static JFrame jFrame = MyJFrame.getFrame();
   static JPanel jPanel = new JPanel();
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      jPanel.add(new JTextField(20));
      jPanel.revalidate();
      
   }
}
