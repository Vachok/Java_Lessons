import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
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
   
      InputStream inputStream = new FileInputStream(new File("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\smile.jpg")); // создаём Stream данных
      ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream); // делаем его image'м, а не обезличенными байтами
      ImageInputStream imageInputStream1 = ImageIO.createImageInputStream(new File"C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\smile.jpg"); // способ получения стрима 2
      reader.setInput(imageInputStream, true); // передаём его ридеру (ImageRWLesson.java:27 - задаём формат, который он должен читать)
      BufferedImage image1 = reader.read(reader.getNumImages(true)); // читаем. тут кол-во картинок
   }
}
// at 09.01.2018 (13:50)