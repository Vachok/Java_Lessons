package regex.point;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Point {

    public static void main(String[] args) {
        Pattern p2 = Pattern.compile("\".*?\""); // Не жадный 6 "string" 23 "double"
        //       Pattern p2 = Pattern.compile("\"[^\"\r\n]*\""); // Не жадный 6 "string" 23 "double"
//        Pattern p2 = Pattern.compile("\".*\""); // жадный пример 6 "string" between "double"

        Matcher m2 = p2.matcher("Put a \"string\" between \"double\" quotes");
        while (m2.find()) {
            System.out.print(m2.start() + " " + m2.group() + " ");
        }
        // Точка - это любой символ, кроме конца строки
       /* Pattern p = Pattern.compile("\\d\\d[-/.]\\d\\d[-/.]\\d\\d");
        Matcher m = p.matcher("02512703");

        Точка будет отрабатывать люой символ. Здесь тоже будет соответствие
        Pattern p = Pattern.compile("\\d\\d.\\d\\d.\\d\\d");
        Matcher m = p.matcher("02512703");
        while (m.find()){
            System.out.print(m2.start()+" "+m.group()+" ");
        }*/
        System.out.println();
    }
}
