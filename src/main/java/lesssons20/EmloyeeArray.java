package lesssons20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

import java.util.List;

@Data
@XmlRootElement(name = "Сотрудники")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmloyeeArray {

    @XmlElement(name = "Сотрудник")
    private List<Employee> employeeList;
}
