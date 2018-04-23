public class Main277 {
   
   public static void main(String[] args) {
      
      Book x = new Book("one");
      Book y = new Book("one");
      Book z = new Book("one");
      
      // reflexive
      System.out.println("reflexive");
      System.out.println(x.equals(x)); // must be true
      System.out.println("");
      
      // symmetric
      System.out.println("symmetric");
      System.out.println(x.equals(y));
      System.out.println(y.equals(x));
      System.out.println("");
      
      // transitive
      System.out.println("transitive");
      System.out.println(x.equals(y));
      System.out.println(y.equals(z));
      System.out.println(x.equals(z));
      System.out.println("");
      
      // consistent
      System.out.println("consistent");
      System.out.println(x.equals(y));
      System.out.println(x.equals(y));
      System.out.println(x.equals(y));
      System.out.println(x.equals(y));
      System.out.println("");
      
      // not null
      System.out.println("not null");
      System.out.println(x.equals(null)); // must be false
      
      // 5 требований, которые должны соблюдаться
   }
}


class Book {
   
   String title;
   Book(String title) {
      
      this.title = title;
   }
   @Override
   public boolean equals(Object obj) {
      // badly code!     return title.equals(obj);
   }
}

// https://goo.gl/1n47A8 - Нарушение рефлексии и симетрии
// https://goo.gl/mvCQuG - Нарушена консистентность
// https://goo.gl/7cbFSF - Переопределение equals самостоятельно. Что и для чего
// https://goo.gl/aaN2pq - Переопределённый equals
// https://goo.gl/rsSv9P - default settings

// at 23.01.2018 (8:46)