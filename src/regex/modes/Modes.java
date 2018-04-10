package regex.modes; // https://youtu.be/ICgjJQHptGY

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Modes {
    public static void main(String[] args) {
        System.out.println("A".matches("(?i)a")); // case insens
        "A".matches("(?s)a"); // 1 line
        "A".matches("(?m)a"); // multiline
        System.out.println("A".matches("(?x)A#this is comment")); // comment
        System.out.println("A".matches("(?ix)a#this is comment")); // combine modes
        System.out.println("AA".matches("(?i)a(?-i)a")); // temp on|off modes
        System.out.println("AAA".matches("(?i)a(?-i:A)a")); // отключает режим для одной буквы


    }
    // Пример некоторых режимов работы
    /*{
        Pattern p = Pattern.compile("A#this is comment", Pattern.COMMENTS);
        p = Pattern.compile("a", Pattern.MULTILINE);
        p = Pattern.compile("a", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("A");

        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");
    }*/
}
