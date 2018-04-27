package net.sosket.email;



import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.util.Properties;



public class Main {
   
   public static void main(String[] args) throws Exception {
      
      final Properties properties = new Properties();
      properties.load(new FileInputStream("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\email.properties"));
      
      Session mailSession = Session.getInstance(properties);
      MimeMessage message = new MimeMessage(mailSession);
      message.setFrom(new InternetAddress("ikudryashov@eatmeat.ru"));
      message.setRecipient(Message.RecipientType.TO, new InternetAddress("dpetrov@eatmeat.ru"));
      message.setSubject("ThisIsMyMegaMessage");
      message.setText("PUK");
      Transport tr = mailSession.getTransport();
      tr.connect("ikudryashov", "netzero0912");
      tr.sendMessage(message, message.getAllRecipients());
      tr.close();
   }
}
