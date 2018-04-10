package java9.trycat;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



public class Trycat {
   
   public static void main(String[] args) throws FileNotFoundException {
      
      OutputStream outputStream = new FileOutputStream("temp.txt");
      try(outputStream){
         outputStream.write('a');
      }
      catch(IOException e){
         e.printStackTrace();
      }
      
   }
}
