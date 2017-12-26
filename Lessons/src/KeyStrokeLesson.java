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
      InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT); // создание деёствия "слежения" за клавишами
      inputMap.put(keyStroke, "changeColor"); // добавление в компонент слежки сочетания клавиш. вызовет keyStroke с ИД "changeColor"
      ActionMap actionMap = jPanel.getActionMap();
      actionMap.put("changeColor", myAction);
      /*Есть inputmap, которая достается из панели
       мы говорим ей, что хотим использовать её когда компонент в фокусе
       помещаем в мапу сочетание, которое будет вызывать некий объект с ИД
       Как-бы привязываем стоку "changeColor" к сочетанию ctrl B*/
   }
   static class MyAction extends AbstractAction{
      @Override
      public void actionPerformed(ActionEvent e) {
   
         KeyStrokeLesson.jPanel.setBackground(Color.BLUE);
      }
   }
}
