package regex.question;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question {

    public static void main(String[] args) {
        // ? - вхождение предидущего символа может быть 0 или 1 раз
        Pattern p3 = Pattern.compile("Feb(ruary)?? 23(rd)??"); // 0 February 23 15 February 23 28 Feb 23 38 Feb 23
        Matcher m3 = p3.matcher("February 23rd, February 23, Feb 23rd, Feb 23");
        while (m3.find()) {
            System.out.print(m3.start() + " " + m3.group() + " ");
        }
        System.out.println("");
    }
    //? - greedy оператор. по-умолчанию будет искать все возможные варианты.
    /*{
//        Pattern p2 = Pattern.compile("Nov(ember)?"); //0 November 9 Nov https://youtu.be/isNlywsfREY?t=139
        Pattern p2 = Pattern.compile("Nov(ember)??"); // 0 Nov 9 Nov добавим еще один ? - поведение меняется на ленивый
        Matcher m2 = p2.matcher("November Nov");
        while(m2.find()){
            System.out.print(m2.start()+" "+m2.group()+" ");
        }
        System.out.println("");
    }*/
    // ? обозначение опциональных элементов
    /*{
        Pattern p = Pattern.compile("colou?r"); //0 color 6 colour
        Matcher m = p.matcher("color colour");
        while(m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");
    }*/
}
