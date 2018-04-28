import javax.swing.*;
import java.util.jar.JarFile;



public class ToolBarMenu extends MyJComp {
   
   static JFrame jFrame = getFrame(false, 0, 0, 0, 0);
   static JPanel jPanel = new JPanel();
   
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      JToolBar jToolBar = new JToolBar("Title");
      JButton one = new JButton("one");
      jToolBar.add(one);
      jToolBar.add(new JButton("two"));
      jToolBar.addSeparator();
      jToolBar.add(new JButton("three"));
      one.setToolTipText("first");
      jPanel.add(jToolBar);
   }
}
