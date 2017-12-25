//179.97-SW2.JComponent
public class Main {
   
}
=======
/* 178.96-SW1-HelloWorld


import javax.swing.*;
import java.awt.*;



public class Main {
   
   public static void main(String[] args) {
   
      JFrame jFrame = new JFrame(){};
      jFrame.setVisible(true);
      jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Toolkit toolkit = Toolkit.getDefaultToolkit();
      Dimension dimension = toolkit.getScreenSize();
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
