package regex.groupnames;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrNames {

    public static void main(String[] args) {
        System.out.println("abc".replaceAll("(?<Aletter>a)", "${Aletter}-")); // https://youtu.be/OZdZ31qHZeE?t=147 (Aletter - имя группы)

        Pattern p = Pattern.compile("<(?<tag>[A-Z][A-Z0-9]*)[^>]*>.*?</\\k<tag>>"); // для обращения к гуппе по-имени, используется \\k
        Matcher m = p.matcher("This is <EM>first</EM> test");
        while (m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println();

        System.out.println("abcd".replaceAll("(a)(?<x>b)(c)(?<y>d)", "$1$2$3$4")); // в данном случае обращение по-номеру
        System.out.println("abcd".replaceAll("(a)(?<x>b)(c)(?<y>d)", "$1${x}$3${y}"));// тут по-имени
    }
}
