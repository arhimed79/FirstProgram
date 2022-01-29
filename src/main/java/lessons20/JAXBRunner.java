package lessons20;

import lombok.SneakyThrows;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXB;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JAXBRunner {

    private static final List<Department> DEPARTMENTS = List.of(new Department("писатель", "Питер"),
            new Department("поэт", "Пятигорск"),
            new Department("поэт", "Москва"),
            new Department("поэт", "Нью-Йорк"));

    private static final List<Position> POSITIONS = List.of(new Position("Сеньер", new BigDecimal(1200)),
            new Position("Директор", new BigDecimal(1000)),
            new Position("куражист", new BigDecimal(950)),
            new Position("великий ", new BigDecimal(800)),
            new Position("Граф- пупкин ", new BigDecimal(500)),
            new Position("Девелопер", new BigDecimal(1150)));

    private static int COUNTER = 1;

    @SneakyThrows
    public static void main(String[] args) {

        EmloyeeArray employees =
                new EmloyeeArray(List.of(
                        getEmployee("Пушкин А. С."),
                        getEmployee("Лермонтов М. Ю."),
                        getEmployee("Есенин С. А."),
                        getEmployee("Бродский И. А.")
                ));


        Path path = Paths.get("C:\\temp_Less18\\employee.xml");
        Path parPath = path.getParent();

        if (!parPath.toFile().exists()) {
            parPath.toFile().mkdirs();
        }

        JAXB.marshal(employees, path.toFile());
        Document doc = getDocument(path.toFile());
        Double avSalary = getAverageSalary(doc);
        System.out.println("Средняя зарплата " + avSalary);
        List<String> eList = searchEmployeMoreAvSalary(doc, avSalary);
        System.out.println("Список сотрудников со значением зарплаты выше средней " + eList);
    }

    @SneakyThrows
    private static Document getDocument(File file) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        return documentBuilder.parse(file);
    }

    private static Employee2 getEmployee(String fullName) {
        return new Employee2().setLogin("user" + COUNTER++)
                .setFullName(fullName)
                .setID(new Random().nextInt(100_000) + "")
                .setDepartment(DEPARTMENTS.get(new Random().nextInt(DEPARTMENTS.size())))
                .setPosition(POSITIONS.get(new Random().nextInt(POSITIONS.size())));
    }

    @SneakyThrows
    private static Double getAverageSalary(Document doc) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        return (Double) xPathFactory.newXPath().compile("sum(//position/salary) div count(//position)").evaluate(doc, XPathConstants.NUMBER);
    }

    @SneakyThrows
    private static List<String> searchEmployeMoreAvSalary(Document doc, double salary) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        NodeList nodeList = (NodeList) xPathFactory.newXPath().compile("//employee2s/position[salary > " + salary + "]/ancestor::employee2s/fullName/text()").evaluate(doc, XPathConstants.NODESET);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            result.add(nodeList.item(i).getNodeValue());
        }
        return result;
    }
}

