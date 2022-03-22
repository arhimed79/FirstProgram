package lessons30;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITY")
@Data
@NoArgsConstructor
public class CityDTO {
    @Id
    @Column(name = "CODE")
    private Integer code;

    @Column(name = "NAME_RU")
    private String nameRU;

    @Column(name = "NAME_EN")
    private String nameEN;

    @Column(name = "POPULATION")
    private Long population;

    public CityDTO(Integer code, String nameRU, String nameEN, Long population) {
        this.code = code;
        this.nameRU = nameRU;
        this.nameEN = nameEN;
        this.population = population;
    }
}
