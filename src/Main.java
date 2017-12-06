

public class Main {


    public static void main( String[] myArgs ) {
        int i = 10;
        switch (i) {
            case 1:
                System.out.println(1);
            default:
                System.out.println("default"); //не обязательно последний
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);
        }
    }
}