/*
package xml.one.dom;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("C:\\Users\\ikudryashov.EATMEAT\\IdeaProjects\\Java_Lessons\\vcs.xml"));
        Element element = document.getDocumentElement();
        printElements(element.getChildNodes(), 0);
    }

    static void printElements(NodeList nodeList, int tabs) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            NamedNodeMap attr = nodeList.item(i).getAttributes();
            for (int j = 0; j < attr.getLength(); j++) {
                Node attr = attr.item(j);
            }
        }
        static String getTab ( int tabs)
        String str = "";
        for (int i = 0; i < tabs; i++) {
            str += "\t";
        }
        return str;
    }
}

*/
/*
Есть классы Document, Element
они позволяют читать xml
Можно получить различные варианты , тэги,
значения и пр.

DOM - когда весь xml грузится в память.
* *//*


// https://goo.gl/vRk4YK Так можно пробежать по элементам с тэгом name
// https://goo.gl/sgYRFZ Вывод ВСЕХ тэгов xml
// https://goo.gl/6nnUuH Можно брать отдельные элементы, тэги
*/
