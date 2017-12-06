

public class Main {


    public static void main( String[] myArgs ) {
        int i = 3;
        switch (i) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
                break;
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);
            default:
                System.out.println("default");
        }
    }
}