package regex.multi; // https://youtu.be/poUahvbg8Hw?list=PL786bPIlqEjRDXpAKYbzpdTaOYsWyjtCX

import jregex.Matcher;
import jregex.Pattern;

public class Mult {
    public static void main(String[] args)
    // if-then-else в java из коробки не реализован.
    // можно подключить библиотеку jregex
    {
        Pattern p = new Pattern("(a)?b(?(1)c|d)");
        p = new Pattern("(?<test>a)?b(?(\\k<test>)c|d");
        Matcher m = p.matcher("bd");
        m = p.matcher("abc");
        m = p.matcher("bc");
        m = p.matcher("abd");

        while (m.find()) {
            System.out.print(m.start() + " " + m + " ");
        }
        System.out.println("");
    }
}
