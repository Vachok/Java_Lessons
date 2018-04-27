package les.cohesh.coupl;



public class Main {
   
   char s;
   public static void main(String[] args) {
   
   }
   
   
   class A {
      
      private int i;
      public int getI() {
         
         return i;
      }
   }
   
   
   class B {
      
      void printI() {
         
         System.out.println(new A().getI());
      }
   }
}


// https://goo.gl/kEZWQA это пример хорошего Coupling. Классы знают минимум друг о друге. только на уровне публичных методов
// https://goo.gl/D9dwRV bad coupling!
// https://goo.gl/s3UeNB One Class - One Does!
// https://goo.gl/CttvLW LOW Cohasing - плохой дизайн
// at 24.01.2018 (10:07)