class Parrent { //2. выполняется его статика
    static {//3
        System.out.println("static parrent block");
    }
    Parrent() { //6. т.к. мы пришли из extends
        System.out.println("Parrent cons");
    }
}

public class InitExample extends Parrent { //1 из запуска, идём сюда. сморим в extends и идём в Parrent
    static {
        System.out.println("static init block");//4. т.к. static
    }
    { //класс Parrent закончился, продолжаем
        System.out.println("init block1"); //7
    }
    {
        System.out.println("init block2"); //8
    }
    InitExample() {
        System.out.println("constructor"); //10
    }
        public static void main( String[] args ) {
        new InitExample(); //0.
    }
    {
        System.out.println("init block3"); //9
    }
    static {
        System.out.println("static init block2");//5.
    }
}