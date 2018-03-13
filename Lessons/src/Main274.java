import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.FileOutputStream;



public class Main274 {
   
   public static void main(String[] args) {
      
      JFrame jFrame = MyJComp.getFrame(false, 0, 0, 0, 0);
      JPanel jPanel = new JPanel();
      jFrame.add(jPanel);
      JButton jButton = new JButton("submit");
      jPanel.add(jButton);
      jButton.addActionListener(new ActionListener() {
         
         
         @Override
         public void actionPerformed(ActionEvent e) {
            
            jFrame.setTitle(jFrame.getTitle() + "1");
         }
      });
      JButton jButton2 = new JButton("click submit");
      jPanel.add(jButton2);
      jButton2.addActionListener(new ActionListener() {
         
         
         @Override
         public void actionPerformed(ActionEvent e) {
            
            GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice device = environment.getDefaultScreenDevice();
            try{
               Robot robot = new Robot(device);
               /* Робот, нажимающий на Submit
               int x = jFrame.getX();
               int y = jFrame.getY();
               robot.mouseMove(x + 200, y + 50);
               robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
               robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
               // Робот, нажимающий TAB
               robot.keyPress(KeyEvent.VK_TAB);
               robot.keyRelease(KeyEvent.VK_TAB);*/
               
               // Screenshot
               Rectangle rectangle = new Rectangle(0, 0, 1000, 1000);
               BufferedImage image = robot.createScreenCapture(rectangle);
            }
            catch(AWTException e1){
               e1.printStackTrace();
            }
         }
      });
      jPanel.revalidate();
   }
   
}
// at 22.01.2018 (13:18)