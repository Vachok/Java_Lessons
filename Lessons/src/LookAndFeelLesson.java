import javax.swing.*;
import java.awt.*;



public class LookAndFeelLesson {
   public static void main(String[] args) {
      UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
      for(UIManager.LookAndFeelInfo lookAndFeelInfo : lookAndFeelInfos){
         System.out.println(lookAndFeelInfo.getName());
         System.out.println(lookAndFeelInfo.getClassName());
      }
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
