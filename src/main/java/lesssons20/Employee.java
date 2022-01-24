package lesssons20;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

@Data
@XmlType
@XmlAccessorType

public class Employee {
    @XmlElement(name = "Депортамент")
    private Department department;

   @XmlElement(name = "Должность")
    private Position position;

    public Employee(Department department, Position position) {

    }
}
