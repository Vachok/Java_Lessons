class Parrent {
    Parrent() {
        System.out.println("Parrent cons");
    }
}

public class InitExample extends Parrent {
    static {
        System.out.println("static init block");
    }
    {
        System.out.println("init block1");
    }
    {
        System.out.println("init block2");
    }
    InitExample() {
        System.out.println("constructor");
    }
        public static void main( String[] args ) {
        new InitExample();
    }
    {
        System.out.println("init block3");
    }
    static {
        System.out.println("static init block2");
    }
}