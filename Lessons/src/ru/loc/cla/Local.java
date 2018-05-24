package ru.loc.cla;



public class Local {
   
   static int i = 5;
   int j = 6;
   public static void main(String[] args) {
   
   }
   void does(int e) {
      
      int r = 5;
      //badly  LocalLocal locallocal;
      class LocalLocal {
         
         //badly private  class LocalLocal{
         //badly public  class LocalLocal{
         //badly protected  class LocalLocal{
         final static int q = 4;
         public int w = j;
         int y = r;
         private int t = e;
         //badly  static void does2()
      }
      LocalLocal localLocal;
   }
   void does2() {
      
      class LocalLocal {
      
      }
   }
}
/*
Локальные классы
Определяются на уровне метода
Имеют доступ абсолютно ко всему, в классе и в объявленном методе
но где-то создать его не получится
доступ только на уровне метода
создать копию возможно только после объявления
его поля могут быть с любым уровнем
*/

// at 23.01.2018 (16:14)