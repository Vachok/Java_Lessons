package regex.posi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Posi
        // Заранее готовые наборы characters.
{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^\\p{Digit}");
        Matcher m = p.matcher("5");
        while (m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }
}
