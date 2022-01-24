package lesssons20;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import lombok.SneakyThrows;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.Arrays;

public class JAXBRunner {
    public static void main(String[] args) throws Exception {

        Employee ivanov = new Employee(new Department(1, "Иванов И. И.", "стройка", "Казань"), new
                Position("прораб", new BigDecimal(800)));
        Employee pushkin = new Employee(new Department(2, "Пушкин А. С.", "Писатель", "Питер"), new
                Position("поэт", new BigDecimal(1200)));
        Employee lermontov = new Employee(new Department(3, "Лермонтов М. Ю.", "Писатель-Поэт", "Пятигорск"), new
                Position("поэт", new BigDecimal(1000)));
        Employee esenin = new Employee(new Department(4, "Есенин С. А.", "Писатель", "Москва"), new
                Position("поэт", new BigDecimal(950)));
        Employee brodski = new Employee(new Department(5, "Бродский И. А.>", "Поэт-Песенник", "Нью-Йорк"), new
                Position("поэт", new BigDecimal(1150)));

        EmloyeeArray emloyeeArray = new EmloyeeArray();
        emloyeeArray.setEmployeeList(Arrays.asList(ivanov, pushkin, lermontov, esenin, brodski));


        JAXBContext context = JAXBContext.newInstance(EmloyeeArray.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(emloyeeArray, stringWriter);
        String result = stringWriter.toString();
        System.out.println(result);

    }
}

