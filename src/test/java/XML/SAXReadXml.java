package XML;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/27 0027.
 */
public class SAXReadXml {
    public static void main(String[] args) throws org.xml.sax.SAXException {

        String filePath = "C:/newXml2.xml";
        File f = new File(filePath);

        //设置句柄
        DefaultHandler handler = new DefaultHandler() {
            //XML文档开始读取时触发
            public void startDocument() {
                System.out.println("---------XML start---------");
            }
            //XML文档读取结束时触发
            public void endDocument() {
                System.out.println("---------XML over---------");
            }
            //读取到某一元素时触发
            public void startElement(String qname) {
                System.out.println("Node start：" + qname);

            }
            //某一元素结束时触发
            public void endElement(String qname) {
                System.out.println("Node end：" + qname);
            }
            //读取元素值时触发
            public void characters(char[] ch, int start, int length) {
                String s = new String(ch, start, length);
                if (!s.isEmpty() && s.trim().length() > 0) {
                    System.out.println("nodeContent：" + s);
                }
            }
        };

        //使用SAX解析XML
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setNamespaceAware(false);
        try {
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(f, handler);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
