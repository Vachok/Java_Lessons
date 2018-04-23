package general.strings;



import java.sql.Date;
import java.text.MessageFormat;
import java.util.GregorianCalendar;



public class Formatting {
   
   public static void main(String[] args) throws InterruptedException {
//      String s = "On 26.05.2017 was my Dead...";
//      String s2 = "On 13.06.2017 was my rebirth...";
      String s3 = "On {1,date,long} was my {0}...{2,choice,0#no feelings|1#1 feel|2#{2} feelings} was destroyed. This is nothing to left";
      String s4 = MessageFormat.format(s3, "Dead", new GregorianCalendar(2017, 4, 26).getTime(), 100);
//      System.out.println(s);
//      System.out.println(s2);
      System.out.println("Pattern:");
      Thread.sleep(20);
      System.err.println(s3);
      Thread.sleep(20);
      System.out.println("Result:");
      Thread.sleep(20);
      System.out.println(s4);
   }
}
