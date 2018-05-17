import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.File;
import java.io.IOException;



public class ImgFilterLesson {
   
   public static void main(String[] args) throws IOException {
   
      File file = new File("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\smile.jpg");
      BufferedImage image = ImageIO.read(file);
   
      BufferedImage imageFiltered = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
      AffineTransform affineTransform = AffineTransform.getRotateInstance(45, image.getWidth() / 2, image.getHeight() / 2);
      BufferedImageOp op = new AffineTransformOp(affineTransform, AffineTransformOp.TYPE_BILINEAR);
      op.filter(image, imageFiltered);
   
      ImageIO.write(imageFiltered, "png", new File("smiler.png"));
   }
}
// at 09.01.2018 (15:31)