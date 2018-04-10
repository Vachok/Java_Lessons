package regex.posquant; // https://youtu.be/04p4eHkm100

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PosQuant { // Pq можно заменить на атомарную группу
    public static void main(String[] args) {
        Pattern p3 = Pattern.compile("(a|b)*+b");
        p3 = Pattern.compile("(?>(?:a|b)*)b");
        p3 = Pattern.compile("(?>a|b)*b");
        Matcher m3 = p3.matcher("b");
        while (m3.find()) {
            System.out.print(m3.start() + " " + m3.group() + " ");
        }
        System.out.println("");

    }
    // https://youtu.be/04p4eHkm100?t=293
    /*{
        Pattern p = Pattern.compile("\".*+\"");
        Matcher m = p.matcher("\"abc\"x");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");

    }*/
    // Possesive Quantifier - аналог Greedy, но без возврата назад
    /*{ // https://youtu.be/04p4eHkm100?t=110
        Pattern p = Pattern.compile("\"[^\"]*+\"");
        Matcher m = p.matcher("\"abc\"");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");
    }*/
}