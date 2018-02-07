package general.anno;



import java.beans.Transient;
import java.lang.annotation.*;
import java.lang.ref.Reference;



@Inherited
@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.FIELD)
@interface MyAnn {
   
   boolean run() default true;
   int i() default 1;
   String value();
}


@interface BugReport {
   
   boolean showStopper() default false;
   ;
   String assignedTo() default "[none]";
   String assignedTo2() default "";
   int i() default 1 + 1;
   Class<?> testCase() default Void.class;
   Status status() default Status.UNCONFIRMED;
   String[] reportedBy();
   enum Status {UNCONFIRMED, CONFIRMED, FIXED, NOTABUG}
}


public class Anno {
   
   public static void main(String[] args) {
   
   }
}


class MyClass {
   
   @MyAnn ("some")
   @Deprecated
   int i;
   @Deprecated
   MyClass() {
   
   }
   @Transient
   @BugReport (reportedBy = {"one", "two"})
   public @Deprecated
   void method() {
      
      @Deprecated int j;
   }
}


class Anno2 extends Anno {

}

/*
Аннотаций может быть много. Они могут быть применены к чему угодно
https://youtu.be/cspUgROT96A?t=171
* */
/*
Если в аннотации не задано default-значение для переменной,
нужно задать его вручную, при применении аннотации
value - это спец. имя, используемое в аннотации.
* */
/*
Важные аннотации
@Inherited - аннотация будет распространяться на все классы child
@Retention() - где будет видно аннотацию. В примере - при запуске.
@Target(ElementType.FIELD) - к чему может быть приметена аннотация.
* */
/*
BugReport - пример расширенной аннотации
Всё это можно запихнуть в аннотации
В аннотациях нельзя использовать объекты.
В аннотации можно добавить другие аннотации
* */