import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;



public class KeyStrokeLesson {
   static JFrame jFrame = MyJFrame.getFrame();
   static JPanel jPanel = new JPanel();
   
   public static void main(String[] args) {
      jFrame.add(jPanel);
      AbstractAction myAction = new MyAction();
      JButton jButton = new JButton(myAction);
      jButton.setText("Vax!");
      jPanel.add(jButton);
      
      KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B");
      InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
      inputMap.put(keyStroke, "changeColor");
      ActionMap actionMap = jPanel.getActionMap();
      actionMap.put("changeColor", myAction);
   }
   static class MyAction extends AbstractAction{
      @Override
      public void actionPerformed(ActionEvent e) {
   
         KeyStrokeLesson.jPanel.setBackground(Color.BLUE);
      }
   }
}
