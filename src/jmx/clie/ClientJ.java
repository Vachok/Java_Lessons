package jmx.clie;



import jmx.serv.HelloMBean;

import javax.management.*;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;



public class ClientJ {
   
   public static void main(String[] args) throws Exception {
      // подключение к сервису jmx
      JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://:9999/jmxrmi");
      JMXConnector jmxc = JMXConnectorFactory.connect(url, null);
      MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();
      
      /* берём MBean. в пакете jmx, и темой Hello, и создаём proxy для mBean
      JMX.newMBeanProxy(mbsc, mbeanName, HelloMBean.class, true)
      JMX Class, метод newMBeanProxy
      Передаём
      mbsc, Имя, Класс и включаем нотификации
      */
      ObjectName mbeanName = new ObjectName("jmx.Hello:type=Hello");
      HelloMBean mbeanProxy = JMX.newMBeanProxy(mbsc, mbeanName, HelloMBean.class, true);
      
      // подписка на уведомления
      mbsc.addNotificationListener(mbeanName, new ClientListener(), null, null);
      
      // использование mbeanProxy
      mbeanProxy.sayHello();
      Thread.sleep(1000);
      /* если в jmx.serv.HelloMBean.sayHello() произойдет notification,
      сработает jmx.clie.ClientListener
      https://goo.gl/ZkhMKb - Вывод с подпиской
       */
      mbeanProxy.addIntegers(1, 3);
      //mbeanProxy.setName("hello");
      System.out.println(mbeanProxy.returnPerson().getName());
      
      System.out.println("50    ####################################");
      // Список и Beans сервера jmx https://goo.gl/eNGPDZ
      System.out.println("Domains:");
      String domains[] = mbsc.getDomains();
      Arrays.sort(domains);
      for(String domain : domains){
         System.out.println("Domain - " + domain);
      }
      System.out.println("MBServ default domain - " + mbsc.getDefaultDomain());
      System.out.println("MBeans count - " + mbsc.getMBeanCount());
      System.out.println("Query MBServ MBeans:");
      Set<ObjectName> names = new TreeSet<ObjectName>(mbsc.queryNames(null, null));
      for(ObjectName name : names){
         System.out.println("ObjName - " + name);
      }
      
      jmxc.close();
   }
   
}
