package regex.bukva;
// https://regexone.com/
// https://regexr.com/


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bukva {

    public static void main(String[] args) {
        Pattern p4 = Pattern.compile("cat");
        Matcher m4 = p4.matcher("He is a rocketcatfish oioi cat mat.");
        while (m4.find()) {
            System.out.println(m4.start() + " " + m4.group() + " ");
        }
    }

    // регулярка ищет вхождения, независимо отделено оно пробелами или нет
    /*{
        Pattern p4 = Pattern.compile("cat");
        Matcher m4 = p4.matcher("He is a rocketcatfish oioi cat mat.");
        while (m4.find()){
            System.out.println(m4.start()+" "+m4.group()+" ");
        }

        14 cat
        27 cat
        Process finished with exit code 0
    }*/
    // Использование дословных выражений
    /*{
        Pattern p3 = Pattern.compile("1+1=2");
        Pattern p2 = Pattern.compile("1\\+1=2");
        Pattern p1 = Pattern.compile("\\Q1+1=2\\E");
        Matcher m3 = p3.matcher("1+1=2");
        Matcher m2 = p2.matcher("1+1=2");
        Matcher m1 = p1.matcher("1+1=2");
        while (m1.find()){
            System.out.println(m1.start()+" "+m1.group()+ " ");
        }
        System.out.println("p3 - Не будет работать! + это метасимвол");
        System.out.println("p2 - отделяет + экраном \\");
        System.out.println("p1 - Между \\Q и \\E - дословное выражение!");


    }*/
    // поиск слова
    /*{
        Pattern p = Pattern.compile("pidor");
        Matcher m = p.matcher("Who am I? Pidor? NOT pidor!");
        while (m.find()){
            System.out.println(m.start() + " "+ m.group()+ " ");
        }
        System.out.println("\n Вывод в консоль слова 'pidor' и её номера в строке ");

    }*/

    // поиск конкретной буквы
    /*{

        Pattern p = Pattern.compile("p");
        Matcher m = p.matcher("Who am I? pidor? NOT pidor!");
        while (m.find()){
            System.out.println(m.start() + " "+ m.group()+ " ");
        }
        System.out.println("\n Вывод в консоль буквы 'p' и её номера в строке ");
    }*/
}
