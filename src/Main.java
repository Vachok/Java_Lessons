/* 61.46-Serializ
import java.io.*;

public class Main {
    public static void main( String[] args ) throws Exception {
        User user = new User();
        user.lifeLevel = 55;
        User.staticField = 45;
        Sword sword = new Sword();
        sword.level = 5;
        user.sword = sword;

        FileOutputStream fileOutputStream = new FileOutputStream("tempfile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        User.staticField = 35;

        FileInputStream fileInputStream = new FileInputStream("tempfile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User newUser = (User) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newUser.lifeLevel);
        System.out.println(User.staticField);
        System.out.println(newUser.sword);
=======
/*60-45.files_directories
import java.io.*;

public class Main {
    public static void main( String[] args ) throws Exception {
        File file = new File("temp.txt");
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("exists");
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("1\n");
        fileWriter.write("2\n");
        fileWriter.flush();

        FileReader fileReader = new FileReader(file);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("str3");
        bufferedWriter.newLine();
        bufferedWriter.write("str4");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
/*53.42-Exception
import java.io.File;
import java.io.IOException;

public class Main {
/*46.36-methodMainandHisProps
    public static void main( String[] myArgs ) {
        for (String s : myArgs) { 
            System.out.println(s);

45.35-operatory_JAVA
    }
}
+ - / *
%  остаток деления
< > <= >=
== != reference сравнение
instanceof для ссылок
string + переопределён для класса String
++ -- увеличивает/уменьшает на 1
?:  проверка правда/ложь
& | ^ ! && || и/или
 */
/* Java_Lessons-44 Java 34: Garbage Collector
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public static void main( String[] myArgs ) {
        int i = 10;
        switch (i) {
            case 1:
                System.out.println(1);
            default:
                System.out.println("default"); //не обязательно последний
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);
        }
        static Main main;

    public static void main( String[] args ) {
/*55.44-StringBuilder
        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append("def");
        stringBuilder.insert(0 , "-");
        int i = stringBuilder.length();
        System.out.println(i);
/*54.43-Assertions
        new Main().myMethod(-5);
    }

    private void myMethod( int a ) {
        assert (a > 0);
        System.out.println(a);
/*52.40-for_enchanced
        int[] arr = {1 , 2 , 3};
        int i = 0;
        for (System.out.println("hello this is first state"); i < arr.length; i++)
            System.out.println(arr[i]);
/*51.39-Cycles_whileDowhile
        int[] arr = {1 , 2 , 3};
        int i = 0;
        while (i == 5) {
            System.out.println(arr[i]);
            i++;
        }
        i = 0;
        do
            System.out.println("do");
        while (false);
/*47.37-if_else
        int a = 6;
        int b = 6;
        int c = 4;
        int d = 5;
        if (a == b) {
            if (c == d) {
                System.out.println("a > b");
            }
        } if(false) {
        } else
            System.out.println("bla");
        method();
    }

    private static void method() {
        Main main = new Main();
        Main main2 = new Main();
        main = null;
        main2 = null;
        System.gc();
    }

    @Override
    public void finalize() {
        Main.main = this;
    }

    void meMethod() {
        /*chk
        throw new Throwable();
        throw new Exception();
        throw new IOException();
//////////|||||||||||||||||||||||||||||||||||||||\\
        /*UNchk
        throw new Error();
        throw new RuntimeException();
         */
//    }
//}



/* Иерархия Exceptions
1. Throwable
    2. Error - не нужно ловить! Это риторические проблемы - сами придут.
    2. Exception -
        3. RuntimeException - это "ошибки программирования" (unchk)
        3. IO (chk)
            3.1 Если работаем с "чужими" - нужно помещать в try/catch.
            3.2 Если пишем сами, для других прогеров. https://youtu.be/mLpMtc62530?t=39m25s
        3 ....можно добавить свои подклассы

 */
