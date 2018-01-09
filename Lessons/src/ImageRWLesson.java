import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;



public class ImageRWLesson {
   
   public static void main(String[] args) throws IOException {
      
      File file = new File("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\smile.jpg");
      BufferedImage image = ImageIO.read(file);
      ImageIO.write(image, "png", new File("smile.png"));
      String[] exten = ImageIO.getReaderFileSuffixes();
      for(String str : exten){
         System.out.println(str);
      }
   
      ImageReader reader = null;
      Iterator<ImageReader> iterator = ImageIO.getImageReadersByFormatName("JPEG");
      if(iterator.hasNext()) reader = iterator.next();
   
      InputStream inputStream = new FileInputStream(new File("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\smile.jpg"));
      ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);
      ImageInputStream imageInputStream1 = ImageIO.createImageInputStream(new File"C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\smile.jpg");
      reader.setInput(imageInputStream, true);
      BufferedImage image1 = reader.read(reader.getNumImages(true));
   
      int count = reader.getNumThumbnails(0);
      BufferedImage image2 = reader.readThumbnail(0, count);
      System.out.println(reader.getHeight(0));
      reader.getWidth(0);
   
      ImageWriter writer = null;
      Iterator<ImageWriter> iterator1 = ImageIO.getImageWritersByFormatName("JPEG");
      if(iterator1.hasNext()) writer = iterator1.next();
   
      ImageOutputStream imageOutputStream = ImageIO.createImageOutputStream(new File("smile.jpg"));
      writer.setOutput(imageOutputStream);
   }
}
// at 09.01.2018 (13:50)