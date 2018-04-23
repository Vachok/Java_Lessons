package regex.coment; // https://youtu.be/8fau9JTFLw0

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Coment {
    public static void main(String[] args) {
        Pattern p3 = Pattern.compile("(?x)\\ d");
        Matcher m3 = p3.matcher("4");
        while (m3.find()) {
            System.out.print(m3.start() + " " + m3.group() + " ");
        }
        System.out.println("");
    }
    // (?x) - отключает учёт пробелов
    /*{
        Pattern p2 = Pattern.compile("(?x)a b c");
        Matcher m2 = p2.matcher("abc");
        while (m2.find()){
            System.out.print(m2.start()+" "+m2.group()+" ");
        }
        System.out.println("");
    }*/
    // виды коментариев в Java из коробки
    /*{
        Pattern p = Pattern.compile("(?x)a#comment");
        Pattern p = Pattern.compile("a#comment", Pattern.COMMENTS);

    }*/
}
