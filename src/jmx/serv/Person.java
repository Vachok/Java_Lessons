package jmx.serv;



import java.io.Serializable;



public class Person implements Serializable {
   
   private String name = "Vachok";
   public String getName() {
      
      return name;
   }
   void setName(String name) {
      
      this.name = name;
   }
}
