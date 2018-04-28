package pattern.singletoner;

/**
 Пример класса синглтона
<p>
 @since 27.04.2018 (11:30) */
class Singleton {
    /**
     Создание самого себя. Для того, чтобы возвращаться по-запросу.
     */
    static Singleton singleton = new Singleton();
    /**
     Для демонстрации
     */
    int i = 0;

    /**
     Класс должен иметь приватный конструктор, чтобы нельзя было создавать его копии.
     */
    private Singleton() {

    }

    /**
     Метод получетия класса для работы.
     <i>Должет быть статическим</i>

     @return копия класса, для работы с ним.

     @see Singl
     */
    public static Singleton getInstance() {
        return singleton;
    }
}
