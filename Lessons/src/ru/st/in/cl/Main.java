package ru.st.in.cl;



public class Main {
   
   private static int i = 1;
   int j = 2;
   public static void main(String[] args) {
      
      Main main = new Main();
      Inner inner = main.new Inner3();
      inner.method();
   }
   
   
   static class Inner {
      
      static int q = i;
      int w = 3;
      void method() {
         
         System.out.println("method");
      }
      int getI() {
         
         return Main.i;
      }
      enum e {
      
      }
   }
   
   
   static class Inner2 extends Inner {
   
   }
   
   
   class Inner3 extends Inner {
      
      void method() {
         
         System.out.println("inner3");
      }
   }
}


class OtherClass extends Main.Inner {
   
   public static void main(String[] args) {
      
      Main.Inner inner = new Main.Inner();
      System.out.println(inner.getI());
   }
}

// https://goo.gl/zFzz6s
// https://goo.gl/xAf33V можно нарушить инкапсуляцию
// https://goo.gl/UU1TkD Можно создавать не static в static
// https://goo.gl/r6pAAz Можно создавать копии класса в других классах
// https://goo.gl/WfWxWz
// https://goo.gl/43LPNC  может всё, что может обычный class
// https://goo.gl/fTYEHZ имеет доступ, только к static-переменным
// at 23.01.2018 (14:50)