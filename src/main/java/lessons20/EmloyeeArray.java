package lessons20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@XmlRootElement(name = "Сотрудники")
@XmlAccessorType(XmlAccessType.FIELD)

public class EmloyeeArray {

    @XmlElement(name = "Сотрудник")
    private List<Employee2> employee2s;


}
