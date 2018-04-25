package regex.strokeborder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrokeBorder {

    public static void main(String[] args) {
// ^ начало $ конец
       /* Pattern p = Pattern.compile("^a"); // проверить на строки, с символа а: // 0 a
        p = Pattern.compile("c$"); // проверка на с в конце строки: // 2 c
        Matcher m = p.matcher("abc");
        while (m.find()){
            System.out.println(m.start()+" "+m.group()+" ");
        }*/

/*        Pattern p2 = Pattern.compile("\\d+"); // it's a number
        p2 = Pattern.compile("^\\d+$"); // + - 1 и более
        p2 = Pattern.compile("^\\d*$"); //
        Matcher m2 = p2.matcher("ab4c");
        if (m2.find()){
            System.out.println("it's a number");
        }*/
//Режим мультилайн
/*        Pattern p3 = Pattern.compile("ne$", Pattern.MULTILINE);
        //8 ne
        //19 ne
        p3 = Pattern.compile("ne$"); //19 ne
        p3 = Pattern.compile("ne\\z", Pattern.MULTILINE);// 19 ne ($ - не возьмёт \n)
        Matcher m3 = p3.matcher("first line\nsecondline");
        while (m3.find()){
            System.out.println(m3.start()+ " "+m3.group()+" ");
        }*/
//Как это работает
        System.out.println("749\n486\n4".matches("^4$")); //false
    }
}
