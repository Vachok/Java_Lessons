package xml.create.sax;



import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileOutputStream;



public class Main {
   
   public static void main(String[] args) throws Exception {
      
      XMLOutputFactory factory = XMLOutputFactory.newFactory();
      XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream("temp2.xml"));
      writer.writeStartDocument();
      writer.writeStartElement("root");
      writer.writeStartElement("font");
      writer.writeAttribute("size", "20");
      writer.writeCharacters("TimesNewRoman");
      writer.writeEndElement();
      writer.writeEndElement();
      writer.writeEndDocument(); // https://goo.gl/xR3LPW
   }
}
// at 25.01.2018 (15:43)