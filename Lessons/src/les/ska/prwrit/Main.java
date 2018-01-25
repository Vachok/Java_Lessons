package les.ska.prwrit;



import java.io.*;
import java.util.Scanner;



public class Main {
   
   public static void main(String[] args) throws IOException {
      
      try(Scanner scanner = new Scanner(new FileReader("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\temp.txt"))){
         while(scanner.hasNext()){
            System.out.println(scanner.next());
         }
      } // https://goo.gl/Zejosv
      
      try(PrintWriter bufferedWriter = new PrintWriter(new FileWriter("temp.txt"))){
         bufferedWriter.write("str1");
         bufferedWriter.write("\n");
         bufferedWriter.write("str2");
      }
//      Scanner bufferedInputStream = new Scanner(new FileInputStream("temp.txt"));
//      PrintWriter bufferedOutputStream = new PrintWriter(new FileOutputStream("temp.txt"));
   
   }
}
// at 25.01.2018 (9:51)