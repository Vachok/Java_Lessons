package general.locale;



import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;



public class Loc {
   
   public static void main(String[] args) {
      
      Locale locale = new Locale("ru", "RU");
      Locale locale2 = Locale.getDefault();
      Locale locale3 = Locale.ITALY;
      
      System.out.println(NumberFormat.getCurrencyInstance(locale).format(1000));
      System.out.println(NumberFormat.getCurrencyInstance(locale2).format(1000));
      System.out.println(NumberFormat.getCurrencyInstance(locale3).format(1000));
      
      System.out.println(DateFormat.getDateInstance(DateFormat.FULL, locale).format(new Date()));
      System.out.println(DateFormat.getDateInstance(DateFormat.FULL, locale2).format(new Date()));
      System.out.println(DateFormat.getDateInstance(DateFormat.FULL, locale3).format(new Date()));
      
     /* Locale[] locales = Locale.getAvailableLocales();
      for (Locale loc : locales){
         System.out.println(loc*//*https://goo.gl/GMp1YR*//*);
      }*/

//      System.out.println(locale2/*https://goo.gl/DDRQtU*/);
   }
}
