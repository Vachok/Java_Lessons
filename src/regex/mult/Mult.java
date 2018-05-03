package regex.mult; // https://youtu.be/N5Vsfj9Wa2M

import javafx.css.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mult {
    public static void main(String[] args) { // Множественные условия в выражениях
        // https://youtu.be/N5Vsfj9Wa2M?t=329
        Pattern p2 = Pattern.compile("\\b(?=\\w{6,12}\\b)\\w{0,9}(cat|dog|mouse)\\w*"); // поиск слова из 6-12 букв, где есть cat dog or mouse
        Matcher m2 = p2.matcher("wecate");

        while (m2.find()) {
            System.out.print(m2.start() + " " + m2.group() + " ");
        }
        System.out.println(" ");

    }
    /*{ // https://youtu.be/N5Vsfj9Wa2M?t=127
        Pattern p = Pattern.compile("(?=\\b\\w{6}\\b)\\w*cat\\w"); // поиск слова из 6 букв, где есть cat
        Matcher m = p.matcher("wecate");

        while (m.find()){
            System.out.print(m.start()+ " "+m.group()+" ");
        }
        System.out.println(" ");
    }*/
}


//11.04.2018 (9:48) by {14350}