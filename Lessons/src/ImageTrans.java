import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;



public class ImageTrans implements Transferable {
   
   private Image theImage;
   public ImageTrans(Image image) {
      
      theImage = image;
   }
   @Override
   public DataFlavor[] getTransferDataFlavors() {
      
      return new DataFlavor[]{DataFlavor.imageFlavor};
   }
   @Override
   public boolean isDataFlavorSupported(DataFlavor flavor) {
      
      return flavor.equals(DataFlavor.imageFlavor);
   }
   @Override
   public Object getTransferData(DataFlavor flavor) {
      
      throws UnsupportedFlavorException;
      if(flavor.equals(DataFlavor.imageFlavor)) {
         return theImage;
      }
      else{
         throw new UnsupportedFlavorException(flavor);
      }
   }
}
// at 15.01.2018 (16:39)