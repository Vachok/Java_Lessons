package ru.inner.nonstat;



public class Main {
   
   static int j = 6;
   Inner inner = new Inner();
   private int i = 5;
   public static void main(String[] args) {
      
      Inner inner = new Main().new Inner();
   }
   void method() {
      
      Inner inner = new Inner();
   }
   
   
   class Inner {
      
      final static int e = 5; // можно только константу.
      
      int q = Main.j;
      int w = i;
      void method() {
         
         q = Main.j + i;
      }
      //badly static
      // нельзя делать ничего static.
      
   }
}

/*
Внутренние классы ничем не отличаются от основных
у них есть полный доступ, даже к приватным и static от внешнего класса
но каждый экземпляр внутреннего класса, должен соотв. экземпляру внешнего
также в них не может быть static. за исключением констант.

* */

// https://goo.gl/3G7fGM Вызов из static или других классов
// https://goo.gl/SbpkPm  Внутренний нестат. класс имеет полный доступ ко всему
// at 23.01.2018 (15:41)