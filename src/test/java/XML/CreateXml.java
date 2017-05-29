package XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by Administrator on 2017/5/27 0027.
 */
public class CreateXml {

    public static void main(String[] args) throws TransformerException, ParserConfigurationException {
        createXMLFile();
    }

    public static void createXMLFile() throws ParserConfigurationException, TransformerException {
        Document doc;
        Element orderInfo, order, customer, address, city, postcode;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        doc = builder.newDocument();

        //创建节点
       /* orderInfo = doc.createElement("订单信息");
        order = doc.createElement("订单");
        customer = doc.createElement("购买人");
        address = doc.createElement("地址");
        city = doc.createElement("城市");
        postcode = doc.createElement("邮编");*/

       orderInfo = doc.createElement("orderInfo");
        order = doc.createElement("order");
        customer = doc.createElement("customer");
        address = doc.createElement("address");
        city = doc.createElement("city");
        postcode = doc.createElement("postcode");

        //添加节点内容
        customer.setTextContent("韩梅梅");
        address.setTextContent("江干区下沙高教园区2号大街1158号");
        city.setTextContent("杭州");
        postcode.setTextContent("310018");

        //添加节点之间的关系
        orderInfo.appendChild(order);
        order.appendChild(customer);
        order.appendChild(address);
        order.appendChild(city);
        order.appendChild(postcode);
        doc.appendChild(orderInfo);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty("encoding", "UTF-8");

        Writer writer = new StringWriter();
        transformer.transform(new DOMSource(doc), new StreamResult(writer));
        System.out.println(writer.toString());

        transformer.transform(new DOMSource(doc), new StreamResult(new File("c:/newXml.xml")));

    }
}