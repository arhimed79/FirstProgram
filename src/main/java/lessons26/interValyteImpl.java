package lessons26;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import lombok.SneakyThrows;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class interValyteImpl implements InterValute {

    private Map<String, BigDecimal> mappingValutes = Collections.emptyMap();
    private Map<String, String> mappingValutesName = Collections.emptyMap();

    @SneakyThrows
    @PostConstruct
    void init() {
        final DocumentContext documentContext = JsonPath.parse(new URL("https://www.cbr-xml-daily.ru/daily_json.js"));
        final List<Map<String, Object>> val = documentContext.read("$.Valute.*", List.class);
        mappingValutes = val.stream()
                .map(it -> Pair.of(it.get("CharCode").toString(), new BigDecimal(it.get("Value").toString())))
                .collect(Collectors.toMap(Pair::getLeft, Pair::getRight));
    }

    public Optional<BigDecimal> getCode(String code) {

        return Optional.ofNullable(mappingValutes.get(code));
    }


    @SneakyThrows
    @PostConstruct
    void init2() {
        final DocumentContext documentContext2 = JsonPath.parse(new URL("https://www.cbr-xml-daily.ru/daily_json.js"));
        final List<Map<String, String>> val2 = documentContext2.read("$.Valute.*", List.class);
        mappingValutesName = val2.stream()
                .map(it -> Pair.of(it.get("CharCode"), it.get("Name")))
                .collect(Collectors.toMap(Pair::getLeft, Pair::getRight));
    }


    public Optional<String> getName(String name) {

        return Optional.ofNullable(mappingValutesName.get(name));
    }

}
