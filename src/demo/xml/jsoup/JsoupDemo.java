package demo.xml.jsoup;


import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * Jsoup快速入门
 */
public class JsoupDemo {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        //2.获取Document对象，根据xml文档获取
        //2.1获取student.xml的path
        String path = JsoupDemo.class.getClassLoader().getResource("demo/student.xml").getPath();
        //2.2解析xml文档，加载文档进内存，获取dom树--->Document
        Document document = Jsoup.parse(new File(path), "utf-8");
        System.out.println(document);
        //3.获取元素对象 Element
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements);

        System.out.println(elements.size());
        //3.1获取第一个name的Element对象
        Element firstElement = elements.first();
        //3.2获取数据
        String firstName = firstElement.text();
        System.out.println(firstName);
        //3.3遍历
        for (Element element : elements) {
            //获取数据
            String name = element.text();
            System.out.println(name);
        }
        System.out.println("elements--------------------------------------------");

        //3.获取元素对象
        //3.1获取所有student对象
        Elements elements0 = document.getElementsByTag("student");
        System.out.println(elements0);
        System.out.println("elements0--------------------------------------------");

        //3.2 获取属性名为id的元素对象们
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);
        System.out.println("elements1--------------------------------------------");

        //3.2获取 number属性值为heima_0001的元素对象
        Elements elements2 = document.getElementsByAttributeValue("number", "heima_0001");
        System.out.println(elements2);
        System.out.println("elements2--------------------------------------------");

        //3.3获取id属性值的元素对象
        Element itcast = document.getElementById("itcast");
        System.out.println(itcast);
        System.out.println("itcast--------------------------------------------");

        /*
        Element：元素对象
				1. 获取子元素对象
					* getElementById​(String id)：根据id属性值获取唯一的element对象
					* getElementsByTag​(String tagName)：根据标签名称获取元素对象集合
					* getElementsByAttribute​(String key)：根据属性名称获取元素对象集合
					* getElementsByAttributeValue​(String key, String value)：根据对应的属性名和属性值获取元素对象集合

				2. 获取属性值
					* String attr(String key)：根据属性名称获取属性值
				3. 获取文本内容
					* String text():获取所有字标签的纯文本内容
					* String html():获取标签体的所有内容(包括子标签的标签和文本内容)




         */
        //通过Document对象获取name标签，获取所有的name标签，可以获取到两个
        System.out.println(elements.size());
        System.out.println("--------------------------------------------");
        //通过Element对象获取子标签对象
        Element element_student = document.getElementsByTag("student").first();
        Elements ele_name = element_student.getElementsByTag("name");
        System.out.println(ele_name.size());

        //获取student对象的属性值
        String number = element_student.attr("NUMBER");
        System.out.println(number);
        System.out.println("--------------------------------------------");
        //获取文本内容
        String text = ele_name.text();
        String html = ele_name.html();
        System.out.println(text);
        System.out.println(html);

        //3.选择器查询name标签
        Elements elements3 = document.select("name");
        System.out.println(elements3);
        System.out.println("elements3--------------------------------------------");

        //4.查询id值为itcast的元素
        Elements elements4 = document.select("#itcast");
        System.out.println(elements4);
        System.out.println("elements4--------------------------------------------");

        //5.获取student标签并且number属性值为heima_0001的age子标签
        //5.1.获取student标签并且number属性值为heima_0001
        Elements elements5 = document.select("student[number=\"heima_0001\"]");
        System.out.println(elements5);
        System.out.println("elements5--------------------------------------------");

        //5.2获取student标签并且number属性值为heima_0001的age子标签
        Elements elements6 = document.select("student[number=\"heima_0001\"] > age");
        System.out.println(elements6);
        System.out.println("elements6--------------------------------------------");

        //2.parse​(String html)：解析xml或html字符串
//        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
//                "\n" +
//                "<students>\n" +
//                "\t<student number=\"heima_0001\">\n" +
//                "\t\t<name>tom</name>\n" +
//                "\t\t<age>18</age>\n" +
//                "\t\t<sex>male</sex>\n" +
//                "\t</student>\n" +
//                "\t<student number=\"heima_0002\">\n" +
//                "\t\t<name>jack</name>\n" +
//                "\t\t<age>18</age>\n" +
//                "\t\t<sex>female</sex>\n" +
//                "\t</student>\n" +
//                "\n" +
//                "</students>";
//        Document document1 = Jsoup.parse(str);
//        System.out.println(document1);

        //3.parse​(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象
//        URL url = new URL("https://baike.baidu.com/item/jsoup/9012509?fr=aladdin");//代表网络中的一个资源路径
//        Document document2 = Jsoup.parse(url, 10000);
//        System.out.println(document2);
        //3.根据document对象，创建JXDocument对象

        JXDocument jxDocument = new JXDocument(document);
        //4.结合xpath语法查询
        //4.1查询所有student标签
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }

        System.out.println("jxNodes--------------------------------------------");

        //4.2查询所有student标签下的name标签
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name");
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);
        }

        System.out.println("jxNodes2--------------------------------------------");

        //4.3查询student标签下带有id属性的name标签
        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode : jxNodes3) {
            System.out.println(jxNode);
        }
        System.out.println("jxNodes3--------------------------------------------");

        //4.4查询student标签下带有id属性的name标签 并且id属性值为itcast
        List<JXNode> jxNodes4 = jxDocument.selN("//student/name[@id='itcast']");
        for (JXNode jxNode : jxNodes4) {
            System.out.println(jxNode);
        }
        System.out.println("jxNodes4--------------------------------------------");

    }

}
