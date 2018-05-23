package regex.groups;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    public static void main(String[] args) {

    }
    // Группы в [] - воспринимаются "буквально"
    /*{
        Pattern p8 = Pattern.compile("[(a)b\1]");
        Matcher m8 = p8.matcher("abc()\\1");
        while (m8.find()){
            System.out.print(m8.start()+" "+m8.group()+" ");
        }
        System.out.println(" ");

    }*/
    //Пример replaceAll
    /*{
        System.out.println("the the".replaceAll("\\b(\\w+)\\s+$1\\b", "$1"));
        System.out.println("the the".replaceAll("\\b(\\w+)\\s+\\1\\b", "$1"));
    }*/
    // Пример использования + в группе и за её пределами
    /*{ //https://youtu.be/qor0pSIKawk?t=1342
        Pattern p7 = Pattern.compile("([abc]+)=\\1");
        p7 = Pattern.compile("([abc])+=\\1");
        Matcher m7 = p7.matcher("cab=cab");
        m7 = p7.matcher("b=b");
        while (m7.find()){
            System.out.print(m7.start()+" "+m7.group()+" ");
        }
        System.out.println(" ");

    }*/
    // Группа переписывает сама себя
    /*{
        Pattern p6 = Pattern.compile("([abc]+)");
//        p6 = Pattern.compile("([abc])+");
        Matcher m6 = p6.matcher("cab");
        while (m6.find()){
            System.out.print(m6.start()+" "+m6.group()+" ");
        }
        System.out.println(" ");

    }*/
    // Группа "запоминает себя. В этом случае группа найдёт ВСЁ от B до B"
    /*{ //https://youtu.be/qor0pSIKawk?t=1116
        Pattern p5 = Pattern.compile("<([A-Z][A-Z0-9]*)[^>]*>.*?</\\1>"); // группа (), где 1й символ БУКВА [] 2й и далее символ [] буква или цифра, до тех пор, пока не найдём >
        Matcher m5 = p5.matcher("Testing <B><I>bold italic</I></B> text");
        while (m5.find()){
            System.out.print(m5.start()+" "+m5.group()+" ");
        }
        System.out.println(" ");

    }*/
    // Нельзя обратиться из группы на группу!
    /*{
        Pattern p4 = Pattern.compile("([a-c])\\1)");
        Matcher m4 = p4.matcher("axaxa");
        while (m4.find()){
            System.out.print(m4.start()+" "+m4.group()+" ");
        }
        System.out.println(" ");

    }*/
    // На группу можно ссылаться много раз
    /*{ // https://youtu.be/qor0pSIKawk?t=1002
        Pattern p4 = Pattern.compile("([a-c])x\\1x\\1");
        Matcher m4 = p4.matcher("axaxa");
        while (m4.find()){
            System.out.print(m4.start()+" "+m4.group()+" ");
        }
        System.out.println(" ");
    }*/
    // Группы - в скобках ()
    /*{ // https://youtu.be/qor0pSIKawk?t=870
        Pattern p3 = Pattern.compile("<([A-Z][A-Z0-9]*)[^>]*>.*?</\\1>"); // группа (), где 1й символ БУКВА [] 2й и далее символ [] буква или цифра, до тех пор, пока не найдём >
        Matcher m3 = p3.matcher("This is a <EM>first</EM> test");
        while (m3.find()) {
            System.out.print(m3.start() + " " + m3.group() + " ");
        }
        System.out.println("");
    }*/
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
