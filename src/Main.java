

public class Main {

    enum Days{MONDAY, TUESDAY, WEDNESDAY}

    public static void main( String[] myArgs ) {
        int i = 5;
        String s = "";
        Days days = Days.MONDAY;

        switch (s) {
            case "1":
                System.out.println(1);
                break;
            case "2":
                System.out.println(2);
                break;
            case "3":
                System.out.println(3);
                break;
            case "5":
                System.out.println(5);
                break;
            case "6":
                System.out.println(6);
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}