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
            jFrame.setBounds(x, y, width, height);
            
        }
        return jFrame; // тот самый фрейм
    }
    static class MyGetLayout implements LayoutManager {
        
        @Override
        public void addLayoutComponent(String name, Component comp) {
        
        }
        @Override
        public void removeLayoutComponent(Component comp) {
        
        }
        @Override
        public Dimension preferredLayoutSize(Container parent) {
            
            return null;
        }
        @Override
        public Dimension minimumLayoutSize(Container parent) {
            
            return null;
        }
        @Override
        public void layoutContainer(Container parent) {
            
            for(int i = 0;i < parent.getComponentCount();i++){
                Component component = parent.getComponent(i);
                component.setBounds(i * 100, i * 40, 100, 40); //каждый компонент, будет одинаковым, но смещённым на 100 вправо и 40 вниз
            }
        }
    }
}
