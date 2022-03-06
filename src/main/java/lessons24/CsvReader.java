package lessons24;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CsvReader {


    public static List<Books> getBook() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(CsvReader.class.getResourceAsStream("/books.csv")))) {
            CsvToBean csvToBean = new CsvToBeanBuilder(reader)
                    .withType(Books.class)
                    .withSeparator(';')
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            return (List<Books>) csvToBean.stream().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();

    }
}
