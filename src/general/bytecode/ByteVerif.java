package general.bytecode;



import java.applet.Applet;



public class ByteVerif extends Applet {
   
   public static void main(String[] args) {
      
      System.out.println("1+2 == " + fun());
   }
   private static int fun() {
      
      int m;
      int n;
      m = 1;
      n = 2;
      int r = m + n;
      return r;
   }
   
}

