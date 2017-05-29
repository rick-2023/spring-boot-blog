package XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by Administrator on 2017/5/27 0027.
 */
public class CreateXml2 {
    public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException, TransformerException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse("c:/newXml.xml");

        Element root = doc.getDocumentElement();
        System.out.println(root);

        Element order = doc.createElement("order");
        Element customer = doc.createElement("customer");
        Element address = doc.createElement("address");
        Element city = doc.createElement("city");
        Element postcode = doc.createElement("postcode");

        customer.setTextContent("李雷");
        address.setTextContent("临安区青山湖街道胜联路");
        city.setTextContent("杭州");
        postcode.setTextContent("311305");

        //添加节点之间的关系

        order.appendChild(customer);
        order.appendChild(address);
        order.appendChild(city);
        order.appendChild(postcode);
        root.appendChild(order);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty("encoding", "UTF-8");

        Writer writer = new StringWriter();
        transformer.transform(new DOMSource(doc), new StreamResult(writer));
        System.out.println(writer.toString());

        transformer.transform(new DOMSource(doc), new StreamResult(new File("c:/newXml2.xml")));
    }
    }