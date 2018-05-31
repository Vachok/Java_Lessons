package regex.unicodel; // https://youtu.be/JIvXe34k0PQ

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Unicodel {

    public static void main(String[] args) { // Ищет "похожий" символ
        Pattern p4 = Pattern.compile("à", Pattern.CANON_EQ);
        Matcher m4 = p4.matcher("à");
        m4 = p4.matcher("à");

        while (m4.find()) {
            System.out.print(m4.start() + " " + m4.group() + " ");
        }
        System.out.println("");

    }
    // Поиск чисел
    /*{
        Pattern p3 = Pattern.compile("\\p{Digit}");
        Matcher m3 = p3.matcher("5XI");

        while (m3.find()){
            System.out.print(m3.start()+" "+m3.group()+" ");
        }
        System.out.println("");

    }*/
    // Можно искать по заранее встроенным паттернам
    /*{
        Pattern p2 = Pattern.compile("\\p{L}");
        p2 = Pattern.compile("\\p{M}");
        p2 = Pattern.compile("\\p{Z}");
        p2 = Pattern.compile("\\pZ");
        p2 = Pattern.compile("\\p{L}\\p{M}.*");
        Matcher m2 = p2.matcher("à 1");

        while (m2.find()){
            System.out.print(m2.start()+" "+m2.group()+" ");
        }
        System.out.println("");

    }*/
    // Поиск вхождений по UNICODE
    /*{
        System.out.println("\u0061\u0300");
        System.out.println("\u00E0");

        Pattern p = Pattern.compile("\u00E0");
        p = Pattern.compile("\\x{00E0}");
        p = Pattern.compile("\u0061");
        Matcher m = p.matcher("à"); // тут один символ
        m = p.matcher("à"); // тут два
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");
    }*/
}
