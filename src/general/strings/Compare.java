package general.strings;



import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Compare {
   
   public static void main(String[] args) {
      
      List<String> list = new ArrayList<>();
      list.add("bb");
      list.add("cc");
      list.add("aa");
      list.add("AA");
      list.add("ba");
      list.add("ААА");
      list.add("ааа");
      
      /* Collator - можно отсортировать строки. https://goo.gl/e86DFk
      2 символа - латиница
      3 - кириллица
      */
      Collator collator = Collator.getInstance();
//      collator.setStrength(Collator.PRIMARY); // 20=22, 20=19 https://goo.gl/7f4Kta
//      collator.setStrength(Collator.SECONDARY); // 20!=22 20=19 https://goo.gl/dU9ydM
      collator.setStrength(Collator.TERTIARY); // 20!=22, 20!=19 https://goo.gl/qhGLNc
      Collections.sort(list, collator);
      for(String s : list){
         System.out.println(s);
      }
   }
}
