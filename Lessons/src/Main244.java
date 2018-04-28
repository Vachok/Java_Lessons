import javax.print.*;
import java.io.*;



public class Main244 {
   
   public static void main(String[] args) throws PrintException, FileNotFoundException {
      
      DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PRINTABLE;
      String mimeType = "application/postscript";
      StreamPrintServiceFactory[] factories = StreamPrintServiceFactory.lookupStreamPrintServiceFactories(flavor, mimeType);
      OutputStream outputStream = new FileOutputStream("PostService.odd");
      StreamPrintService streamPrintService = factories[0].getPrintService(outputStream);
      
      InputStream inputStream = new FileInputStream("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\Lessons\\Smile.jpg");
      DocPrintJob job = streamPrintService.createPrintJob();
      Doc doc = new SimpleDoc(inputStream, DocFlavor.INPUT_STREAM.JPEG, null);
      job.print(doc, null);
   }
}
// at 11.01.2018 (14:22)