package regex.pipeline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pipeline {

    public static void main(String[] args) {
        Pattern p2 = Pattern.compile("Get|GetValue|Set|SetValue");
        Matcher m2 = p2.matcher("SetValue");
        while (m2.find()) {
            System.out.print(m2.start() + " " + m2.group() + " ");
        }
        System.out.println();
    }
    // Pipeline. Будет или cat или dog
    /*{
        Pattern p = Pattern.compile("cat|dog"); //10 dog
        Matcher m = p.matcher("I like my dog");
        while (m.find()){
            System.out.print(m.start()+" "+m.group()+" ");
        }
        System.out.println("");
    }*/
}
