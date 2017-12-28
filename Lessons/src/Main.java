//00.112-BorderLayout
import javax.swing.*;
import java.awt.*;
=======
//186.102-SW7
//180.98-SW3.ActionListener
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//186.102-SW7
//179.97-SW2.JComponent
public class Main {
   
}
/* 178.96-SW1-HelloWorld


import javax.swing.*;
import java.awt.*



public class Main {
 200.112-BorderLayout
   static JFrame jFrame = MyJComp.getFrame(false, 0, 0, 0, 0);
   
   public static void main(String[] args) {
   
      JPanel jPanel = new JPanel();
      jFrame.add(jPanel);
      jPanel.setLayout(new GridLayout(2, 2));
      jPanel.add(new JButton("1"));
      jPanel.add(new JButton("2"));
      jPanel.add(new JButton("3"));
      jPanel.add(new JButton("4"));
   }
   
}
=======
   
//186.102-SW7
   static JFrame jFrame = MyJFrame.getFrame();
   static JPanel jPanel = new JPanel();
   
   public static void main(String[] args) {
      
      jFrame.add(jPanel);
      JButton jButton = new JButton(new MyAction());
      jButton.set
      jPanel.add(jButton);
   }
   static class MyAction extends AbstractAction{
   
      MyAction() {
         putValue(AbstractAction.SHORT_DESCRIPTION, "My small action");
      }
      @Override
      public void actionPerformed(ActionEvent e) {
   
         Main.jPanel.setBackground(Color.BLUE);
      }
   }
}
=======
   public static void main(String[] args) {
//180.98-SW3.ActionListener
      JFrame jFrame = getFrame(); // возьмём фрейм
      JPanel jPanel = new JPanel(); // создадим панель
      jFrame.add(jPanel); // добавим панель на фрейм
      JButton jButton = new JButton("Submit"); // сделаем кнопку
      jPanel.add(jButton); // выведем кнопку
      jButton.addActionListener(new ActionListener() { // добавим на кнопку анонимный класс Action Listener
         @Override
         public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.BLUE); // покрасим рамку в синий, при нажатии https://i.imgur.com/m9hCdWX.gifv
         } // заоверрайдим ему actionPerformed
      }); // тут описывается действие при нажатии
   } // добавим кнопку-закрашивалку
   
   static JFrame getFrame(){
=======
   
      JFrame jFrame = new JFrame(){};
      jFrame.setVisible(true);
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Dimension dimension = toolkit.getScreenSize();
//180.98-SW3.ActionListener
      jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 300 );
      return jFrame;
   } // тот самый фрейм
   
}
      jFrame.setBounds(dimension.width/2-250, dimension.height/2-250, 500, 300);
      jFrame.setTitle("this is my app");
   }
}
*/
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.Callable;


public class Main {
   public static void main(String[] args) {
   
      InvocationHandler handler = new MyProxy(5);
      Comparable comparable;
      Class[] classes = new Class[]{Comparable.class, Callable.class};
      Object proxy = Proxy.newProxyInstance(null, classes, handler);
//      proxy.getClass();
//      proxy.toString();
      System.out.println(proxy.toString());
   }
   static class MyProxy implements InvocationHandler {
      Object target;
      MyProxy(Object target) {
      
         this.target = target;
      }
      @Override
      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
   
         System.out.println(args);
         return "bla";
      }
   }
}



//24.12.2017 (11:07) by {Vachok}
import javax.swing.*;
import javax.swing.border.Border;



public class Main extends MyJComp {
   
   static JFrame jFrame = getFrame(true, 500, 500, 800, 300);
   static JPanel jPanel = new JPanel();
   public static void main(String[] args) {
   
      jFrame.setTitle("by Vachok");
      jFrame.add(jPanel);
      jPanel.add(new JCheckBox("18 марта 2018. TrueStory"));
      JRadioButton jRadioButton1 = new JRadioButton("Путин");
      JRadioButton jRadioButton2 = new JRadioButton("ХУЙ");
      jRadioButton2.setSelected(true);
      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(jRadioButton1);
      buttonGroup.add(jRadioButton2);
      jPanel.add(jRadioButton1);
      jPanel.add(jRadioButton2);
      Border border = BorderFactory.createEtchedBorder();
      Border border1 = BorderFactory.createTitledBorder(border, "у тебя есть выБОР");
      JComboBox<String> comboBox = new JComboBox<>();
      comboBox.addItem("свобода");
      comboBox.addItem("равенство");
      comboBox.addItem("УПЯЧКА");
      jPanel.add(comboBox);
      jPanel.setBorder(border1);
   }
}
