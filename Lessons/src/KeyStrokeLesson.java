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
      
      KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B"); // создание сочетания клавиш для экшена
      InputMap inputMap = jPanel.getInputMap(JComponent.) // todo
   }
   static class MyAction extends AbstractAction{
      @Override
      public void actionPerformed(ActionEvent e) {
   
         KeyStrokeLesson.jPanel.setBackground(Color.BLUE);
      }
   }
}
