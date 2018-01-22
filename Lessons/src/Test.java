import java.util.Date;



public class Test { //https://youtu.be/pHvN5nykk_c?t=17m10s
   
   public static void main(String[] args) {
      
      System.out.println("test");
      new Date().getDate(); // https://youtu.be/pHvN5nykk_c?t=1426
   }
}

/*
C:\Users\ikudryashov.EATMEAT\IdeaProjects\Java_Lessons\Lessons\src>javac -Xlint:al
      l Test.java
      Test.java:9: warning: [deprecation] getDate() in Date has been deprecated
      new Date().getDate(); // https://youtu.be/pHvN5nykk_c?t=1426
      ^
      1 warning
*/


/*Вывод результата в лог, средствами ОСи
Microsoft Windows [Version 10.0.16251.0]
(c) 2017 Microsoft Corporation. All rights reserved.

C:\Users\ikudryashov.EATMEAT\IdeaProjects\Java_Lessons>cd src
The system cannot find the path specified.

C:\Users\ikudryashov.EATMEAT\IdeaProjects\Java_Lessons>dir
 Volume in drive C has no label.
 Volume Serial Number is 16CC-4791

 Directory of C:\Users\ikudryashov.EATMEAT\IdeaProjects\Java_Lessons

22.01.2018  11:56    <DIR>          .
22.01.2018  11:56    <DIR>          ..
29.12.2017  14:13               355 .gitignore
22.01.2018  12:00    <DIR>          .idea
22.01.2018  11:56                93 ingest.log
29.12.2017  16:23               242 installed.txt
19.01.2018  12:26    <DIR>          Lessons
25.12.2017  10:42    <DIR>          out
07.12.2017  15:43    <DIR>          temp
               3 File(s)            690 bytes
               6 Dir(s)  54 808 018 944 bytes free

C:\Users\ikudryashov.EATMEAT\IdeaProjects\Java_Lessons>cd Lessons

C:\Users\ikudryashov.EATMEAT\IdeaProjects\Java_Lessons\Lessons>cd src

C:\Users\ikudryashov.EATMEAT\IdeaProjects\Java_Lessons\Lessons\src>javac Test.java


C:\Users\ikudryashov.EATMEAT\IdeaProjects\Java_Lessons\Lessons\src>java Test.class

Error: Could not find or load main class Test.class
Caused by: java.lang.ClassNotFoundException: Test.class

C:\Users\ikudryashov.EATMEAT\IdeaProjects\Java_Lessons\Lessons\src>java Test
test

C:\Users\ikudryashov.EATMEAT\IdeaProjects\Java_Lessons\Lessons\src>java Test > tes
t.log

C:\Users\ikudryashov.EATMEAT\IdeaProjects\Java_Lessons\Lessons\src>

* */
// at 22.01.2018 (11:59)