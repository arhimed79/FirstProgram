package lesssons20;

import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    @XmlAttribute
    private String position;
    @XmlAttribute
    private BigDecimal salary;
}
