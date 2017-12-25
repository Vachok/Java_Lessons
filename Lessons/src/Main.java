//180.98-SW3.ActionListener
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//179.97-SW2.JComponent
public class Main {
   
}
/* 178.96-SW1-HelloWorld


import javax.swing.*;
import java.awt.*;




public class Main {
   
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
