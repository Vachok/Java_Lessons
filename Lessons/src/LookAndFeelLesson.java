import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class LookAndFeelLesson {
   public static void main(String[] args) {
    JFrame jFrame = getFrame();
    JPanel jPanel = new JPanel();
    jFrame.add(jPanel);
    JButton jButton1 = new JButton("Metal");
    JButton jButton2 = new JButton("Nimbus");
    JButton jButton3 = new JButton("CDE/Motif");
    JButton jButton4 = new JButton("Windows");
    JButton jButton5 = new JButton("Windows Classic");
    jPanel.add(jButton1);
    jPanel.add(jButton2);
    jPanel.add(jButton3);
    jPanel.add(jButton4);
    jPanel.add(jButton5);
    jButton1.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
   
          try{
             UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
          }
          catch(Exception e1){
             e1.printStackTrace();
          }
       }
    });
      jButton2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
         
            try{
               UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            }
            catch(Exception e1){
               e1.printStackTrace();
            }
         }
      });
      jButton3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
         
            try{
               UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            }
            catch(Exception e1){
               e1.printStackTrace();
            }
         }
      });
      jButton4.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
         
            try{
               UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            }
            catch(Exception e1){
               e1.printStackTrace();
            }
         }
      });
      jButton5.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
         
            try{
               UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
            }
            catch(Exception e1){
               e1.printStackTrace();
            }
         }
      });
   }
   static JFrame getFrame(){
      JFrame jFrame = new JFrame(){};
      jFrame.setVisible(true);
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Dimension dimension = toolkit.getScreenSize();
      jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 300 );
      return jFrame;
   } // тот самый фрейм
}
