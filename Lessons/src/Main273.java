import javax.swing.*;



public class Main273 {
   
   public static void main(String[] args) {
      
      JFrame jFrame = MyJComp.getFrame(false, 0, 0, 0, 0);
      JPanel jPanel = new JPanel();
      jFrame.add(jPanel);
      JButton jButton = new JButton("submit");
      jPanel.add(jButton);
      RepaintManager.currentManager(jFrame.getRootPane()).setDoubleBufferingEnabled(false);
      (( JComponent ) jFrame.getContentPane()).setDebugGraphicsOptions(DebugGraphics.FLASH_OPTION);
   }
}

// https://goo.gl/6aEte1    jButton.setDebugGraphicsOptions(DebugGraphics.LOG_OPTION);

// at 22.01.2018 (12:47)