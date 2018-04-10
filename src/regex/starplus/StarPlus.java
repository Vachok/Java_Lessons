package regex.starplus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarPlus {

    {
        Pattern p4 = Pattern.compile("\\Q*\\d+*\\E+"); // Буквальное восприятие QE 0 *\d+**
        p4 = Pattern.compile("\\Q*\\d+*\\E*+"); // 0 *\d+**
        // p4 = Pattern.compile("?:\\Q*\\d+*\\E+");  .PatternSyntaxException: Dangling meta character '?' near index 0?:\Q*\d+*\E+
        Matcher m4 = p4.matcher("*\\d+**\\d+*");

        while (m4.find()) {
            System.out.print(m4.start() + " " + m4.group() + " ");
        }
        System.out.println(" ");
    }
}
    /*{
        Pattern p3 = Pattern.compile("<.+>");//10 <EM>first</EM> (greedy)
        p3 = Pattern.compile("<.+?>"); // 10 <EM> 19 </EM>  (lazy reluctant)
        p3 = Pattern.compile("<[^>]+>"); // 10 <EM> 19 </EM>
        Matcher m3 = p3.matcher("This is a <EM>first</EM> last");
        while (m3.find()){
            System.out.print(m3.start()+" "+m3.group()+" ");
        }
        System.out.println(" ");
    }*/

    /*{
        Pattern p2 = Pattern.compile("\\b[1-9][0-9]{2,4}\\b"); // ищет всё, что начинается с 1-9, и дельше включает 2 или 4 любые цифры
        p2 = Pattern.compile("\\b[1-9][0-9]{3}\\b"); // ищет всё, что начинается с 1-9, и дельше включает 2 или 4 любые цифры
//        Matcher m2 = p2.matcher("100  99999"); // 0 100 4 99999
        Matcher m2 = p2.matcher("100 1234 99999"); // 4 1234
        while (m2.find()){
            System.out.print(m2.start()+" "+m2.group()+" ");
        }
        System.out.println(" ");
    }*/

    /*{
        Pattern p = Pattern.compile("<[A-Za-z][A-Za-z0-9]*"); // 0 <h1 * - может быть, может не быть. В этом вариантте ищем : < потом любую букву, строго 1 раз, потом НЕОБЯЗАТЕЛЬНО, но может быть сколько угодно буквоЦифр
        p = Pattern.compile("<[A-Za-z][A-Za-z0-9]+"); //  при + - обязательно должен быть хоть 1
        Matcher m = p.matcher("<h1>");
        m = p.matcher("<a>");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println(" ");
    }*/
// * и + . Знаки повторения. от 1 до бесконечности
// идентичные выражения {0,} и {1,}
// по-умолчанию они greedy. если поставить ? будет lazy
// \Q \E - всё между ними воспринимается буквально
