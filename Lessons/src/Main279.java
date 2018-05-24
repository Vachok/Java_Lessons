import java.io.Serializable;
import java.util.List;



interface Car {
   
   default void drive() {
      
      System.out.println("Car drives");
   }
}


interface Motocycle {
   
   void drive();
}


public class Main279 {
   
   public static void main(String[] args) {
      
      MyNewCar myNewCar = new MyNewCar();
      myNewCar.drive();
   }
}


class Toyota implements Car {
   
   public void drive() {
      
      System.out.println("toyota drives");
   }
}


class Yamaha implements Motocycle {
   
   public void drive() {
      
      System.out.println("yamaha drives");
   }
}


class MyNewCar implements Car, Motocycle {
   
   public void drive() {
      
      System.out.println("MyNewCar drives");
   }
}

// https://goo.gl/dRuUjy Implements допускает множество
// https://goo.gl/Bc1ggQ нельзя extends много классов.
// https://goo.gl/5MDy46 extends vs implements.
// at 23.01.2018 (9:58)