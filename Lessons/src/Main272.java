import java.util.Random;
import java.util.logging.Logger;



public class Main272 {
   
   //badly
   private static final Logger log = Logger.getGlobal();
   public static void main(String[] args) {
      
      try{
         throw new Exception("message");
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
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