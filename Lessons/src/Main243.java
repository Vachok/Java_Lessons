import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;



public class Main243 {
   
   public static void main(String[] args) {
      
      DocFlavor flavor = DocFlavor.INPUT_STREAM.JPEG;
      PrintService[] services = PrintServiceLookup.lookupPrintServices(flavor, null)
   }
}
// at 09.01.2018 (16:34)