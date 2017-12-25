import javax.swing.*;
import java.awt.*;



public class Lesson {
   
   public static void main(String[] args) {
   
      JFrame jFrame = getFrame();
      jFrame.add(new MyComponet());
   }
   static class MyComponet extends JComponent{
   
      @Override
      protected void paintComponent(Graphics g) {
         Font font = new Font("Arial", Font.BOLD, 20);
         Graphics2D g2 = (Graphics2D)g;
         g2.setFont(font);
         g2.drawString("hello world! i'm KUDR and i'm SWINGer! ))", 20, 20);
         
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
   }
}
