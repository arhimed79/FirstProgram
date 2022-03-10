package lessons26;

import java.math.BigDecimal;
import java.util.Optional;

public interface InterValute {
    Optional<BigDecimal> getCode (String code);
    Optional<String> getName (String name);
}
