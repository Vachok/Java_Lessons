package ru.inter.faces;



interface Animal {
   
   void eat();
   
   enum E {
   
   }
   
   
   interface MyInnerInterface {
      
      int i = 5;
      void eat();
   }
   
   
   class MyInnerClass {
   
   }
}


interface Cat extends Animal {
   
   int i = 5;
   void move();
}


public class Zoo {
   
   public static void main(String[] args) {
   
   }
}


class Tiger implements Animal, Cat {
   
   @Override
   public void eat() {
   
   }
   @Override
   public void move() {
   
   }
}


/* мы пока не знаем, что будем рисовать, но мы уже знаем КАК рисовать
в этом суть Интерфейса.
interface Shape{
   void draw();
}
class ElkaVLesu implements Shape{
   @Override
   public void draw(){
   
   }
}*/
/* Итнерфейс - аналог "розетки".
ниверсальное средство
у него есть дырка, которая обеспечивает "220 вольт"
в него можно воткнуть разные элетроприборы
* https://goo.gl/Yg4qfm */
// https://goo.gl/6Gva7Y основное
// at 23.01.2018 (17:16)