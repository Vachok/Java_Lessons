package jmx.serv;



import javax.management.*;
import java.lang.management.ManagementFactory;



public class Main {
   
   public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {
      
      MBeanServer server = ManagementFactory.getPlatformMBeanServer();
      ObjectName name = new ObjectName("jmx.Hello:type=Hello");
      jmx.serv.Hello mbean = new jmx.serv.Hello();
      server.registerMBean(mbean, name);
      
      System.out.println("forever yong...");
      Thread.sleep(Long.MAX_VALUE);
   }
}
/*
Java Management (MBeans)
Можно самому создавать Management Beans.
Которые потом можно будет выполнять "на лету" приложения.
Через Java Mission Control

jmx.serv.HelloMBean - это интерфейс, который содержит нужные методы
jmx.serv.Hello - это класс, который переопределяет методы HelloMBean
и позволяет с ними работать.

in Java Mission Control:
https://github.com/Vachok/Java_Lessons/commit/6ff6028bf6e7de394f5464370b941d86f4555a72#diff-812fce2549aed8b702bfa7a3d7402241
*/
