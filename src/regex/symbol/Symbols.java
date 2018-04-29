package regex.symbol;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Symbols {

    public static void main(String[] args)
    // Заранее определённые классы символов(Predefined character classes)
    {
        Pattern p = Pattern.compile("\\d"); //[0-9]
        Pattern P = Pattern.compile("\\D");

        Pattern p1 = Pattern.compile("\\w"); //[a-zA-Z0-9 ]
        Pattern P1 = Pattern.compile("\\W");

        Pattern p2 = Pattern.compile("\\s"); //[ \t]
        Pattern P2 = Pattern.compile("\\S");

        Pattern P3 = Pattern.compile("\\S\\D");
        Pattern p3 = Pattern.compile("\\s\\d");

        Pattern p4 = Pattern.compile("[0-9]+");


        Matcher m = p.matcher("Любая ц4ифра");
        Matcher M = P.matcher("Любая не ц4ифра");

        Matcher m1 = p1.matcher("fg4fd");
        Matcher M1 = P1.matcher("fg4fd 3");

        Matcher m2 = p2.matcher("fsfds fsf");
        Matcher M2 = P2.matcher("fsfds fsf");

        Matcher m3 = p3.matcher("fsfds fsf");
        Matcher M3 = P3.matcher("fsfds fsf");

        Matcher m4 = p4.matcher("fsfds 321 fsf");

        while (m.find()) {
            System.out.print(m.start() + " " + m.group() + " =");
            System.out.println("цифровые значения\n");
            while (M.find()) {
                System.out.print(M.start() + " " + M.group() + " =");
                System.out.println("не цифровые значения");
            }
        }
        System.out.println("---------------------");
        while (m1.find()) {
            System.out.print(m1.start() + " " + m1.group() + " =");
            System.out.println("Любой лат. символ, не пробел и не ТАБ");
            while (M1.find()) {
                System.out.print(M1.start() + " " + M1.group() + " =");
                System.out.println("НЕ лат. символ, не пробел и не ТАБ");
            }
        }
        System.out.println("---------------------");
        while (m2.find()) {
            System.out.print(m2.start() + " " + m2.group() + " =");
            System.out.println("пробел или TAB");
            while (M2.find()) {
                System.out.print(M2.start() + " " + M2.group() + " =");
                System.out.println("НЕ пробел или TAB");
            }
        }
        System.out.println("---------------------");
        while (m3.find()) {
            System.out.print(m3.start() + " " + m3.group() + " =");
            System.out.println("пробел или TAB");
            while (M3.find()) {
                System.out.print(M3.start() + " " + M3.group() + " =");
                System.out.println("НЕ пробел или TAB");
            }
        }
        System.out.println("---------------------");
        while (m4.find()) {
            System.out.print(m4.start() + " " + m4.group() + " =");
            System.out.println("ищет цифры. которых может быть больше одной");

        }
    }
    // Паттерны [\\x] [x^] [^]x] [-x] [x-] [\Q[-]\E]
    /*{
        Pattern p = Pattern.compile("[x^]");
        Pattern p1 = Pattern.compile("[]x]");
        Pattern p2 = Pattern.compile("[-x]");
        Pattern p3 = Pattern.compile("[x-]");
        Pattern p4 = Pattern.compile("[\\\\x]");
        Pattern p5 = Pattern.compile("[\\Q[-]\\E]");
        String s = "^";
        String s1 = "]";
        String s2 = "-";
        String s3 = "-";
        String s4 = "\\";
        String s5 = "]";
        Matcher m5 = p5.matcher(s5);
        Matcher m4 = p4.matcher(s4);
        Matcher m3 = p3.matcher(s3);
        Matcher m2 = p2.matcher(s2);
        Matcher m1 = p1.matcher(s1);
        Matcher m = p.matcher(s);
        System.out.println("---------------------");
        while (m.find()) {
            System.out.print(m.start() + " " + m.group() + " \n");
            System.out.println("Pattern p ^ - только вначале. В других случаях он будет просто ^");
        }
        System.out.println("---------------------");
        while (m1.find()) {
            System.out.print(m1.start() + " " + m1.group() + " \n");
            System.out.println("Pattern p1 - ищет ] или х. ] - метасимвол при закрытии");
        }
        System.out.println("---------------------");
        while ((m2.find()) && (m3.find())) {
            System.out.print(m2.start() + " " + m2.group() + " \n");
            System.out.print(m3.start() + " " + m3.group() + " \n");
            System.out.println("Pattern p2 и p3 - ищет - или х. - - метасимвол при обрамлении символами");
        }
        System.out.println("---------------------");
        while (m4.find()) {
            System.out.print(m4.start() + " " + m4.group() + " \n");
            System.out.println("Pattern p4 - ищет \\ или х. \\ - конкретно в Java нужно экранировать дополнительным \\. А если его надо найти через Pattern, нужно ставить 4 слеша! \\\\\\\\");
        }
        System.out.println("---------------------");
        while (m5.find()) {
            System.out.print(m5.start() + " " + m5.group() + " \n");
            System.out.println("Pattern p5 - ищет [ или - или ]. \\Q и \\E - означают точное вхождение");
        }
        System.out.println("---------------------");
    }*/

}
// Символ ^
    /*{
        Pattern p = Pattern.compile("q[^u]");
        String s = "Iraqu is a country";
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.print(m.start() + " " + m.group() + " \n");
            System.out.println("\nНа выходе не будет ничего. Символ ^ - это отрицание.");
        }
    }*/
// Метасимволы в [] отличаются от обычныйх
    /*{
        Pattern p = Pattern.compile("[+]");

        String s = "1 + 1 = 2";
        Matcher m = p.matcher(s);
        while (m.find()){
            System.out.print(m.start()+ " "+ m.group()+ " \n");
        }
        // /\^-

        System.err.println("\nДля квадратных скобок, метасимволы - это /\\^-");
    }*/
// Поиск вариантов
    /*{
        Pattern p = Pattern.compile("gr[ae]y");
        Matcher m = p.matcher("gray");
        while (m.find()){
            System.out.print(m.start()+ " "+ m.group()+ " ");
        }
        System.out.println("\nВ этом примере ищется слово gray в 2х вариантах написания. с буквой a или е");
    }*/

// Пример поиска вхождений одного символа в строке
    /*{
        Pattern p = Pattern.compile("[0-5a-cS]");
        Matcher m = p.matcher("abcde39cjghS");
        while (m.find()){
            System.out.print(m.start()+ " "+ m.group()+ " ");
        }

        System.out.println("\nПример поиска вхождения символов от a до c, большой S, и цифр от 0 до 5. [] - это соотв. одному символу. \n" +
                "Вывод будет https://goo.gl/Hm8nir \n Позиция Буква");
    }*/
