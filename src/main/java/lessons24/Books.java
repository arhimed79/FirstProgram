package lessons24;

import com.opencsv.bean.CsvBindByName;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Books {
    @CsvBindByName(column = "ISBN")
    private String isbn;

    @CsvBindByName(column = "NameBook")
    private String nameBook;

    @CsvBindByName(column = "URL")
    private String url;

    @CsvBindByName(column = "PageCount")
    private Integer pageCount;

    @CsvBindByName(column = "Author")
    private String author;


}
