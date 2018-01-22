import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Logger;



public class Main272 {
   
   //badly
   public static void main(String[] args) {
      
      method();
   }
   private static void method() {
   
   }
}
/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
jmap -dump:format=b,file=dump.txt <PID>
jhat dump.txt

https://youtu.be/pHvN5nykk_c?t=32m22s !!!!!!!!!!!!!!!!!!!!!!!!!!!!!1*/

// https://goo.gl/w7argo java -verbose  (вызов из консоли)

   /*{    Отлов "неотловимых" Exceptions
      Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
         @Override
         public void uncaughtException(Thread t, Throwable e) {
            //
         }
      });
   }*/
   
   
   
   /*{ Запись стэка в файл
   
      PrintWriter writer = new PrintWriter(new File("ingest.log"));
      new Throwable().printStackTrace(writer);
      writer.flush();
      writer.close();
   }*/


 
   /*{ https://goo.gl/Fd3uRa
      Thread.dumpStack();
   }*/
//          =
   /*{ Принудительно печатать Stacktrace
         try{
            throw new Exception("message");
         }
         catch(Exception e){
            e.printStackTrace();
         }
      
/* "Прокси"
{
      
      Random random = new Random() // START
      {
@Override// proxying
public double nextDouble() {// proxying
      Double d = super.nextDouble();// proxying
      System.out.println(d);// proxying
      return d;// proxying
      }// proxying
      };// proxying
      random.nextDouble();// FINISH
      }*/
// at 19.01.2018 (16:42)