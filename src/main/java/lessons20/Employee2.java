package lessons20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@XmlAccessorType(XmlAccessType.FIELD)

public class Employee2 {

    private String ID;
    @XmlAttribute
    private String login;
    private String fullName;
    private Position position;
    private Department department;

}
