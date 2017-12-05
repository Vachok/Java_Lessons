class Parrent {
    Parrent() {
        System.out.println("Parrent cons"); //4.вывод
    }
}

public class InitExample extends Parrent { //1.Обратились в класс
    static {
        System.out.println("static init block"); //1,1.вывод
    }
    {
        System.out.println("init block");//5.вывод
    }
    InitExample() { //2.после static попадаем сюда, в конструктор
        System.out.println("constructor"); //6.вывод
    }
        public static void main( String[] args ) {
        new InitExample();//0.запуск
    }
}