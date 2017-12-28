import javax.swing.*;



public class FocusLes extends MyJComp {
   
   static JFrame jFrame = getFrame(false, 0, 0, 0, 0);
   static JPanel jPanel = new JPanel();
   
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      jPanel.add(new JButton("1"));
      jPanel.add(new JButton("2")).setFocusable(false);
      jPanel.add(new JButton("3")).requestFocusInWindow();
   }
}
