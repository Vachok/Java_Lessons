package ru.lesson.stinit;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;



public class Main {
   
   static int i;
   int j;
   
   public static void main(String[] args) {
      
      new Main();
      System.out.println(i);
   }
   interface Car {
      
      int k = i;
      int n = j;
   }
   
   
   static class Student {
   
   }
   //todo Student student = new Student();
   //badly  Car car = new Car();
}

// https://goo.gl/WiW2Ci Внутренний интерфейс - ВСЕГДА статический
// https://goo.gl/ZkdUXM static не может быть верхнего уровня
// https://goo.gl/gqvDbP так компилируется
// https://goo.gl/J6Rf2s Как работает static-block
// https://goo.gl/hhfsb1  Можно так же проинициализировать массив
// https://goo.gl/TAHPFA Solution
// https://goo.gl/4vauDU FileNotFoundException + static int i = getI();
// https://goo.gl/mYMfvt Зачем нужен статический блок?
// at 23.01.2018 (11:02)