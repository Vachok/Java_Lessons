import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingUtilities.paintComponent;


// fixme способ номер 1
/*      SplashScreen splashScreen = SplashScreen.getSplashScreen();
      Rectangle bounds = splashScreen.getBounds();
      Graphics2D g2 = splashScreen.createGraphics();
      g2.setColor(Color.blue);
      for(int i = 0;i <100 ;i++){
         g2.fillRect(0,0, bounds.width * i / 100, 20);
         splashScreen.update();
         Thread.sleep(100);
      }*/


public class Main248 {
   
   public static void main(String[] args) {
      //todo более верное решение
      SplashScreen splashScreen = SplashScreen.getSplashScreen();
      Rectangle bounds = splashScreen.getBounds();
      Graphics2D graphics2D = splashScreen.createGraphics();
      graphics2D.setColor(Color.BLUE);
      final Image img = new ImageIcon(splashScreen.getImageURL()).getImage();
      final JFrame splashFrame = new JFrame();
      splashFrame.setTitle("Собака, собака, собака МОЯ! :)");
      splashFrame.setAlwaysOnTop(true);
      final JPanel splashPanel = new JPanel() {
         
         
         public void paintComponent(Graphics g) {
            
            g.drawImage(img, 0, 0, null);
         }
      };
      final JProgressBar progressBar = new JProgressBar();
      progressBar.setStringPainted(true);
      splashPanel.setLayout(new BorderLayout());
      splashPanel.add(progressBar, BorderLayout.NORTH);
      splashFrame.add(splashPanel);
      splashFrame.setBounds(splashScreen.getBounds());
      splashFrame.setVisible(true);
      try{
         for(int i = 0;i < 100;i++){
            progressBar.setString("Роем НОРКУ " + i + "%");
            progressBar.setValue(i);
            splashPanel.repaint();
            Thread.sleep(75);
         }
      }
      catch(InterruptedException e){
      }
      splashFrame.setVisible(false);
   }
}


// at 16.01.2018 (9:29)