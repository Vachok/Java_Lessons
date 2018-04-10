package ru.is.a.has.a;



public class Main {
   
   public static void main(String[] args) {
      
      Car car = new Car();
   }
}


class Telega {
   
   int wheels = 4;
}


class Car extends Radio {
   
   Radio radio = new Radio();
   void listen() {
      
      radio.listen();
   }
   void drive() {
   
   }
}


class Radio {
   
   void listen() {
      
      System.out.println("listen radio");
   }
}

// https://goo.gl/e1TvGm Так тоже делать нельзя!
// https://goo.gl/BKiXr2 так делать нельзя!
// https://goo.gl/PVn5kE основные отношения между классами
// at 24.01.2018 (9:35)