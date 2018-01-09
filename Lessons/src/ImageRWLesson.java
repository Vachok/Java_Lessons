import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class ImageRWLesson {
   
   public static void main(String[] args) throws IOException {
      
      File file = new File("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\smile.jpg");
      BufferedImage image = ImageIO.read(file);
      ImageIO.write(image, "png", new File("smile.png"));
      String[] exten = ImageIO.getReaderFileSuffixes();
      for(String str : exten){
         System.out.println(str);
      }
   }
}
// at 09.01.2018 (13:50)