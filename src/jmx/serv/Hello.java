package jmx.serv;



import javax.management.AttributeChangeNotification;
import javax.management.MBeanNotificationInfo;
import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;



public class Hello extends NotificationBroadcasterSupport implements HelloMBean {
   
   private String name;
   static int sequenceNumber = 0;
   
   @Override
   public void sayHello() {
   
      System.out.println("YAHOO");
      Notification notification = new AttributeChangeNotification(this, Hello.sequenceNumber++, System.currentTimeMillis(), "YO!", "sequenceNumber", "int", Hello.sequenceNumber - 1, Hello.sequenceNumber);
      sendNotification(notification);
   }
   @Override
   public int addIntegers(int a, int b) {
      
      return a + b;
   }
   @Override
   public Person returnPerson() {
      
      return new Person();
   }
   @Override
   public String getName() {
      
      return name;
   }
   @Override
   public void setName() {
      
      this.name = name;
   }
   @Override
   public MBeanNotificationInfo[] getNotificationInfo() {
      
      String[] types = new String[]{AttributeChangeNotification.ATTRIBUTE_CHANGE};
      String name = AttributeChangeNotification.class.getName();
      String description = "An attr of MBean changed!";
      MBeanNotificationInfo info = new MBeanNotificationInfo(types, name, description);
      return new MBeanNotificationInfo[]{info};
   }
}
