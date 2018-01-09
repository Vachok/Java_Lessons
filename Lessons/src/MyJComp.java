import javax.swing.*;
import java.awt.*;



public class MyJComp {
    static JFrame getFrame(boolean size, int x, int y, int width, int height) {
        
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        if(!size) {
            x = dimension.width / 2 - 250;
            y = dimension.height / 2 - 250;
            width = 500;
            height = 300;
        }
       jFrame.setBounds(x, y, width, height);
        return jFrame; // тот самый фрейм
    }
    static class MyG2Comp extends JComponent {
        
        @Override
        public void paint(Graphics g) {
            
            Graphics2D g2 = ( Graphics2D ) g;
        }
    }
}
