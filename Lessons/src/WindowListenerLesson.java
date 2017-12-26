import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class WindowListenerLesson {
   
   public static void main(String[] args) {
      JFrame jFrame = getFrame();
      jFrame.addWindowListener(new WindowAdapter() {
   
   
         @Override
         public void windowClosing(WindowEvent e) {
            int i = 0;
         }
      });
   }
      
      static JFrame getFrame () {
         JFrame jFrame = new JFrame() {
         
         
         };
         jFrame.setVisible(true);
         jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Toolkit toolkit = Toolkit.getDefaultToolkit();
         Dimension dimension = toolkit.getScreenSize();
         jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 500, 300);
         return jFrame;
      } // тот самый фрейм
   
   }
