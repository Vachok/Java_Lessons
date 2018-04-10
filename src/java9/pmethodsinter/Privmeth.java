package java9.pmethodsinter;



interface A {
   
   private void print(String s) {
      
      System.out.println(s);
   }
   default void printMessage(String s) {
      
      print(s);
   }
}


public class Privmeth {
   
   public static void main(String[] args) {
      
      A a = new A() {
      
      
      };
      a.printMessage("hello!"); // https://goo.gl/fphXv8
   }
}