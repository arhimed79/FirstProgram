package lesssons20;

import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    @XmlAttribute
    private Integer ID;

    @XmlAttribute
    private String FIO;

    @XmlAttribute
    private String division;

    @XmlAttribute
    private String city;
}
