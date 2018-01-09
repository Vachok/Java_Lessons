import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;



public class ImgRaiserLesson {
   
   public static void main(String[] args) throws IOException {
      
      File file = new File("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\smile.jpg");
      BufferedImage image = ImageIO.read(file);
   
      WritableRaster raster = image.getRaster();
      for(int i = 0;i < raster.getHeight();i++){
         int[] pixel = raster.getPixel(i, 0, new int[4]);
         pixel[0] = 255;
         raster.setPixel(i, 0, pixel);
      }
      image.setData(raster);
      ImageIO.write(image, "png", new File("smiler.png"));
   }
}
// at 09.01.2018 (14:51)