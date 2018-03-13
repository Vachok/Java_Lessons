import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;



public class Main245 {
   
   public static void main(String[] args) throws IOException, UnsupportedFlavorException {
      
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      StringSelection stringSelection = new StringSelection("674654654");
      clipboard.setContents(stringSelection, null);
      DataFlavor flavor = DataFlavor.stringFlavor;
      if(clipboard.isDataFlavorAvailable(flavor)) {
         System.out.println(clipboard.getData(flavor));
      }
   }
}
// at 15.01.2018 (15:23)