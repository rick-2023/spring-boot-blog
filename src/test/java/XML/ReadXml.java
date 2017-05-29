package XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/27 0027.
 */
public class ReadXml {
    public static void main(String[] args) {
        try {
            //1获取DOM 解析器的工厂实例。
            DocumentBuilderFactory factory  = DocumentBuilderFactory.newInstance();
            //2获得具体的DOM解析器。
            DocumentBuilder builder = factory.newDocumentBuilder();

            //3获取文件
            Document document = builder.parse(new File("c:/newXml2.xml"));

            //4获取根元素
            Element root = document.getDocumentElement();

            //5。获取根节点[有多个节点]
            NodeList list = root.getElementsByTagName("order");

            for (int i = 0; i < list.getLength(); i++) {

                System.out.println("---------------");
                Element order =  (Element) list.item(i);

                //获取子节点集合
                NodeList clist = order.getChildNodes();
                for (int j = 0; j < clist.getLength(); j++) {
                    //获取下标
                    Node c = clist.item(j);
                    //把空格删除[获取属性名和值]
                    if (c instanceof Element) {
                        System.out.println(c.getNodeName()+"="+c.getTextContent());
                    }
                }
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
