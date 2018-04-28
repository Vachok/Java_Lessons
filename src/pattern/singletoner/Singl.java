package pattern.singletoner;

/**
 Singleton
 <p>
 Это объект, который может быть только в единичном экземпляре.
 Пример {@link Runtime}; {@link System}. Демонстрация работы.

 @author IKudryashov
 @see Singleton
 @since 27.04.2018 (11:24) */
public class Singl {

    /**
     Пример работы с синглтоном
     <p>
     singleton == singleton2
     Каждый раз при создании экземпляра, будет возвращаться <b>одно и тоже</b>.

     @param args null
     */
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton.i = 5;
        System.out.println("singleton2.i = " + singleton2.i);
    }
}

