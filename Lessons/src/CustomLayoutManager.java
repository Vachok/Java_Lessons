import javax.swing.*;



public class CustomLayoutManager extends MyJComp {
   
   static JFrame jFrame = getFrame(false, 0, 0, 0, 0);
   static JPanel jPanel = new JPanel();
   
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      jPanel.setLayout(null);
      
      JButton jButton = new JButton("Submit");
      jButton.setBounds(150, 50, 150, 40);
      jPanel.add(jButton);
   }
}
