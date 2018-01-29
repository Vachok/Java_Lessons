package xml.two.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newInstance(); // получаем фактори
        XMLStreamReader parser2 = factory.createXMLStreamReader(new FileInputStream("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\vcs.xml")); // получаем парсер
        while (parser2.hasNext()) { // если есть следующий элемент (событие)
            int event = parser2.next(); // если событие есть
            if (event == XMLStreamConstants.START_ELEMENT) { // при старте
                System.out.println(parser2.getLocalName()); // показать имя https://goo.gl/TrX5kY
            }
/*            if(event == XMLStreamConstants.CHARACTERS){ // если есть символы
                System.out.println(parser2.getLocalName()); // показать имя
            }*/
        }
    }
}

/*{ SAX

        DefaultHandler handler = new DefaultHandler(){
            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                String str = "";
                for (int i = 0; i <length ; i++) {
                    str += ch[start+i];
                }
                System.out.println(str);
            }
        };

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\vcs.xml"), handler);
    }*/

// https://goo.gl/32dmnC