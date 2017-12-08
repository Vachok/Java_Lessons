

public class Main {
    int value;
    public static void main( String[] args ) {
        Main main = new Main();
        main.value = 5;
        System.out.println(main + "");
    }

    @Override
    public String toString() {
        return "value=" + value;
    }
}