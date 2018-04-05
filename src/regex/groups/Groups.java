package regex.groups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static void main(String[] args) { // https://youtu.be/qor0pSIKawk?t=870
        Pattern p3 = Pattern.compile("<([A-Z][A-Z0-9]*)[^>]*>.*?</\\1>"); // группа (), где 1й символ БУКВА [] 2й и далее символ [] буква или цифра, до тех пор, пока не найдём >
        Matcher m3 = p3.matcher("This is a <EM>first</EM> test");
        while (m3.find()) {
            System.out.print(m3.start() + " " + m3.group() + " ");
        }
        System.out.println("");
    }
    // Замена
    /*{
//        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)", "$1 version")); // в Java при использовании в pattern обращение к группе = \\,
        // в других случаях - $
//        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)", "$0 version")); // $0 - полное выражение
        System.out.println("EditPad Lite".replaceAll("EditPad (Lite|Pro)", "$1 version").toUpperCase()); // $0 - полное выражение
    }*/
    // Регулярка с выражением в группе
    /*{
        Pattern p = Pattern.compile("EditPad (Lite|Pro)");
//        p = Pattern.compile("Set(?:Value)?");

        Matcher m = p.matcher("EditPad Lite version");
        while (m.find()){
            System.out.print(" m.start()+\" \"+m.group()+\" \" = " +  m.start()+" "+m.group()+" ");
        }

    }*/
    // Backreference - ссылка, которую можно запомнить
    /*{
        Pattern p = Pattern.compile("Set(Value)?");
        p = Pattern.compile("Set(?:Value)?"); //не запоминает выражение

        Matcher m = p.matcher("Set or SetValue");
        while (m.find()){
            System.out.print(" m.start()+\" \"+m.group()+\" \" = " +  m.start()+" "+m.group()+" ");
        }
        Thread.currentThread().setName("Groups.main");
        System.out.println("Groups.main");
    }*/
}
