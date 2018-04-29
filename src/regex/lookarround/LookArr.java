package regex.lookarround; // https://youtu.be/UPTZySm2-V4

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LookArr {

    public static void main(String[] args) { // Смотреть назад или вперёд
        Pattern p3 = Pattern.compile("\\b\\w*[^s\\W]\\b");

        p3 = Pattern.compile("\\b\\w+(?<!s)\\b"); // ищем слова без s в конце слова
        p3 = Pattern.compile("\\b\\w+[^s]\\b");
        p3 = Pattern.compile("\\b\\w*[^s\\W]\\b");

        Matcher m3 = p3.matcher("John's");

        while (m3.find()) {
            System.out.print(m3.start() + " " + m3.group() + " ");
        }
        System.out.println(" ");

    }
    // lookbehind
    /*{
        Pattern p2 = Pattern.compile("(?<!a)b"); // найти b где нет а
         p2 = Pattern.compile("(?<=a)b");
        Matcher m2 = p2.matcher("cb");

        while (m2.find()){
            System.out.print(m2.start()+ " " + m2.group() + " ");
        }
        System.out.println(" ");

    }*/
    // lookahead
    /*{
        Pattern p = Pattern.compile("q(?!u)"); // https://youtu.be/UPTZySm2-V4?t=191
        Matcher m = p.matcher("Iraqu");

        while (m.find()){
            System.out.print(m.start()+ " " + m.group() + " ");
        }
        System.out.println(" ");
    }*/
}
