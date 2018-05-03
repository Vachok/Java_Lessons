package xml.three.create.dom;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;

import javax.xml.crypto.dsig.Transform;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Element root = document.createElement("root");
        Element font = document.createElement("font");
        Text text = document.createTextNode("TimesNewRoman");
        document.appendChild(root);
        root.appendChild(font);
        font.appendChild(text);
        font.setAttribute("size", "20");
        // https://goo.gl/GJxmkF создание документа в памяти

/*      1 способ сохранения https://goo.gl/rxi9i1
Transformer t = TransformerFactory.newInstance().newTransformer();
t.setOutputProperty(OutputKeys.INDENT, "yes");
t.transform(new DOMSource(document), new StreamResult(new FileOutputStream("temp.xml")));*/
//     2 способ - вывод в строку https://goo.gl/iVNmuW
        DOMImplementation implementation = document.getImplementation();
        DOMImplementationLS implementationLS = (DOMImplementationLS) implementation.getFeature("LS", "3.0");
        LSSerializer serializer = implementationLS.createLSSerializer();
        serializer.getDomConfig().setParameter("format-pretty-print", true);
        String str = serializer.writeToString(document);
//System.out.println(str);

        LSOutput out = implementationLS.createLSOutput();
        out.setEncoding("UTF-8");
        out.setByteStream(Files.newOutputStream(Paths.get("temp.xml")));
        serializer.write(document, out); // https://goo.gl/Pa5jDA
    }
}
