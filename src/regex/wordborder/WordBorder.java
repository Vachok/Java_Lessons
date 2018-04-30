package regex.wordborder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordBorder {

    public static void main(String[] args) {


        // \b - разделитель слов
        {
            Pattern p = Pattern.compile("\\bis\\b");
            Matcher m = p.matcher("This island is beautiful");
            while (m.find()) {
                System.out.println(m.start() + " " + m.group() + " ");
            }
            System.out.println(); // 12 is
        }
    }
}
