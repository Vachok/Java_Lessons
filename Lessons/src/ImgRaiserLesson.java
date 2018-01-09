import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;



public class ImgRaiserLesson {
   
   public static void main(String[] args) throws IOException {
      
      File file = new File("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\smile.jpg");
      BufferedImage image = ImageIO.read(file);
   
      WritableRaster raster = image.getRaster();
      for(int i = 0;i < raster.getHeight();i++){
         int[] pixel = raster.getPixel(i, 100, new int[4]);
         pixel[0] = 0;
         raster.setPixel(i, 100, pixel);
      }
      raster.getPixels(0, 0, image.getHeight(), image.getWidth(), new int[4 * image.getHeight() * image.getWidth()]);
      raster.setPixels(0, 0, image.getHeight(), image.getWidth(), new int[4 * image.getHeight() * image.getWidth()]);
   
      Object data = raster.getDataElements(0, 0, null); // пиксель, который мы читаем
      ColorModel colorModel = image.getColorModel(); // получить цветовую модель
      Color color = new Color(colorModel.getRGB(data), true);
      raster.setDataElements(0, 0, data); // записать
      
      image.setData(raster);
      ImageIO.write(image, "png", new File("smiler.png"));
   }
}
// at 09.01.2018 (14:51)