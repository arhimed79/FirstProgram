package lessons22;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;


class URIRunner {

    public static void main(String[] args) throws URISyntaxException, IOException, XPathExpressionException, ParserConfigurationException, SAXException {

        int nambeCity = getNum();
        String city = getCity(nambeCity);


        String fileOutput = "C:\\Users\\Сергей\\IdeaProjects\\FirstProgram\\src\\main\\resources\\weatherLessons22.xml";
        String fileKey = "C:\\Users\\Сергей\\IdeaProjects\\FirstProgram\\src\\main\\resources\\keyLessons22.txt";

        FileReader fileReader1 = new FileReader(fileKey);
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        String key = bufferedReader1.readLine();

        String htmlStream = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + key + "&units=metric&mode=xml";

        URL url1 = new URL(htmlStream);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(url1.openStream());
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutput);

        int count;
        byte[] b1 = new byte[1024];

        while ((count = bufferedInputStream.read(b1)) != -1) {

            fileOutputStream.write(b1, 0, count);
            System.out.println("-----------------");

        }
        bufferedInputStream.close();
        fileOutputStream.close();


        try {
            File inputStream1 = new File(fileOutput);
            DocumentBuilderFactory builderFactory1 = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder1 = builderFactory1.newDocumentBuilder();
            Document xmlDocument = builder1.parse(inputStream1);
            XPath xPath = XPathFactory.newInstance().newXPath();
            NodeList nodeList = (NodeList) xPath.compile("//temperature").evaluate(xmlDocument, XPathConstants.NODESET);

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Текущая температура в городе = "+city+ " = " + element.getAttribute("value"));
                }
            }
        } catch (ParserConfigurationException | XPathExpressionException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    //   ObjectMapper objectMapper = new ObjectMapper();
    //  JsonNode temp = objectMapper.readValue(fileOutput, JsonNode.class);
    //   System.out.println(temp.get("temp"));




    private static String getCity(int nambeCity) {
        return switch (nambeCity) {
            case (2) -> "Moskva";
            case (3) -> "Paris";
            case (4) -> "Ufa";
            case (5) -> "Samara";
            default -> "Kazan";
        };
    }


    private static int getNum() {
        System.out.println("""
                Введите цифру для выбора города, в котором вы хотите узнать текущую температуру\s
                где\s
                 1 - Казань\s
                 2 - Москва\s
                 3 - Париж\s
                 4 - Уфа\s
                 5 - Самара""");
        Scanner scanerData = new Scanner(System.in);
        int num;
        try {
            num = scanerData.nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели невверные данныые, " + scanerData + " по умолчанию будет присвоено = 1");
            return 1;
        }
        if (num < 1 || num > 5) {
            System.out.println("Вы ввели невверныые данныые, " + num + " по умолчанию будет присвоено = 1");
            return 1;
        }
        return num;

    }
}
