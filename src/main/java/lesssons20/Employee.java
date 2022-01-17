package lesssons20;

import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

@Data
@XmlType
@XmlAccessorType

public class Employee {

    private Department department;
    private Position position;

    public Employee(Department department, Position position) {

    }
}
