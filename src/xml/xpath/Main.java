package xml.xpath;



import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;



public class Main {
   
/* XPath
Позволяет получать доступ к разным xml-элементам
Можно получать номера
значения
элементы
колличество элементов
по-простому пути.
Example:
   public static void main(String[] args) throws Exception {
   
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document = builder.parse("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\temp2.xml");
   
      XPathFactory xPathFactory = XPathFactory.newInstance();
      XPath xPath = xPathFactory.newXPath();
      NodeList list = (NodeList ) xPath.evaluate("/", document, XPathConstants.NODESET);
      Node node = ( Node ) xPath.evaluate("/", document, XPathConstants.NODE);
      int count = (( Number ) xPath.evaluate("/", document, XPathConstants.NUMBER)).intValue();
      System.out.println(xPath.evaluate("/", document)); // TimesNewRoman
      System.out.println(xPath.evaluate("/root[2]", document));//
      System.out.println(xPath.evaluate("count(/)", document)); // 1
      System.out.println(count); //
      
   }
   
*/
}

