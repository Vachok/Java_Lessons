package general.anno.example;



import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;



public class Main {
   
   public static void main(String[] args) throws Exception {
      
      Main main = new Main();
      Person person = new Person();
      main.print(person, person.getClass()); // передаём в print() класс Person
   }
   void print(Object o, Class c) throws IllegalAccessException {
      
      Field[] fields = c.getDeclaredFields(); // получаем филды
      for(Field field : fields){
         Annotation[] annotations = field.getDeclaredAnnotations(); // получаем аннотации из филдов
         for(Annotation annotation : annotations){
            if(annotation.annotationType().equals(Show.class)) { // если соотв. Show
               System.out.println(field.get(o)); // выводим на экран
            }
         }
      }
   }
   
   @Retention (RetentionPolicy.RUNTIME)
   @interface Show {
      
      boolean value() default true;
   }
}


class Person {
   
   String name = "Vachok";
   @Main.Show
   int age = 34;
}


/*
Тут мы выводим на экран только то, что отмечено аннотацией Show
* */