public class Main278 {
   
   public static void main(String[] args) {
      
      System.out.println(null instanceof Book);
   }
}


class Book {
   
   String title;
   Book(String title) {
      
      this.title = title;
   }
   @Override
   public boolean equals(Object obj) {
      
      if(obj instanceof Book) {
         return obj!=null && this.title.equals((( Book ) obj).title);
      }
      return false;
   }
}
/* instanceof - проверяет является ли класс наследником
 
 */

// at 23.01.2018 (9:41)