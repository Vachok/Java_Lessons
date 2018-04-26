import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.print.*;



public class Main242 {
   
   public static void main(String[] args) throws PrinterException {
      
      Printable printable = new Printable() {
         
         
         @Override
         public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
            
            if(pageIndex==0) {
               Graphics2D graphics2D = ( Graphics2D ) graphics;
               Line2D line2D = new Line2D.Double(0, 0, 100, 100);
               graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
               graphics2D.draw(line2D);
               return Printable.PAGE_EXISTS;
            }
            return Printable.NO_SUCH_PAGE;
         }
      };
      PrinterJob printerJob = PrinterJob.getPrinterJob();
      printerJob.setPrintable(printable);
      if(printerJob.printDialog()) {
         printerJob.print();
      }
   }
}
// at 09.01.2018 (16:17)