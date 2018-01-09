import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class ImgFilterLesson {
   
   public static void main(String[] args) throws IOException {
      
      File file = new File("smile.jpg");
      BufferedImage image = ImageIO.read(file);
      
      
      ImageIO.write(imageFiltered, "png", new File("smiler.png"))
   }
}
// at 09.01.2018 (15:31)