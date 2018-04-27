package general.internlocal;



import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;



public class Internalize {
   
   public static void main(String[] args) {
      
      ResourceBundle bundleDefault = ResourceBundle.getBundle("general.internlocal.resources.resource");
      ResourceBundle bundleRu = ResourceBundle.getBundle("general.internlocal.resources.resource_ru", new Locale("ru", "RU"));
      System.out.println(bundleDefault.getString("somevalue"));
      System.out.println(bundleRu.getString("somevalue")); // https://goo.gl/ktu8L9
   }
}


/*
Иногда удобнее использовать классы ресурсов. ( general.internlocal.resources )
Классы могут возвращать любые объекты
При использовании классов, русский можно не кодировать, как тут - general/internlocal/Internalize.java:39
property файлы идут в спец.колдировке для строны-локации.
классы - идут в кодировке по-умолчанию для проекта.
* */


/*
Можно сделать различные файлы properties для разных локаций
https://youtu.be/THc6Iv745PY?t=737
/*{

//      ResourceBundle bundleRu = ResourceBundle.getBundle("resources", new Locale("ru", "RU"));
//      ResourceBundle bundleDe = ResourceBundle.getBundle("resources", new Locale("de", "GR"));
//      ResourceBundle bundleFr = ResourceBundle.getBundle("resources", new Locale("fr"));
   
      System.out.println(bundleDefault.getString("somevalue")); // https://goo.gl/jdTWJs
//      System.out.println(new String(bundleRu.getString("somevalue").getBytes("ISO-8859-1"), "Windows-1251"));
//      System.out.println(bundleDe.getString("somevalue"));
//      System.out.println(bundleFr.getString("somevalue"));
   }*/