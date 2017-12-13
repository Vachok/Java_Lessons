import java.io.Console;


public class Main {
    public static void main(String[] args) {
        Console console = System.console();
        String s = "";
        while(!s.equals("exit")){
            s = console.readLine();
            System.out.println(s);
        }
    }
}
