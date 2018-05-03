package ru.less.fin;



import com.sun.tools.javac.Main;



public class Main281 {
   
   public static void main(String[] args) {
      
      One one = new Two();
      one.executeMethod();
   }
}


class One {
   
   private final void method() {
      
      System.out.println("one");
   }
   void executeMethod() {
      
      One one = new Two();
      one.method();
   }
}


class Two extends One {
   
   void method() {
      
      System.out.println("two");
   }
}


// https://goo.gl/ZeZ5Ea Полиморфизма не будет
// https://goo.gl/p2pmQq final method
// https://goo.gl/ix2xNT как присвоить переменную final
// https://goo.gl/qTZoFD  final-ограничение
// https://goo.gl/YeJwsr final class нельзя extends

// at 23.01.2018 (12:15)